

Create a Spring Boot application to build an Employee Management System. The system should provide RESTful APIs to perform CRUD (Create, Read, Update, Delete) operations on employee records. Follow the steps below to complete the assignment.


Create an Employee entity:


The Employee entity should have the following attributes:



id: unique identifier for each employee (integer or UUID).

name: name of the employee (string).

department: department where the employee works (string).

designation: job designation of the employee (string).

salary: salary of the employee (decimal or float).

Define appropriate constructors, getters, and setters.



Create a REST Controller:


Create a Spring REST Controller class called EmployeeController.

Define the necessary mapping annotations to handle the following CRUD operations:

Create an employee: Use the HTTP POST method to create a new employee record.

Read employee details: Use the HTTP GET method to retrieve employee details by their ID.

Update an employee: Use the HTTP PUT method to update an existing employee record.

Delete an employee: Use the HTTP DELETE method to delete an employee by their ID.



Implement CRUD Operations:
Implement the necessary methods in the EmployeeController to perform the CRUD operations using the appropriate HTTP methods.

Make use of Spring Data JPA or any other ORM framework for database operations.
