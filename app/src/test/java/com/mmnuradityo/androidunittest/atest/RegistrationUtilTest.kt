package com.mmnuradityo.androidunittest.atest

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty userName returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid userName and correctly repeat password returns true`() {
        val result = RegistrationUtil.validateRegistration(
            "Radit",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `userName already exists returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "Carl",
            "123",
            "abc"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "Carl",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty confirmed password returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "Carl",
            "123",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digits password returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "Carl",
            "abc",
            "abc"
        )
        assertThat(result).isFalse()
    }

}