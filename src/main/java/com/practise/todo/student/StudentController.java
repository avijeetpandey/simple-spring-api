package com.practise.todo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Avijeet Pandey", "avijeet@gmail.com", LocalDate.of(1997, Month.JANUARY, 5), 21),
                new Student(2L, "Aman Pandey", "aman@gmail.com", LocalDate.of(1998, Month.FEBRUARY, 8), 22));
    }
}