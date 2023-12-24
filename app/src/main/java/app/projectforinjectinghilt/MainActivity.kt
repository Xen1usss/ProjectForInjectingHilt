package app.projectforinjectinghilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import app.projectforinjectinghilt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding //байндинг превратил xml файл в класс со своими переменными

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //выделяет под это память
        val view = binding.root //содержит корневой элемент (констрэинт лэйаут)
        setContentView(view)
        navController =
            Navigation.findNavController(this, R.id.navigation_host_container_for_fragments)
    }
}