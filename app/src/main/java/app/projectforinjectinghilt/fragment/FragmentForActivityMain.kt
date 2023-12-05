package app.projectforinjectinghilt.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import app.projectforinjectinghilt.R
import app.projectforinjectinghilt.ViewModelForFragmentMain
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import androidx.fragment.app.viewModels

@AndroidEntryPoint
class FragmentForActivityMain : Fragment() {

    val viewModel: ViewModelForFragmentMain by viewModels()

    override fun onCreateView( //?
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_for_activity, container, false)
    }

    override fun onResume() {
        super.onResume()
        viewModel.log()
    }


}