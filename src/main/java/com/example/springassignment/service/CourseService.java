package com.example.springassignment.service;

import com.example.springassignment.model.Course;
import com.example.springassignment.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    // GET ALL
    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    // GET BY CATEGORY
    public List<Course> getCoursesByCategory(String category) {
        return repository.findByCategory(category);
    }

    // CREATE
    public Course createCourse(Course course) {
        return repository.save(course);
    }

    // DELETE
    public String deleteCourse(Long id) {
        repository.deleteById(id);
        return "Course deleted successfully";
    }

    // UPDATE
    public Course updateCourse(Long id, Course updatedCourse) {
        Course course = repository.findById(id).orElse(null);

        if (course != null) {
            course.setCourseName(updatedCourse.getCourseName());
            course.setCourseDescription(updatedCourse.getCourseDescription());
            course.setCategory(updatedCourse.getCategory());
            return repository.save(course);
        }
        return null;
    }
}