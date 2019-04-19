package com.shashankbhat.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context = this

        findIt.setOnClickListener {
            val year = year.text.toString().toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            if(year<currentYear){
                val age = currentYear - year
                printAge.text = "Your age is "+age
            }else{
                Toast.makeText(context,"Age cannot be more than Current Year!",Toast.LENGTH_SHORT).show()
            }
        }
    }
}
