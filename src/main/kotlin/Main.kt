class Foo {
    var count = 0
    fun s(count: Int) {
        this.count = count
    }
}

fun solution(sequence: List<Int>): Boolean {
    var counter = 0
    for (i in 0 until sequence.size - 1) {
        if (sequence[i] <= sequence[i + 1]) continue
        counter += 1
    }
    return counter <= 1
}


fun main() {

    println(solution(listOf(1, 2, 1, 2)))
}

fun large(n: Int): Int {
    var s = ""
    repeat(n) { s += "9" } // s = s + "9"  // "a" + "b" // "ab"
    return s.toInt()
}