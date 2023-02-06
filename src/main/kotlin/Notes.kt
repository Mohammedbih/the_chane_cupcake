fun main() {

}

/**
 * Pure and Impure Function Different Example.
 */
fun outer(a: Int, b: Int): Int { // Pure
    fun inner(d: Int): Int { // Impure
        return d * a
    }
    return inner(b)
}