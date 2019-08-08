package com.felipeshiba.navigation.pocmodularizarion.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.felipeshiba.navigation.navigation.ActionKey
import com.felipeshiba.navigation.navigation.ActionResolver
import com.felipeshiba.navigation.navigation.ActionResolverMap
import com.felipeshiba.navigation.navigation.Navigator
import com.felipeshiba.navigation.pocmodularizarion.MainActivity
import com.felipeshiba.navigation.pocmodularizarion.R
import com.felipeshiba.navigation.pocmodularizarion.di.DaggerAppComponent
import javax.inject.Inject

class MainFragment : Fragment() {

    lateinit var fragments: ActionResolverMap

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragments = DaggerAppComponent.create().nav()
        val view = inflater.inflate(R.layout.main_fragment, container, false)
        view.findViewById<Button>(R.id.button).setOnClickListener(::onButtonClick)
        return view
    }

    private fun onButtonClick(view: View) {
        val fragment = Navigator(fragments).createFragment(ActionKey.Feature)

        (activity as? MainActivity)?.changeFragment(fragment)
    }
}
