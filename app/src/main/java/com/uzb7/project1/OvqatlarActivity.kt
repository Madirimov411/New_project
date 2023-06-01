package com.uzb7.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uzb7.project1.databinding.ActivityMainBinding
import com.uzb7.project1.databinding.ActivityOvqatlarBinding
import com.uzb7.project1.model.Ovqatlar
import java.util.*

class OvqatlarActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOvqatlarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityOvqatlarBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {

    }

    private fun loadList(index:Int):ArrayList<Ovqatlar>{
        val myList=ArrayList<Ovqatlar>()

        return myList
    }
}