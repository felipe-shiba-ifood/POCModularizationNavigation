package com.felipeshiba.navigation.navigation

import dagger.MapKey
import kotlin.reflect.KClass

@[Retention(AnnotationRetention.RUNTIME) MapKey]
annotation class ActionResolverKey(val kClass: KClass<out ActionKey>)