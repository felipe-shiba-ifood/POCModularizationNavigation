package com.felipeshiba.navigation.navigation

import androidx.fragment.app.Fragment
import javax.inject.Provider

typealias ActionResolverMap = @JvmSuppressWildcards Map<Class<out ActionKey>, Provider<ActionResolver<*>>>

open class Navigator(
    private val actionResolver: ActionResolverMap
) {
    open fun createFragment(key: ActionKey): Fragment {
        val resolver = actionResolver[key::class.java]?.get() as ActionResolver<ActionKey>?

        return resolver?.getAction(key)
            ?: throw IllegalStateException("Fragment does not exist in the graph")
    }
}