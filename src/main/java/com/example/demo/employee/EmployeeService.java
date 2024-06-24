package com.example.demo.employee;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployee() {
        return List.of(
                new Employee(
                        1L,
                        "Sara Jones",
                        "sara.jones@outlook.com",
                        LocalDate.of(1995, Month.JANUARY, 12),
                        29,
                        "Developer"

                )
        );
    }
}
