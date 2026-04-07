package com.duoc.learningplatform.repository;

import org.springframework.data.repository.CrudRepository;

import com.duoc.learningplatform.model.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

    Course findByNombre(String nombre); //Spring genera el SQL automáticamente 

}
