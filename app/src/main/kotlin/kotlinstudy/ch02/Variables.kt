package kotlinstudy

fun main() {
    val question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"

    val answer = 42
    val answer2: Int = 42
    var answer3: Int = 42 //var 키워드는 variable의 약어로 변경 가능한 참조이다.
// answer2 = 33 val 키워드는 value의 약어로 final과 비슷한 역할로 변경 불가능한 참조를 저장하는 변수이다.

    println(answer3)

    answer3 = 55

    println(answer)
    println(answer2)
    println(answer3)

    val message: String
    if (true) {
        message = "옳음"
    } else {
        message = "틀림"
    }

    val languages = arrayListOf("JAVA")
    languages.add("Kotlin")

    var cannotChangeType = 42
//        cannotChangeType = "42" type mismatch
}