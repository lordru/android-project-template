package com.lordru.androidtemplate

import android.app.Application
import android.os.StrictMode
import com.lordru.androidtemplate.logging.DebugLogTree
import com.lordru.androidtemplate.logging.ReleaseLogTree
import com.lordru.androidtemplate.utils.extensions.doOnDebug
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        setupTimber()
		setupStrictMode()
    }

    private fun setupTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugLogTree())
        } else {
            Timber.plant(ReleaseLogTree())
        }
    }

	private fun setupStrictMode() {
		doOnDebug {
			StrictMode.setThreadPolicy(
				StrictMode.ThreadPolicy.Builder()
					.detectDiskReads()
					.detectDiskWrites()
					.detectNetwork()
					.detectCustomSlowCalls()
					.penaltyLog()
					.build()
			)

			StrictMode.setVmPolicy(
				StrictMode.VmPolicy.Builder()
					.detectActivityLeaks()
					.detectFileUriExposure()
					.detectLeakedClosableObjects()
					.detectLeakedRegistrationObjects()
					.detectLeakedSqlLiteObjects()
					.penaltyLog()
					.build()
			)
		}
	}
}