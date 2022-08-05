package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student artak = new Student(
                    "Artak",
                    "artak@gmail.com",
                    LocalDate.of(1997, APRIL, 8),
                    25
            );

            Student ann = new Student(
                    "Ann",
                    "ann@gmail.com",
                    LocalDate.of(1997, JUNE, 26),
                    25
            );

            repository.saveAll(List.of(artak, ann));
        };
    }
}
