package com.duoc.learningplatform.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.learningplatform.model.Course;
import com.duoc.learningplatform.repository.CourseRepository;

@Service
public class CourseServiceImpl implements ICourseService { //Aquí se define la lógica de negocio


    @Autowired CourseRepository courseRepository;

    @Override
    public ArrayList<Course> obtenerCursosActivosOrdenados() {
        
    ArrayList<Course> todos = new ArrayList<>();
    courseRepository.findAll().forEach(todos::add);
    
    ArrayList<Course> activos = new ArrayList<>();
    
    for (Course c : todos) {
        if (c.isActivo()) {
            activos.add(c);
        }
    }
    
    activos.sort((c1, c2) -> c1.getNombre().compareToIgnoreCase(c2.getNombre()));
    return activos;

    }

    @Override
    public void guardarCurso(Course course) {
        courseRepository.save(course); // Guardar en MySQL
    }

    @Override
    public ArrayList<Course> obtenerTodos() {
        return (ArrayList<Course>) courseRepository.findAll();
    }

    @Override
    public Course buscarPorNombre(String nombre) {
        return courseRepository.findByNombre(nombre);
    }

    @Override
    public Course buscarPorId(Long id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        courseRepository.deleteById(id);
    }
    
    

}
