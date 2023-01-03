package kotlinstudy.ch02

import kotlinstudy.ch02.model.IsMarriedPerson

fun main(){
    val person = IsMarriedPerson("sypark", true)
    println(person.name)
    println(person.isMarried)
    person.isMarried = false
    println(person.isMarried)
}