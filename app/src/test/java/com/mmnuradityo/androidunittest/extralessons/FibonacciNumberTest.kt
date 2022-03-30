package com.mmnuradityo.androidunittest.extralessons

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class FibonacciNumberTest {

    /**
     * fibonacci
     */
    @Test
    fun `n is zero equals zero`() {
        val result = FibonacciNumber.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `n is one equals one`() {
        val result = FibonacciNumber.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `n more than one is equal to expectation number n times`() {
        val n = 6
        val expectationResult = 8
        val result = FibonacciNumber.fib(n)
        assertThat(result).isEqualTo(expectationResult)
    }

    @Test
    fun `fib n is equals fib n - 2 plus fib n - 1`() {
        val n = 6
        val resultn = FibonacciNumber.fib(n)
        val result = FibonacciNumber.fib(n - 2) + FibonacciNumber.fib(n - 1)
        assertThat(result).isEqualTo(resultn)
    }

    /**
     * braces
     * */

    @Test
    fun `braces is complete return true`() {
        val result = FibonacciNumber.checkBraces("(1*2)")
        assertThat(result).isTrue()
    }

    @Test
    fun `incomplete braces return false`() {
        val result = FibonacciNumber.checkBraces("(1*2))")
        assertThat(result).isFalse()
    }

}