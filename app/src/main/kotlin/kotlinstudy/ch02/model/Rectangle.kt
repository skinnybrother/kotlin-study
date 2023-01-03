package kotlinstudy.ch02.model

class Rectangle(val height: Int, val width: Int) {
    /** 커스텀 접근자 */
    val isSquare: Boolean
//        get() { //프로퍼티 게터 선언
//            return height == width
//        }
        get() = height == width
}