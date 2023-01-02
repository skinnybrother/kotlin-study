package kotlin.study.model

class HelloWorld {
    fun main(args: Array<String>) {
        println("Hello, world!")
    }

    fun max(a: Int,b: Int): Int{
        return if (a>b) a else b //자바의 삼항 연산자와 같은 형태를 이와같이 쓸 수 있음
    }

    fun max2(a: Int,b: Int) = if (a>b) a else b //타입 추론으로 리턴값이 필요없음


}