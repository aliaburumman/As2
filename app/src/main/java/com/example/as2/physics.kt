package com.example.as2

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment

class Physics : Fragment((R.layout.fragment_physics)) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val spin: Spinner = view.findViewById(R.id.selSpin)
        val view1: TextView = view.findViewById(R.id.view1)
        val view2: TextView = view.findViewById(R.id.view2)
        val number1: EditText = view.findViewById(R.id.num1)
        val number2: EditText = view.findViewById(R.id.num2)
        val calc: Button = view.findViewById(R.id.calcB)
        val result: TextView = view.findViewById(R.id.resV)
        var flag: String = "voltage"
        var options = arrayOf("voltage", "current")
        spin.adapter=
            context?.let { ArrayAdapter<String>(it, android.R.layout.simple_list_item_1, options) }
        spin.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)

            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        calc.setOnClickListener { view ->
            var x: Float = number1.text.toString().toFloat()
            var y: Float = number2.text.toString().toFloat()
            if(flag == "voltage"){
                result.text = voltage(x,y).toString()
            }
            else {
                result.text = current(x,y).toString()
            }

        }

    }
}

public fun voltage(x:Float, y:Float): Float{
    return x*y;
}
public fun current(x:Float, y:Float): Float{
    return x/y;
}
