package app.projectforinjectinghilt.ui.a

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModelA @Inject constructor(val test:String) : ViewModel() {

    fun log(){
        println("AAA $test")

    }
}