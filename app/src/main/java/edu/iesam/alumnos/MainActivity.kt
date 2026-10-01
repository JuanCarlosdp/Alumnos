package edu.iesam.alumnos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.iesam.alumnos.features.domain.Alumno
import edu.iesam.alumnos.features.presentation.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = View()

        view.guardar(Alumno("Juan","García López","12345678A"))
        view.mostrarAlumnos()

    }
}