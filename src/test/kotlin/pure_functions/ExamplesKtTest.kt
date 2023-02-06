package pure_functions

import org.junit.Assert.*
import org.junit.Test

class ExamplesKtTest{

    @Test
    fun testCountEvens(){
        // 1 2 3 4 5 6 7 9 8 9 10 11 12 13
        val result = countEvens(listOf(1,2,3,4,5,6,7,8,9,10,11,12,13))
        val expect = 6

        assertEquals(result,expect)
    }
}