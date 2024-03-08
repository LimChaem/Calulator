package com.lim.calculator

class DivideOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double {
        require(num2 != 0) {
            ArithmeticException("Divide by Zero")
        }
        return (num1 / num2).toDouble()
    }
}