package com.felipeshiba.navigation.pocmodularizarion.di

import com.felipeshiba.navigation.pocmodularizarion.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
internal abstract class ActivityModule {
    @ContributesAndroidInjector
    abstract fun contributeMainAndroidInjector(): MainActivity
}


