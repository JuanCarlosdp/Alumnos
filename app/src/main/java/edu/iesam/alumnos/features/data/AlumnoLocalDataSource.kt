package edu.iesam.alumnos.features.data

import edu.iesam.alumnos.features.domain.Alumno

class AlumnoLocalDataSource {

    private val alumnos = mutableListOf<Alumno>()

    fun obtenerAlumnos(): List<Alumno> {
        return alumnos
    }

    fun guardarAlumno(alumno: Alumno) {
        alumnos.add(alumno)
    }

    fun borrarAlumno(dni: String) {
        alumnos.removeIf { it.dni == dni }
    }
}
