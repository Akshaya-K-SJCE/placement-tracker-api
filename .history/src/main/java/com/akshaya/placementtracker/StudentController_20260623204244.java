package com.akshaya.placementtracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/students")
    public Student getStudents() {
        return new student(
                1,
                "Akshaya Kannan",
                "Information Technology",
                "Not Placed"
        );
    }
}