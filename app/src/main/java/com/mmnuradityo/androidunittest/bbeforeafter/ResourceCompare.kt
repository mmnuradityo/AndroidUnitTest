package com.mmnuradityo.androidunittest.bbeforeafter

import android.content.Context

class ResourceCompare {

    fun isEquals(context: Context, resId: Int, string: String) =
        context.getString(resId) == string

}