package com.zaio.Controllers;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.zaio.Entity.Employee;
import com.zaio.MessageHandling.Response;
import com.zaio.Repositories.EmployeeRepository;

@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
	   
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Object> deleteEmployeeById(@PathVariable Long id) {

        Employee employee = employeeRepository.findById(id).orElse(null);

        if (employee == null) {

            String errorMessage = "Employee with ID " + id + " not found.";
            return new ResponseEntity<>(new Response(errorMessage), HttpStatus.NOT_FOUND);
        }
        employeeRepository.delete(employee);

        String successMessage = "Data has been Created";
        return new ResponseEntity<>(new Response(successMessage), HttpStatus.OK);
    }}
