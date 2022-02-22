package com.example.Student.portal.backend.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> hello(){
        return List.of(
                new Student(
                        1L,
                        "Gerrard",
                        "Gerrard.dev@gmail.com",
                        LocalDate.of(1991, Month.MAY, 26),
                        21
                )
        );

}
