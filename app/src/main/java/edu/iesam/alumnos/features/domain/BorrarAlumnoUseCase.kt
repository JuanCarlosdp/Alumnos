package edu.iesam.alumnos.features.domain

class BorrarAlumnoUseCase(
    private val repository: AlumnoRepository) {

    operator fun invoke(dni: String) {
        repository.borrarAlumno(dni)
    }
}