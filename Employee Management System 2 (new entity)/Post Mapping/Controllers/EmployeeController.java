package com.zaio.Controllers;

import java.util.Collections;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zaio.Entity.Department;
import com.zaio.Entity.Employee;
import com.zaio.Services.DepartmentService;
import com.zaio.Services.EmployeeService;


@RestController
public class EmployeeController {
    private final EmployeeService employeeService;
    private final DepartmentService departmentService;

    public EmployeeController(EmployeeService employeeService, DepartmentService departmentService) {
        this.employeeService = employeeService;
        this.departmentService = departmentService;
    }

    @PostMapping("/employees")
    public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
        // Validate the incoming data to ensure that the required fields are present and have appropriate values
        if (employee.getName() == null || employee.getName().isEmpty()) {
            return new ResponseEntity<>(Collections.singletonMap("response", "Invalid employee data. Please provide all required fields."), HttpStatus.BAD_REQUEST);
        }

        // Check if department is provided in the request body
        if (employee.getDepartment() != null) {
            // If department is provided, try to fetch it from the database using department id
            Department existingDepartment = departmentService.getDepartmentById(employee.getDepartment().getId());
            if (existingDepartment == null) {
                // If department with the given id does not exist, create a new department
                existingDepartment = departmentService.saveDepartment(employee.getDepartment());
            }
            // Set the department in the employee object
            employee.setDepartment(existingDepartment);
        }

        // Save the employee object in the database
        Employee createdEmployee = employeeService.saveEmployee(employee);

        // Return a response with the created employee id
        return new ResponseEntity<>(Collections.singletonMap("response", "employee with id " + createdEmployee.getId() + " has been created"), HttpStatus.CREATED);
    }
}
