package app.projectforinjectinghilt.ui.b

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import app.projectforinjectinghilt.MainActivity
import app.projectforinjectinghilt.R
import app.projectforinjectinghilt.databinding.FragmentBBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentB : Fragment() {

    private  var binding: FragmentBBinding? = null
    val viewModel: ViewModelB by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.buttonBack?.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentB_to_fragmentA)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}