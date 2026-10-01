package edu.iesam.alumnos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.iesam.alumnos.features.domain.Alumno
import edu.iesam.alumnos.features.presentation.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = View()

        view.guardar(Alumno("12345678A","Juan","García López"))
        view.guardar(Alumno("12345678B","Marta","Díaz Pérez"))
        view.mostrarAlumnos()
        view.borrar("12345678B")
        view.mostrarAlumnos()


    }
}