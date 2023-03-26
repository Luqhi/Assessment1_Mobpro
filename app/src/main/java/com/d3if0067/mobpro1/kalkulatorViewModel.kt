package com.d3if0067.mobpro1

import androidx.lifecycle.ViewModel

class kalkulatorViewModel : ViewModel(){
    var result: String = "0"
        private set
    private var lastNumber: Double = 0.0
    private var currentOperator: String? = null
    private var clearOnNextNumber: Boolean = false

    fun appendNumber(number: String) {
        if (result == "0" || clearOnNextNumber) {
            result = number
            clearOnNextNumber = false
        } else {
//            result += number
        }
    }

    fun performOperation(operator: String) {
        if (currentOperator == null) {
            lastNumber = result.toDouble()
        } else {
            performEquals()
        }
        currentOperator = operator
        clearOnNextNumber = true
    }

    fun performEquals() {
        if (currentOperator == null) {
            return
        }
        val currentNumber = result.toDouble()
        when (currentOperator) {
            "+" -> lastNumber += currentNumber
            "-" -> lastNumber -= currentNumber
            "*" -> lastNumber *= currentNumber
            "/" -> lastNumber /= currentNumber
        }
        result = lastNumber.toString()
        clearOnNextNumber = true
    }

    fun clear() {
        currentOperator = null
        lastNumber = 0.0
        result = 0.toString()
    }
}