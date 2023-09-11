Write a Spring Boot DELETE mapping in the EmployeeController class to delete an employee with ID 2.


The endpoint should be /employees/{id} where {id} represents the ID of the employee. Implement the necessary code to perform the following actions:



Extract the id parameter from the request URL.

Validate the id parameter to ensure it is a positive integer.

If the id is invalid, return an appropriate error response with a suitable status code and error message.

If the id is valid, check if an employee record with the corresponding ID exists in the database.

If the employee record does not exist, return an appropriate error response indicating that the employee with the specified ID was not found.


Response Should be:
{
    "response": "Employee with ID 4 not found."
}
NOTE :
Make sure your data with id=4 is not exist in the database using postman.


If the employee record exists, delete the employee from the database.

Response Should be:
{"response":"Data has been Created"}
NOTE:
Make sure your data with id=2 exist in the database .
Return a response indicating the success of the deletion, along with any additional relevant information.

Your task is to complete the code for the DELETE mapping as described above. You can make use of Spring annotations and libraries, such as @DeleteMapping and appropriate response structures.