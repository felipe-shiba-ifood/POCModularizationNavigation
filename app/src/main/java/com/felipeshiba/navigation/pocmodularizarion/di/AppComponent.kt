package com.felipeshiba.navigation.pocmodularizarion.di

import com.felipeshiba.navigation.feature.di.FeatureNavigationModule
import com.felipeshiba.navigation.navigation.ActionKey
import com.felipeshiba.navigation.navigation.ActionResolver
import com.felipeshiba.navigation.pocmodularizarion.App
import dagger.Component
import dagger.android.AndroidInjectionModule

@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityModule::class,
        FragmentModule::class,
        FeatureNavigationModule::class
    ]
)
interface AppComponent {
    fun inject(app: App)
    fun nav(): Map<Class<out ActionKey>, ActionResolver<*>>
}