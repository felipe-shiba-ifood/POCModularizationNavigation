package com.felipeshiba.navigation.navigation

sealed class ActionKey {
    object Feature : ActionKey()
    object OtherFeature: ActionKey()
}
