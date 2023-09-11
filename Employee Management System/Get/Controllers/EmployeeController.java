package com.zaio.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zaio.Entity.Employee;
//import com.zaio.MessageHandling.Response;
import com.zaio.Services.EmployeeService;

@RestController
public class EmployeeController {


	    @Autowired
	    private EmployeeService employeeService;

//	  @PostMapping("/employees")
//	    public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
//
//	        if (employee.getId() == null || employee.getName() == null ||
//	                employee.getDepartment() == null || employee.getDesignation() == null || employee.getSalary() == 0.0) {
//	            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//	                    .body(new Response("Invalid employee data. Please provide all required fields."));
//	        }
//
//	        Employee createdEmployee = employeeService.saveEmployee(employee);
//
//	        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
//	    }
	  
	    @GetMapping("/employees")
	    public ResponseEntity<Object> getAllEmployees() {
	        List<Employee> employees = employeeService.getAllEmployees();
	        return ResponseEntity.ok(employees);
	    }

	}