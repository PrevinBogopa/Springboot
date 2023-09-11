Write a Spring Boot PUT mapping in the EmployeeController class to update the details of an employee with ID 1.


The endpoint should be /employees/{id} where {id} represents the ID of the employee. Implement the necessary code to perform the following actions:



Extract the id parameter from the request URL.

Validate the id parameter to ensure it is a positive integer.

If the id is invalid, return an appropriate error response with a suitable status code and error message.

If the id is valid, fetch the employee record with the corresponding ID from the database.

If the employee record does not exist, return an appropriate error response indicating that the employee with the specified ID was not found.

{
    "response": "Employee with ID 4 not found."
}
NOTE:
Make sure you don't have data with id=4 in your employee table using postman.
If the employee record exists, extract the updated employee details from the request body in JSON format.

Payload Should be :
{
"id":1,
 "name": "Jane Smith",
 "department": "Sales",
 "designation": "Sales Manager",
 "salary": 5500.0
}

Response Should be:
{
"id":1,
 "name": "Jane Smith",
 "department": "Sales",
 "designation": "Sales Manager",
 "salary": 5500.0
}
Validate the updated employee data to ensure all required fields are present and have appropriate values.

If the validation fails, return a suitable error response with appropriate status code and error message.

If the validation succeeds, update the existing employee record with the new details.

Save the updated employee record in the database.

Return a response with the updated employee details in JSON format.

Your task is to complete the code for the PUT mapping as described above. You can make use of Spring annotations and libraries, such as @PutMapping, @PathVariable, @RequestBody, and appropriate response structures.

