package com.example.demo.employee;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository) {
        return args -> {
            Employee sara = new Employee(
                    "Sara Jones",
                    "sara.jones@outlook.com",
                    LocalDate.of(1995, Month.JANUARY, 12),
                    29,
                    "Developer"
            );

            Employee jack = new Employee(
                    "Jack Jones",
                    "jack.jones@outlook.com",
                    LocalDate.of(2000, Month.MARCH, 5),
                    24,
                    "UI Designer"

            );

            repository.saveAll(
                    List.of(sara, jack)
            );
        };
    }
}
