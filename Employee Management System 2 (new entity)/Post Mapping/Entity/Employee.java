package com.zaio.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "employees")
public class Employee {

	    @Id
	    private Long id;
	    private String name;
	    private String designation;
	    private double salary;

	    @ManyToOne
	    @JoinColumn(name = "department_id")
	    private Department department;

	    public Employee() {
	    	
	    }
	    
		public Employee(Long id, String name, String designation, double salary, Department department) {
			super();
			this.id = id;
			this.name = name;
			this.designation = designation;
			this.salary = salary;
			this.department = department;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public Department getDepartment() {
			return department;
		}

		public void setDepartment(Department department) {
			this.department = department;
		}

	    // Getters and setters for all fields

	
}
