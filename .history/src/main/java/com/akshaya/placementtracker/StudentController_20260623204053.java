package com.akshaya.placementtracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/students")
    public student getStudents() {
        return new Student(
                1,
                "Akshaya Kannan",
                "Information Technology",
                "Not Placed"
        );
    }
}