package ru.geekbrains.firstapplicationkt

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val user = User()
    val userCopy = user.copy()

    val list = listOf("one", "two", "three", "four", "five", "six")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textViewMessage = findViewById<TextView>(R.id.text_view_message)
        var textViewDataClass = findViewById<TextView>(R.id.text_view_data_class)
        var textViewCopyObject = findViewById<TextView>(R.id.text_view_copy_object)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                textViewMessage.setText(R.string.message)
            }
        })
        textViewDataClass.setText(user.getUsername(user.name, user.surname))
        textViewCopyObject.setText(userCopy.getUsername(userCopy.name, userCopy.surname))

        list.forEach {
            print(it)
        }
        for (i in 1..5) {
            print("Привет!")
        }
        for (i in 10 downTo 1 step 2) {
            print("Пока!")
        }

        for (i in 0 until list.size) {
            if (list[i].equals("three")) {
                print("три")
                return
            }
        }
    }
}

