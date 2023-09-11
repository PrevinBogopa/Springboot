package com.zaio.Repositories;

import com.zaio.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	  Employee findById(long id);
}
