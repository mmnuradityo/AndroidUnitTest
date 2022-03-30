package com.mmnuradityo.androidunittest.bbeforeafter

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import com.mmnuradityo.androidunittest.R
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceCompareTest {

    private lateinit var context: Context
    private lateinit var resourceCompare: ResourceCompare

    @Before
    fun setup() {
        context = ApplicationProvider.getApplicationContext()
        resourceCompare = ResourceCompare()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun stringResourceSameAsGivenString_returnTrue() {
        val result = resourceCompare.isEquals(context, R.string.app_name, "Android Unit Test")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnFalse() {
        val result = resourceCompare.isEquals(context, R.string.app_name, "Hello")
        assertThat(result).isFalse()
    }

}