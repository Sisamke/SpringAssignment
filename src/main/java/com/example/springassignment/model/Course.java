package com.example.springassignment.model;

import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long course_id;

    private String courseName;
    private String courseDescription;
    private String category; // Foundation, Undergraduate, Postgraduate

    public Course() {}

    public Course(Long course_id, String courseName, String courseDescription, String category) {
        this.course_id = course_id;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.category = category;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}