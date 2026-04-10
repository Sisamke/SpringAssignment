package com.example.springassignment.repository;

import com.example.springassignment.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByCategory(String category);
}