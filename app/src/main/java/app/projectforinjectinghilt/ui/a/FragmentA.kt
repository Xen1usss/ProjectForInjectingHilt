package app.projectforinjectinghilt.ui.a

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import androidx.fragment.app.viewModels
import app.projectforinjectinghilt.databinding.FragmentABinding
import app.projectforinjectinghilt.ui.a.ViewModelA

@AndroidEntryPoint
class FragmentA : Fragment() {

    private lateinit var binding: FragmentABinding
    val viewModel: ViewModelA by viewModels() //нужно ли тут поставить модификатор private?

    override fun onCreateView( //?
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        return binding?.root    }

    override fun onResume() {
        super.onResume()
        viewModel.log()
    }
}