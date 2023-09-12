package com.zaio.Controllers;

import java.util.Collections;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zaio.Entity.Department;
import com.zaio.Services.DepartmentService;

@RestController
public class DepartmentController {

 private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }


@PostMapping("/departments")
public ResponseEntity<Object> createDepartment(@RequestBody Department department) {
    // Validate the incoming data to ensure that the name field is not empty
    if (department.getDepartmentName() == null || department.getDepartmentName().isEmpty()) {
        return new ResponseEntity<>(Collections.singletonMap("response", "Invalid department data. Please provide all required fields."),
                HttpStatus.BAD_REQUEST);
    }

    // Save the Department object in the database
    Department createdDepartment = departmentService.saveDepartment(department);

    // Return a response with the created department's details, including the assigned ID
    return new ResponseEntity<>(createdDepartment, HttpStatus.CREATED);
}
}
