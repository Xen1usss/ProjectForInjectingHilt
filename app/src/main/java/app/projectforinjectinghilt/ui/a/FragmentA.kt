package app.projectforinjectinghilt.ui.a

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import app.projectforinjectinghilt.MainActivity
import app.projectforinjectinghilt.R
import app.projectforinjectinghilt.databinding.FragmentABinding

@AndroidEntryPoint
class FragmentA : Fragment() {

    private var binding: FragmentABinding? = null // todo подправить
    val viewModel: ViewModelA by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.buttonNext?.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
        }
    }
}