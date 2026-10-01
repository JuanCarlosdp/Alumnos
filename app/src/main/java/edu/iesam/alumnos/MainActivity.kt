package edu.iesam.alumnos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.iesam.alumnos.features.presentation.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = View()

        view.mostrarAlumnos()
    }
}