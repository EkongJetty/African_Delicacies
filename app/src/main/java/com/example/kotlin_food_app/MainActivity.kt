package com.example.kotlin_food_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_YES
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin_food_app.foodData.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val switch: Switch = findViewById(R.id.theme)

        switch.setOnCheckedChangeListener{buttonView,isChecked ->
            if (isChecked){
                AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_YES)
                }else{
                    AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)

            }
        }

        val myDataset = DataSource().loadDeclaration()
        val recyclerView=findViewById<RecyclerView>(R.id.RecyclerView)
        recyclerView.adapter = ItemAdapter(this,myDataset)
      //  recyclerView.setHasFixedSize(true)


    }
}