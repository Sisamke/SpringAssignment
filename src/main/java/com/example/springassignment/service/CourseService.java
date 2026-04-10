package com.example.springassignment.service;

import com.example.springassignment.model.Course;
import com.example.springassignment.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    public Course createCourse(Course course) {
        return repository.save(course);
    }

    public List<Course> getCoursesByCategory(String category) {
        return repository.findByCategory(category);
    }

    public String deleteCourse(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Course deleted successfully";
        }
        return "Course not found";
    }

    public Course updateCourse(Long id, Course updatedCourse) {
        return repository.findById(id)
                .map(course -> {
                    course.setCourseName(updatedCourse.getCourseName());
                    course.setCourseDescription(updatedCourse.getCourseDescription());
                    course.setCategory(updatedCourse.getCategory());
                    return repository.save(course);
                })
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
    }
}
