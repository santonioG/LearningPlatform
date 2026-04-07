package com.duoc.learningplatform.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.duoc.learningplatform.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

    Course findByNombre(String nombre); //Spring genera el SQL automáticamente 

}
