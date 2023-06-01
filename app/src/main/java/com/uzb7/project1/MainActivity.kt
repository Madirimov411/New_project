package com.uzb7.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.uzb7.project1.adapter.MenuAdapter
import com.uzb7.project1.databinding.ActivityMainBinding

import com.uzb7.project1.model.Menu
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    lateinit var list: ArrayList<Menu>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initWiews()

    }

    private fun initWiews() {
        list=myList()
        val adapter= MenuAdapter(list)
        binding.rvMenu.adapter=adapter
        binding.rvMenu.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        /*adapter.unit={
            var i =Intent(this,OvqatlarActivity::class.java)
        }*/
    }

    private fun myList():ArrayList<Menu>{
        val myList=ArrayList<Menu>()
        myList.add(Menu(1,"Go'shtli taomlar"))
        myList.add(Menu(2,"Quyuq taomlar"))
        myList.add(Menu(3,"Go'shtli taomlar"))
        myList.add(Menu(4,"Quyuq taomlar"))
        myList.add(Menu(5,"Go'shtli taomlar"))
        myList.add(Menu(6,"Quyuq taomlar"))
        myList.add(Menu(7,"Go'shtli taomlar"))
        myList.add(Menu(8,"Quyuq taomlar"))


        return myList
    }
}

















