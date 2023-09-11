Write a Spring Boot GET mapping in the EmployeeController class to retrieve the details of an employee with ID 1.


The endpoint should be /employees/{id} where {id} represents the ID of the employee. Implement the necessary code to perform the following actions:



Extract the id parameter from the request URL.

Validate the id parameter to ensure it is a positive integer.

If the id is invalid, return an appropriate error response with a suitable status code and error message.



If the id is valid, fetch the employee record with the corresponding ID from the database.

If the employee record does not exist, return an appropriate error response indicating that the employee with the specified ID was not found.

{
	"response":"Employee with ID 4 not found."
}
NOTE:
make sure you don't have data with id=4.
If the employee record exists, return a response with the employee details in JSON format.

Response Should be: 

{

  "id": 1,

  "name": "John Doe",

  “department": "Human Resources",

  "designation": "HR Manager",

  "salary": 5000.0

}

Your task is to complete the code for the GET mapping as described above. You can make use of Spring annotations and libraries, such as @GetMapping and appropriate response structures. Consider using appropriate HTTP status codes and response formats to handle success and failure scenarios.
