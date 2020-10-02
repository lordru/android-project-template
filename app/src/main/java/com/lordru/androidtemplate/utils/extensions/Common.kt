package com.lordru.androidtemplate.utils.extensions

import com.lordru.androidtemplate.BuildConfig

inline fun doOnDebug(block: () -> Unit) {
    if (BuildConfig.DEBUG) {
        block()
    }
}