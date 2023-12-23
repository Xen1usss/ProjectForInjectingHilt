package app.projectforinjectinghilt.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import androidx.fragment.app.viewModels
import app.projectforinjectinghilt.databinding.FragmentForActivityBinding

@AndroidEntryPoint
class FragmentForActivityMain : Fragment() {

    private lateinit var binding: FragmentForActivityBinding
    val viewModel: ViewModelForFragmentMain by viewModels() //нужно ли тут поставить модификатор private?

    override fun onCreateView( //?
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentForActivityBinding.inflate(inflater, container, false)
        return binding?.root    }

    override fun onResume() {
        super.onResume()
        viewModel.log()
    }


}