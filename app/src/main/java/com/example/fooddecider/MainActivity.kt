package com.example.fooddecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    val foodlist= arrayListOf<String>("Golpo")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        deciderbtn.setOnClickListener{
            val random= Random
            val randomfood= random.nextInt(foodlist.count())
            selectedtv.text=foodlist[randomfood]
        }

        btnaddfood.setOnClickListener{
            val newfood= etaddfoodname.text.toString()
            foodlist.add(newfood)
            etaddfoodname.text.clear()
            println(foodlist)
        }

    }
}


