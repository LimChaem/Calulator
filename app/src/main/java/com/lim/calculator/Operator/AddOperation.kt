package com.lim.calculator.Operator

import com.lim.calculator.AbstractOperation

class AddOperation : AbstractOperation() {

    override fun operation(num1: Double, num2: Double): Double {
        var answer = num1 + num2
        println("$num1 더하기 $num2 의 값은 $answer 입니다.")

        return answer

    }
    init{

    }
}