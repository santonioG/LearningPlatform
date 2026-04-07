package com.duoc.learningplatform.service;

import java.util.ArrayList;

import com.duoc.learningplatform.model.Course;

public interface ICourseService {

    ArrayList<Course> obtenerCursosActivosOrdenados();
    void guardarCurso(Course course);
    ArrayList<Course> obtenerTodos();
    Course buscarPorNombre(String nombre);
    Course buscarPorId(Long id);
    void eliminar(Long id);

}
