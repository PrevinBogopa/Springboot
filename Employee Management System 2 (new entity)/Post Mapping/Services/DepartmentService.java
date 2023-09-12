package com.zaio.Services;

import com.zaio.Entity.Department;
import com.zaio.Repositories.DepartmentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department saveDepartment(Department department) {
     
    	return departmentRepository.save(department);
    }
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

}
