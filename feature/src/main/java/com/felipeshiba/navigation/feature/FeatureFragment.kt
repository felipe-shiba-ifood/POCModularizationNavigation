package com.felipeshiba.navigation.feature


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.felipeshiba.navigation.navigation.ActionKey
import com.felipeshiba.navigation.navigation.ActionResolver

/**
 * A simple [Fragment] subclass.
 */
class FeatureFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feature, container, false)
    }

    companion object : ActionResolver<ActionKey.Feature> {
        override fun getAction(key: ActionKey.Feature): FeatureFragment {
            return FeatureFragment()
        }
    }

}
