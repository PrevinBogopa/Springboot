Write a Spring Boot POST mapping in the EmployeeController class to create a new employee.
The endpoint should be /employees, and it should accept a request body in JSON format. The request body should contain the following fields: name, department, designation, and salary. Ensure that the incoming data is validated before creating the employee. Implement the necessary code to perform the following actions:



Extract the employee details from the request body.

Payload-1 Should be:
{
 "id": 1,
 "name": "John Doe",
 "department": "Human Resources",
 "designation": "HR Manager",
 "salary": 5000.0
}


Payload-2 Should be:
{
 "id": 2,
 "name": "Jane Smith",
 "department": "Marketing",
 "designation": "Marketing Executive",
 "salary": 4000.0
}


Validate the incoming data to ensure that all required fields are present and have appropriate values.



If the validation fails, return a suitable error response with appropriate status code and error message.

{
 "response": "Invalid employee data. Please provide all required fields."
}
If the validation succeeds, create a new Employee object with the extracted details.

Save the employee object in the database.



Return a response with the created employee's details, including the assigned ID.

Response-1 Should be:
{
 "id": 1,
 "name": "John Doe",
 "department": "Human Resources",
 "designation": "HR Manager",
 "salary": 5000.0
}


Response-2 Should be:
{
 "id": 2,
 "name": "Jane Smith",
 "department": "Marketing",
 "designation": "Marketing Executive",
 "salary": 4000.0
}


Your task is to complete the code for the POST mapping as described above. You can make use of Spring annotations and libraries, such as @PostMapping, @RequestBody, and any necessary validation annotations or techniques. Consider using appropriate HTTP status codes and response formats to handle success and failure scenarios.
