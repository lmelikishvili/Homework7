package com.example.homework7

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val parentLayout = findViewById<LinearLayout>(R.id.parentLayout)
        val addButton = findViewById<Button>(R.id.addButton)

        addButton.setOnClickListener {
            val newEditText = EditText(this)
            newEditText.setText("New TextView")
            newEditText.layoutParams = ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.WRAP_CONTENT,


            )

            parentLayout.addView(newEditText)
        }
    }
}