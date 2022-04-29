package com.example.radiogroup

import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var radioButtonChecked: RadioButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        radioButtonA.setOnClickListener(this)
        radioButtonB.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val selectedID = radioGroup!!.checkedRadioButtonId
        radioButtonChecked = findViewById(selectedID)
        Toast.makeText(
            this@MainActivity, radioButtonChecked?.getText().toString() + " checked.",
            Toast.LENGTH_LONG
        ).show()
    }
}