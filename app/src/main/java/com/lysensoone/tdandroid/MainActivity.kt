package com.lysensoone.tdandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var items = Array<AndVersion>(10, {AndVersion()})

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seedItems()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AndVersionAdapter(items)
    }

    fun seedItems(){
        val nameArray = resources.getStringArray(R.array.name)
        val numArray = resources.getStringArray(R.array.verNum)
        val imgArray = intArrayOf(R.drawable.cupcake, R.drawable.donut, R.drawable.eclair)
        for(i in 0..nameArray.size - 1)
        {
            items[i] = AndVersion(nameArray[i], numArray[i], imgArray[i])
        }
    }
}