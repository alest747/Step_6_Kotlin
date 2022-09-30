package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickTrue(view: View){  //функция слушателя нажатий
        Data(true)  //вызов функции смены активити со значением true
    }

    fun onClickFalse(view:View){  //функция слушателя нажатий
        Toast.makeText(this, "ГЛУПЕЦ!", Toast.LENGTH_SHORT).show()  //всплывающее сообщение после нажатия на кнопку
    }
    private fun Data(textTrue:Boolean){  //создаем функцию для активации перехода на другое активити и проверки значений
        var edText = findViewById<EditText>(R.id.edTextName).text.toString()  //присваеваем переменные для наших полей ввода текста
        var edText2 = findViewById<EditText>(R.id.edTextLastName).text.toString()
        var edText3 = findViewById<EditText>(R.id.edTextSurName).text.toString()

        var intent = Intent(this, MainActivity2::class.java)  //переменная для Intent
        intent.putExtra("key","$edText $edText3 $edText2")  //помещаем в Intent передоваемую информацию, key это ключ для передачи информации

        when{
            edText > "" && edText2 > "" && edText3 > "" -> startActivity(intent) //когда все нужные поля для ввода текста заполнены срабатывает startActivity(intent) - переход на другое активити

            else ->{Toast.makeText(this,"Ведите все необходимые данные",Toast.LENGTH_SHORT).show()}  //если хотя бы одно поле для ввода текста пустое то выводится всплывающее сообщение Toast
        }
    }
}
