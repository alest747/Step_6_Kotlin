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

    fun onClickTrue(view: View){
        Data(true)
    }

    fun onClickFalse(view:View){
        Toast.makeText(this, "ГЛУПЕЦ!", Toast.LENGTH_SHORT).show()
    }
    private fun Data(textTru:Boolean){
        var edText = findViewById<EditText>(R.id.edTextName).text.toString()
        var edText2 = findViewById<EditText>(R.id.edTextLastName).text.toString()
        var edText3 = findViewById<EditText>(R.id.edTextSurName).text.toString()

        var intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("key","$edText $edText3 $edText2")

        when{
            edText > "" && edText2 > "" && edText3 > "" -> startActivity(intent)

            else ->{Toast.makeText(this,"Ведите все необходимые данные",Toast.LENGTH_SHORT).show()}
        }
    }
}