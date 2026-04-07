package com.example.springassignment.controller;

import com.example.springassignment.model.Course;
import com.example.springassignment.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return service.getAllCourses();
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return service.createCourse(course);
    }

    @GetMapping("/category/{category}")
    public List<Course> getByCategory(@PathVariable String category) {
        return service.getCoursesByCategory(category);
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable Long id) {
        return service.deleteCourse(id);
    }

    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course course) {
        return service.updateCourse(id, course);
    }
}