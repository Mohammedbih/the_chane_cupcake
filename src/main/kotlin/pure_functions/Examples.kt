package pure_functions

import java.time.LocalDateTime
import java.util.Random


fun countEvens(list: List<Int>): Int {
    return list.count { it % 2 == 0 }
}



fun currentTime() = LocalDateTime.now()!!
fun rand() = Random().nextInt()

fun sum(a: Int, b: Int) = a + b
fun multiply(a: Int, b: Int) = a * b

