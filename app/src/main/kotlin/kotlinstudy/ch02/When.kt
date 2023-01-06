package kotlinstudy.ch02

import kotlinstudy.ch02.Color02.*
import java.lang.Exception

fun getMnemonic(color: Color02) =
        when (color) {
            RED -> "Richard"
            ORANGE -> "Of"
            YELLOW -> "York"
            GREEN -> "Gave"
            BLUE -> "Battle"
            INDIGO -> "In"
            VIOLET -> "Vain"
        }

fun getWarmth(color: Color02) = when (color) {
    RED, ORANGE, YELLOW -> "warn"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun mix(c1: Color02, c2: Color02) =
        when(setOf( c1,c2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW,BLUE) -> GREEN
            setOf(BLUE,VIOLET) -> INDIGO
            else -> throw Exception("Dirty Color")
        }

fun mixOptimized(c1: Color02, c2: Color02) = when {
    (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
    (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
    (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE ) -> INDIGO

    else -> throw Exception("Dirty Color")
}