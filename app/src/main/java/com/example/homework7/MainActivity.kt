package com.example.homework7

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.homework7.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val parentLayout = binding.parentLayout
        val addButton = binding.addButton
        val chBox = binding.fieldIsNumeric
        chBox.setOnCheckedChangeListener{
                buttonView, isChecked ->
            if (isChecked){
                binding.edLastname.inputType = InputType.TYPE_CLASS_NUMBER
                binding.edFirstName.inputType = InputType.TYPE_CLASS_NUMBER
            }else{
                binding.edFirstName.inputType = InputType.TYPE_CLASS_TEXT
                binding.edLastname.inputType = InputType.TYPE_CLASS_TEXT
            }
        }




        addButton.setOnClickListener {
            val firstName = binding.edFirstName.text.toString()
            val lastName = binding.edLastname.text.toString()

            val newTextview = TextView(this)
            newTextview.setText("$firstName $lastName")
            newTextview.layoutParams = ActionBar.LayoutParams(
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.WRAP_CONTENT,
            )
            newTextview.textSize = 30F
            parentLayout.addView(newTextview)

//            if(chBox.isChecked){
//                val newTextview = TextView(this)
//                newTextview.setText("$firstName $lastName")
//                newTextview.layoutParams = ActionBar.LayoutParams(
//                    ActionBar.LayoutParams.WRAP_CONTENT,
//                    ActionBar.LayoutParams.WRAP_CONTENT,
//                )
//                parentLayout.addView(newTextview)
//            }else{
//                val newTextview = TextView(this)
//                newTextview.setText("$firstName $lastName")
//                newTextview.layoutParams = ActionBar.LayoutParams(
//                    ActionBar.LayoutParams.WRAP_CONTENT,
//                    ActionBar.LayoutParams.WRAP_CONTENT,
//                )
//
//                parentLayout.addView(newTextview)
//            }

            binding.edFirstName.text.clear()
            binding.edLastname.text.clear()
        }
    }
}