package com.felipeshiba.navigation.feature


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.felipeshiba.navigation.navigation.ActionKey
import com.felipeshiba.navigation.navigation.ActionResolver
import com.felipeshiba.navigation.otherfeature.R

/**
 * A simple [Fragment] subclass.
 */
class OtherFeatureFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.other_fragment_feature, container, false)
    }

    companion object : ActionResolver<ActionKey.OtherFeature> {
        override fun getAction(key: ActionKey.OtherFeature): OtherFeatureFragment {
            return OtherFeatureFragment()
        }
    }

}
