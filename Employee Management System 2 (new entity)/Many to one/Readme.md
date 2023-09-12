Update Employee entity with the @ManyToOne relation with the Department entity.


Create a Spring Boot POST mapping in the EmployeeController class to create a new employee.
The endpoint should be /employees, and it should accept a request body in JSON format.

The request body should contain the following fields:

id, name, designation, salary, and department.

Payload-1 Should be:
{
   "id":1,
  "name": "John Doe",
  "designation": "Software Engineer",
  "salary": 50000.0,
  "department": {
    "id":1,
    "departmentName":"Computer Science"
  }
}

Note :
you may get an Error for Payload-2

So, you need to handle , If the department field is not provided, then create new department before creating Employee.

Payload-2 Should be:
{
   "id":2,
  "name": "John Smith",
  "designation": "Senior Software Engineer",
  "salary": 80000.0,
  "department": {
    "id":3,
    "departmentName":"Data Science"
  }
}


Ensure that the incoming data is validated before creating the employee. The name field is required and cannot be empty.



Implement the necessary code to perform the following actions:
Extract the employee details from the request body.

Validate the incoming data to ensure that the required fields are present and have appropriate values.

If the validation fails, return a suitable error response with the corresponding status code and error message.

{
 "response": "Invalid employee data. Please provide all required fields."
}
If the validation succeeds, create a new Employee object with the extracted details.

Set the department field of the Employee entity using the provided department field in the request body.

The department field should contain the id of an existing department in the database.

If the department field is not provided, then create new department before creating Employee.

Save the employee object in the database.

Return a response with the created employee id.

Response-1 Should be:
{
    "response": "employee with id 1 has been created"
}
Response-2 Should be:
{
    "response": "employee with id 2 has been created"
}


Note:
The Employee entity has been updated with the following fields: id, name, designation, salary, and a department field annotated with @ManyToOne relation to the Department entity. The department field represents the associated department of the employee, and it should contain the id of an existing department in the database.



Your task is to complete the code for the POST mapping as described above. You can make use of Spring annotations and libraries, such as @PostMapping, @RequestBody, @Valid, and any necessary validation annotations or techniques.



Feel free to add any additional error handling, logging, or enhancements you deem necessary.

