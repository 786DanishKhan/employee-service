package com.example.employeeservice.controller;

import com.example.employeeservice.entity.Employee;
import com.example.employeeservice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @PostMapping
    public void addEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
    }

    @DeleteMapping
    public void deleteEmployee(@RequestParam Long id) {
        employeeRepository.deleteById(id);
    }

    @PutMapping
    public void updateEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
    }
}
