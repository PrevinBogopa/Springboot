package com.zaio.Controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zaio.Entity.Employee;
import com.zaio.MessageHandling.Response;
import com.zaio.Services.EmployeeService;
@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PutMapping("employees/{id}")
    public ResponseEntity<Object> updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {

        Optional<Employee> existingEmployeeOptional = employeeService.getEmployeeById(id);
        if (existingEmployeeOptional.isPresent()) {
            Employee existingEmployee = existingEmployeeOptional.get();

            // Update details
            existingEmployee.setName(updatedEmployee.getName());
            existingEmployee.setDepartment(updatedEmployee.getDepartment());
            existingEmployee.setDesignation(updatedEmployee.getDesignation());
            existingEmployee.setSalary(updatedEmployee.getSalary());

            Employee updated = employeeService.saveEmployee(existingEmployee);

            return ResponseEntity.ok(updated);
        } else {
            String errorMessage = "Employee with ID " + id + " not found.";
            return new ResponseEntity<>(new Response(errorMessage), HttpStatus.NOT_FOUND);
        }
    }
}
