package edu.iesam.alumnos.features.data

import edu.iesam.alumnos.features.domain.Alumno
import edu.iesam.alumnos.features.domain.AlumnoRepository

class AlumnoLocalDataRepository (
    private val localDataSource: AlumnoLocalDataSource) : AlumnoRepository {

        override fun obtenerAlumnos(): List<Alumno> {
            return localDataSource.obtenerAlumnos()
        }

        override fun guardarAlumno(alumno: Alumno) {
            localDataSource.guardarAlumno(alumno)
        }

        override fun borrarAlumno(dni: String) {
            localDataSource.borrarAlumno(dni)
        }
}