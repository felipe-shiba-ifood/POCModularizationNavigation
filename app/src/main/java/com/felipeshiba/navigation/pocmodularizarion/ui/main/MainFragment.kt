package com.felipeshiba.navigation.pocmodularizarion.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.felipeshiba.navigation.navigation.ActionKey
import com.felipeshiba.navigation.navigation.ActionResolverMap
import com.felipeshiba.navigation.navigation.Container
import com.felipeshiba.navigation.pocmodularizarion.R
import javax.inject.Inject

class MainFragment : Fragment() {

    @Inject
    lateinit var fragments: ActionResolverMap

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.main_fragment, container, false)
        view.findViewById<Button>(R.id.button).setOnClickListener(::onButtonClick)
        return view
    }

    private fun onButtonClick(view: View) {
        (activity as? Container)?.changeScreen(ActionKey.Feature)
    }
}
