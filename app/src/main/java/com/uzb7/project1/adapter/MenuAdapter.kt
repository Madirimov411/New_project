package com.uzb7.project1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.uzb7.project1.R
import com.uzb7.project1.model.Menu
import java.util.*

class MenuAdapter(val list: ArrayList<Menu>) :
    RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    var unit: ((Int) -> Unit)? = null

    class MenuViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name = view.findViewById<TextView>(R.id.foodName)
        val menu = view.findViewById<LinearLayout>(R.id.llMenu)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_menu, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val l = list[position]
        holder.name.text = l.name
        holder.menu.setOnClickListener {
            unit?.invoke(l.id)
        }
    }

    override fun getItemCount() = list.size
}