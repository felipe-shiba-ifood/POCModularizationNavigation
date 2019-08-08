package com.felipeshiba.navigation.pocmodularizarion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.felipeshiba.navigation.navigation.ActionKey
import com.felipeshiba.navigation.navigation.ActionResolverMap
import com.felipeshiba.navigation.navigation.Container
import com.felipeshiba.navigation.navigation.Navigator
import com.felipeshiba.navigation.pocmodularizarion.ui.main.MainFragment
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector, Container {

    @Inject
    lateinit var fragments: ActionResolverMap

    private lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment())
                .commitNow()
        }
    }

    override fun changeScreen(actionKey: ActionKey) {
        val fragment = Navigator(fragments).createFragment(actionKey)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack(null)
            .commit()
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector
}
