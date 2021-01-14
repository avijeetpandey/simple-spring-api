package com.practise.todo.student;

import java.util.List;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(1L, "Avijeet Pandey", "avijeet@gmail.com", LocalDate.of(1997, Month.JANUARY, 5), 21),
                new Student(2L, "Aman Pandey", "aman@gmail.com", LocalDate.of(1998, Month.FEBRUARY, 8), 22),
                new Student(3L, "Naman Pandey", "naman@gmail.com", LocalDate.of(1998, Month.JULY, 18), 52));
    }
}
