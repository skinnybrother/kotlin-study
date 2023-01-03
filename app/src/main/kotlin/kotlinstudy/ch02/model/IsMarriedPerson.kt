package kotlinstudy.ch02.model

class IsMarriedPerson(
        val name: String, //읽기전용, Getter 제공
        var isMarried: Boolean //읽기쓰기 가능, Getter Setter 제공
)