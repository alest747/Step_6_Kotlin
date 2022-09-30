package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
private lateinit var tvInfo:TextView  //приватная переменная с задержкой нашего TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val message = intent.getStringExtra("key")  //создаем переменную и помещаем в нее информацию с предыдущего активити, key это ключ для получения информации
        tvInfo = findViewById(R.id.tvText)  //находит наш TextView по id
        tvInfo.text = "Поздравляем!!!\n $message"  //помещаем в TextView полученую информацию message
    }
}
