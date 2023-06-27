package com.jayvon.springdemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudents() {
        return List.of(
                new Student("James", "Bond", LocalDate.now(), "jamesbond@777.com", 36),
                new Student("spongebob", "squarepants", LocalDate.now(), "spongey@bikinibottom.com", 42)
        );
    }

}
