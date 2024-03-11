package com.lim.calculator

import com.lim.calculator.oper.AddOperation
import com.lim.calculator.oper.DivideOperation
import com.lim.calculator.oper.MultiplyOperation
import com.lim.calculator.oper.RemainOperation
import com.lim.calculator.oper.SubtractOperation

fun main() {
    var num1 = 0.0
    var num2 = 0.0
    var operator = ""
    var op = arrayOf("1", "2", "3", "4", "5","-1")

    while(true) {
        println("원하시는 연산을 선택해주세요.")
        println("1.+, 2.-, 3.*, 4./, 5.%")
        println("종료를 원하시면 -1을 입력해주세요.")
        operator = readln()!!
        if(operator !in op) {
            println("잘못된 연산자입니다.")
            continue
        }
        if(operator == "-1"){
            println("연산을 종료합니다.")
            break
        }
        println("첫 번째 숫자를 입력해주세요.")
        num1 = readln().toDouble()
        println("두 번째 숫자를 입력해주세요.")
        num2 = readln().toDouble()


        when(operator){
            "1" -> AddOperation().operation(num1, num2)
            "2" -> SubtractOperation().operation(num1, num2)
            "3" -> MultiplyOperation().operation(num1, num2)
            "4" -> DivideOperation().operation(num1, num2)
            "5" -> RemainOperation().operation(num1, num2)
        }

        println("----------------------------------------")
    }

}


// 숫자 이외의 것을 넣거나 공백을 입력하면 여지없이 에러가 나온다.
// 예외 처리를 해줘야 할 것 같은데 한계가 온 것같다..