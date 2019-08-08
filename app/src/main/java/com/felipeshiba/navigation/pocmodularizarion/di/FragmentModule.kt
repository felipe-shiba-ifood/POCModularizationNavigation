package com.felipeshiba.navigation.pocmodularizarion.di

import com.felipeshiba.navigation.pocmodularizarion.ui.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class FragmentModule {
    @ContributesAndroidInjector
    abstract fun contributeMainAndroidInjector(): MainFragment
}