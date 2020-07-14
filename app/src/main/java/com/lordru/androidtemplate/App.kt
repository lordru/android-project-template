package com.lordru.androidtemplate

import android.app.Application
import com.lordru.androidtemplate.logging.DebugLogTree
import com.lordru.androidtemplate.logging.ReleaseLogTree
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        setupTimber()
    }

    private fun setupTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugLogTree())
        } else {
            Timber.plant(ReleaseLogTree())
        }
    }
}