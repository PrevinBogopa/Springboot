package com.zaio.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.zaio.Entity.Employee;
import com.zaio.Repositories.EmployeeRepository;
import com.zaio.Services.EmployeeService;

@RestController
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
	    @GetMapping("/employees/{id}")
	    public ResponseEntity<Object> getEmployeeById(@PathVariable Long id) {
		        Employee employee = employeeRepository.findById(id).orElse(null);

	        if (employee == null) {
	            String errorMessage = "Employee with ID " + id + " not found.";
	            return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
	        } else {
	          return new ResponseEntity<>(employee, HttpStatus.OK);
	        }
	    }
	}