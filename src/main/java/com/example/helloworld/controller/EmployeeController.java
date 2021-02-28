package com.example.helloworld.controller;
import java.util.ArrayList;
import java.util.List;

import com.example.helloworld.model.Employee;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {

    private List<Employee> employees = createList();

    @GetMapping(value = "/employees")
    public List<Employee> firstPage() {
        return employees;
    }

    private static List<Employee> createList() {
        List<Employee> tempEmployees = new ArrayList<>();
        Employee emp1 = new Employee();
        emp1.setName("emp1");
        emp1.setDesignation("manager");
        emp1.setEmpId("1");
        emp1.setSalary(3000);

        Employee emp2 = new Employee();
        emp2.setName("emp2");
        emp2.setDesignation("developer");
        emp2.setEmpId("2");
        emp2.setSalary(3000);
        tempEmployees.add(emp1);
        tempEmployees.add(emp2);
        return tempEmployees;
    }

}