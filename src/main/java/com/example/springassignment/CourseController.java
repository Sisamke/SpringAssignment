package com.example.springassignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public String getCourses(){
        return "Foundation Courses:\n"+
                "1. COMPUTER LITERACY FOR SCIENCE(F)\n"+
                "2. ELEMENTARY COMPUTER PROGRAMMING\n"+

                "Undergraduate Courses:\n"+
                "1. OPERATING SYSTEM\n"+
                "2. OBJECT-ORIENTED PROGRAMMING\n"+
                "3. SOFTWARE ENGINEERING \n"+
                "4. INTRODUCTION TO COMPUTER NETWORKS\n"+
                "5. ADVANCE PROGRAMMING\n"+

                "Honours Courses:\n"+
                "1. HUMAN COMPUTER INTERACTION\n"+
                "2. INTELLIGENT SYSTEMS\n"+
                "3. PARALLEL AND DISTRIBUTED SYSTEM\n"+
                "4. ADVANCED JAVA\n";

    }
}
