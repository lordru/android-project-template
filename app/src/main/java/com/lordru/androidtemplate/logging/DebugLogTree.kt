package com.lordru.androidtemplate.logging

import timber.log.Timber

class DebugLogTree : Timber.DebugTree() {

    override fun log(
        priority: Int,
        tag: String?,
        message: String,
        t: Throwable?
    ) {
        super.log(priority, tag, message, t)
    }
}