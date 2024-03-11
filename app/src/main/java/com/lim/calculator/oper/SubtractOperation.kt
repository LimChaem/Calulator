package com.lim.calculator.oper

import com.lim.calculator.AbstractOperation

class SubtractOperation: AbstractOperation() {

    override fun operation(num1: Double, num2: Double): Double {
        var answer = num1 - num2
        println("$num1 빼기 $num2 의 값은 $answer 입니다.")

        return answer
    }
}