package com.duoc.learningplatform.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duoc.learningplatform.model.Course;
import com.duoc.learningplatform.service.ICourseService;

@RestController
@RequestMapping("/api/courses")
public class CourseController { //Crea controladores que gestionan las solicitudes HTTP
                                // y se comunican los servicios

    @Autowired
    private ICourseService courseService;

    @GetMapping("/activos")
    public ArrayList<Course> listarActivos(){
        return courseService.obtenerCursosActivosOrdenados();
    }

}
