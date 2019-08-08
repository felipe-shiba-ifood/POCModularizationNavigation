package com.felipeshiba.navigation.pocmodularizarion

import android.app.Application
import com.felipeshiba.navigation.pocmodularizarion.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class App: Application(), HasAndroidInjector {

    @Inject
    lateinit var dispatchAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()

        val appComponent = DaggerAppComponent.create()
        appComponent.inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchAndroidInjector
}