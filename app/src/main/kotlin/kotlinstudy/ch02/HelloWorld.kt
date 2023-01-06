package kotlinstudy

import kotlinstudy.ch02.*
import kotlinstudy.ch02.Color02.*
import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    println("Hello, world!")

    val name = if (args.size > 0) args[0] else "Kotlin"
    println(name)

    println("Hello $name!")//String Template = ("Hello, "+name+"!")와 동일한 결과를 반환하며, StringBuilder와 같이 효율적이다.
//    println("$name님 반가워요!") // Unresolved reference 오류 발생
    println("$name 님 반가워요!")
    println("${name}님 반가워요!")

    println("Hello, ${if (args.isNotEmpty()) args[0] else "Kotlin"}")//중괄호 안에 쌍따옴표를 쓸 수있음


//    println(mix(RED, BLUE)) 예외 발생


}



fun max(a: Int, b: Int): Int {
    return if (a > b) a else b //자바의 삼항 연산자와 같은 형태를 이와같이 쓸 수 있음
}

fun max2(a: Int, b: Int) = if (a > b) a else b //타입 추론으로 리턴값이 필요없음

