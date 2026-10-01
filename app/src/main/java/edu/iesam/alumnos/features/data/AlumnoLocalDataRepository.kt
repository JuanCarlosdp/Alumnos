package edu.iesam.alumnos.features.data

import edu.iesam.alumnos.features.domain.Alumno
import edu.iesam.alumnos.features.domain.AlumnoRepository

class AlumnoLocalDataRepository(
    private val localDataSource: AlumnoLocalDataSource) : AlumnoRepository {

    override fun obtenerAlumnos(): List<Alumno> {
        return localDataSource.obtenerAlumnos()
    }

}
