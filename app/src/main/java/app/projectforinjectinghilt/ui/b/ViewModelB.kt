package app.projectforinjectinghilt.ui.b

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModelB @Inject constructor(val test: String) : ViewModel() {

    fun log() {
        println("BBB $test")
    }
}