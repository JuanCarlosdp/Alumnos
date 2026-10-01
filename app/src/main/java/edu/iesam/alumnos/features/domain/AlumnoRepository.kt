package edu.iesam.alumnos.features.domain

interface AlumnoRepository {
        fun obtenerAlumnos(): List<Alumno>
        fun guardarAlumno(alumno: Alumno)
}