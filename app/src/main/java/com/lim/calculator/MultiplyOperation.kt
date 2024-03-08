package com.lim.calculator

class MultiplyOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double = (num1 * num2).toDouble()
}