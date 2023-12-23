package app.projectforinjectinghilt.ui

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ViewModelForFragmentMain @Inject constructor(val test:String) : ViewModel() {

    fun log(){
        println("BBBBBBBBBB $test")

    }
}