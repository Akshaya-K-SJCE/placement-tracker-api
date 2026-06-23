package com.akshaya.placementtracker;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> getStudents() {

        return List.of(
                new Student(1, "Akshaya Kannan", "IT", "Not Placed"),
                new Student(2, "Ravi", "CSE", "Placed"),
                new Student(3, "Anu", "AIDS", "Placed")
        );
    }
}