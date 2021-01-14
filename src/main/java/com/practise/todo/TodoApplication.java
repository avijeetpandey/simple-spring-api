package com.practise.todo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import com.practise.todo.student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
		System.out.println("Server Started .....");
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(new Student(1L, "Avijeet Pandey", "avijeet@gmail.com", LocalDate.of(1997, Month.JANUARY, 5), 21),
				new Student(2L, "Aman Pandey", "aman@gmail.com", LocalDate.of(1998, Month.FEBRUARY, 8), 22));
	}

}
