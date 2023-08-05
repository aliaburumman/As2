package com.example.as2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment


class Math : Fragment(R.layout.fragment_math) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val digit1: EditText = view.findViewById(R.id.number1)
        val digit2: EditText = view.findViewById(R.id.number2)
        val button: Button = view.findViewById(R.id.mulButton)
        val mulRes: TextView = view.findViewById(R.id.mulResult)

        button.setOnClickListener{
            var x = digit1.text.toString().toInt()
            var y = digit2.text.toString().toInt()
            var z = x*y
            mulRes.text = z.toString()
        }
    }
}