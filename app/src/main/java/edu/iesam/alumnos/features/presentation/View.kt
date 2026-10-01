package edu.iesam.alumnos.features.presentation

import android.util.Log
import edu.iesam.alumnos.features.data.AlumnoLocalDataRepository
import edu.iesam.alumnos.features.data.AlumnoLocalDataSource
import edu.iesam.alumnos.features.domain.ObtenerAlumnosUseCase

class View {
    private val dataSource = AlumnoLocalDataSource()
    private val repository = AlumnoLocalDataRepository(dataSource)

    private val obtenerAlumnos = ObtenerAlumnosUseCase(repository)

    fun mostrarAlumnos() {

        val alumnos = obtenerAlumnos()

        for (alumno in alumnos) {

            Log.d("ALUMNOS","Nombre: ${alumno.nombre}, " + "Apellidos: ${alumno.apellidos}, " + "DNI: ${alumno.dni}"
            )
        }
    }
}