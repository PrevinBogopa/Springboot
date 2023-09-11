package com.zaio.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zaio.Entity.Employee;
import com.zaio.Repositories.EmployeeRepository;

@Service
public class EmployeeService {

//    create save method to save employee
	
 
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Create a method to save an employee
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployeesManually() {
        return employeeRepository.findAll();
    }
}
