package edu.iesam.alumnos.features.domain

class GuardarAlumnoUseCase(
    private val repository: AlumnoRepository) {

    operator fun invoke(alumno: Alumno) {
        repository.guardarAlumno(alumno)
    }
}
