package app.projectforinjectinghilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.projectforinjectinghilt.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //байндинг превратил xml файл в класс со своими переменными

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //выделяет под это память
        val view = binding.root //содержит корневой элемент (констрэинт лэйаут)
        setContentView(view)

    }
}