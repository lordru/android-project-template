package com.lordru.androidtemplate.logging

import android.util.Log
import timber.log.Timber

class ReleaseLogTree : Timber.Tree() {

    override fun log(
        priority: Int,
        tag: String?,
        message: String,
        t: Throwable?
    ) {
        TODO("Not yet implemented")
    }

    override fun isLoggable(tag: String?, priority: Int): Boolean {
        return priority != Log.VERBOSE || priority != Log.DEBUG || priority != Log.INFO
    }
}