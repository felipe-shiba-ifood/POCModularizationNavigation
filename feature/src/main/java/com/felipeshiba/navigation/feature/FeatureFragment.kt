package com.felipeshiba.navigation.feature


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.felipeshiba.navigation.navigation.ActionKey
import com.felipeshiba.navigation.navigation.ActionResolver
import com.felipeshiba.navigation.navigation.Container

/**
 * A simple [Fragment] subclass.
 */
class FeatureFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_feature, container, false)
        view.findViewById<Button>(R.id.button).setOnClickListener(::onButtonClick)
        return view
    }

    companion object : ActionResolver<ActionKey.Feature> {
        override fun getAction(key: ActionKey.Feature): FeatureFragment {
            return FeatureFragment()
        }
    }

    private fun onButtonClick(view: View) {
        (activity as? Container)?.changeScreen(ActionKey.OtherFeature)
    }
}
