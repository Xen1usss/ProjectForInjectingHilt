package app.projectforinjectinghilt.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import app.projectforinjectinghilt.R
import app.projectforinjectinghilt.ViewModelForFragmentMain

class FragmentForActivityMain : Fragment() {

    companion object { //?
        fun newInstance() = FragmentForActivityMain()
    }

    private val viewModel: ViewModelForFragmentMain by viewModel()

    override fun onCreateView( //?
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_main, container, false)
    }

    override fun onResume() {
        super.onResume()
        viewModel.log()
    }


}