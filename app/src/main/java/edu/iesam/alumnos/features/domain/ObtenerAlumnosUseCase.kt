package edu.iesam.alumnos.features.domain

class ObtenerAlumnosUseCase(private val repository: AlumnoRepository) {

    operator fun invoke(): List<Alumno> {
        return repository.obtenerAlumnos()
    }
}
