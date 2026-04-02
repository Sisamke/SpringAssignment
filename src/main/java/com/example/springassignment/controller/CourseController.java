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

    // GET ALL
    @GetMapping
    public List<Course> getAllCourses() {
        return service.getAllCourses();
    }

    // GET BY CATEGORY
    @GetMapping("/category/{type}")
    public List<Course> getByCategory(@PathVariable String type) {
        return service.getCoursesByCategory(type);
    }

    // CREATE
    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return service.createCourse(course);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable Long id) {
        return service.deleteCourse(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Course updateCourse(@PathVariable Long id, @RequestBody Course course) {
        return service.updateCourse(id, course);
    }
}