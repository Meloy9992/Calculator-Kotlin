package org.example

import java.util.Scanner

fun main() {
    //Калькулятор План
    //1) Функция принимающая тип вычислений и 2 числа
    //2) Функция отвечающая за принятие чисел из консоли(TODO: Переделать на интерфейс)

    var scanner = Scanner(System.`in`)
    var term1 = scanner.nextDouble()
    var term2 = scanner.nextDouble()
    println(executeCalc(term1, term2,'+'))
    println(executeCalc(term1, term2,'-'))
    println(executeCalc(term1, term2,'*'))
    println(executeCalc(term1, term2,'/'))
    println(executeCalc(term1, term2,'%'))


}

fun executeCalc(term1: Double, term2: Double, operator: Char): Double{
    var result = 0.0

    when(operator){
        '+' -> result = term1 + term2
        '-' -> result = term1 - term2
        '*' -> result = term1 *term2
        '/' -> result = term1 /term2
        '%' -> result = term1 % term2
    }
    return result
}