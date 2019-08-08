package com.felipeshiba.navigation.feature.di

import com.felipeshiba.navigation.navigation.ActionKey
import com.felipeshiba.navigation.navigation.ActionResolver
import com.felipeshiba.navigation.navigation.ActionResolverKey
import com.felipeshiba.navigation.feature.FeatureFragment
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class FeatureNavigationModule {

    @[Provides IntoMap ActionResolverKey(ActionKey.Feature::class)]
    fun provideFeatureActionResolver(): ActionResolver<*> {
        return FeatureFragment
    }
}