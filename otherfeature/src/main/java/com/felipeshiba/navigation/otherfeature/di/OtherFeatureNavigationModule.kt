package com.felipeshiba.navigation.otherfeature.di

import com.felipeshiba.navigation.navigation.ActionKey
import com.felipeshiba.navigation.navigation.ActionResolver
import com.felipeshiba.navigation.navigation.ActionResolverKey
import com.felipeshiba.navigation.feature.OtherFeatureFragment
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap

@Module
class OtherFeatureNavigationModule {

    @[Provides IntoMap ActionResolverKey(ActionKey.OtherFeature::class)]
    fun provideOtherFeatureActionResolver(): ActionResolver<*> {
        return OtherFeatureFragment
    }
}