package com.example.parkinglotapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calculateButton = findViewById<Button>(R.id.button)
        val mealCostEditText = findViewById<EditText>(R.id.editTextNumber)
        val tipPercentageSpinner = findViewById<Spinner>(R.id.spinner)
        val tipResultTextView = findViewById<TextView>(R.id.textView4)

        calculateButton.setOnClickListener {
            // Retrieve the input values
            val mealCostStr = mealCostEditText.text.toString()
            val tipPercentageStr = tipPercentageSpinner.selectedItem.toString().replace("%", "")

            // Convert the input values to appropriate data types
            val mealCost = mealCostStr.toDoubleOrNull() ?: 0.0
            val tipPercentage = tipPercentageStr.toDoubleOrNull() ?: 0.0

            // Calculate the tip
            val tipAmount = mealCost * (tipPercentage / 100.0)

            // Display the result
            tipResultTextView.text = "Tip Amount: $$tipAmount"
        }

    }
}