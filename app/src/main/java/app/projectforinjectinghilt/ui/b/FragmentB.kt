package app.projectforinjectinghilt.ui.b

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import app.projectforinjectinghilt.databinding.FragmentBBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentB : Fragment() {

    private lateinit var binding: FragmentBBinding
    val viewModel: ViewModelB by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onResume() {
        super.onResume()
        viewModel.log()
    }

}