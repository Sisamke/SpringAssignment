package com.example.springassignment.controller;

import com.example.springassignment.model.Course;
import com.example.springassignment.service.CourseService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping
    public List<Course> getCourses() {
        return service.getAllCourses();
    }

    @PostMapping
    public Course addCourse(@Valid @RequestBody Course course) {
        return service.createCourse(course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Long id) {
        service.deleteCourse(id);
    }
}