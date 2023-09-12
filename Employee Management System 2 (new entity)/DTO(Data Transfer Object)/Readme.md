You are working on an Employee Management System that requires a DTO (Data Transfer Object) called EmployeeSalaryDTO.


GET mapping in the EmployeeController class to retrieve all employees id, salary and departmentName.

The endpoint should be /employees/salary and should return a list of all employee records available in the system.



This DTO is used to represent employee salary information and contains the following fields:

id (Long): Represents the unique identifier of the employee.

salary (double): Represents the salary of the employee.

departmentName (String): Represents the name of the department the employee belongs to.

Your task is to create the EmployeeSalaryDTO class with appropriate fields, constructors, and getters/setters.



Additionally, implement the necessary code to perform the following actions:


Create an instance of the EmployeeSalaryDTO class.

Set the id field to a specific value.

Set the salary field to a specific value.

Set the departmentName field to a specific value.



Retrieve the value of the id field from the EmployeeSalaryDTO instance.

Retrieve the value of the salary field from the EmployeeSalaryDTO instance.

Retrieve the value of the departmentName field from the EmployeeSalaryDTO instance.



Response Should be :
[
  {
    "id": 1,
    "salary": 50000.0,
    "departmentName": "Computer Science"
  },
  {
    "id": 2,
    "salary": 80000.0,
    "departmentName": "Data Science"
  }
]


NOTE :
make sure you have these two objects in your Employee table .


Your implementation should ensure appropriate encapsulation of the fields and follow Java best practices for class design.