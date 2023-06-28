package com.jayvon.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents() {
        return List.of(
                new Student("James", "Bond", LocalDate.now(), "jamesbond@777.com", 36),
                new Student("spongebob", "squarepants", LocalDate.now(), "spongey@bikinibottom.com", 42)
        );
    }

}
