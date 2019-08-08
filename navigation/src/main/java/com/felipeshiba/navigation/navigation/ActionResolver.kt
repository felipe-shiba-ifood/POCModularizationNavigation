package com.felipeshiba.navigation.navigation

import androidx.fragment.app.Fragment

interface ActionResolver<in KeyT : ActionKey> {
    fun getAction(key: KeyT): Fragment
}
