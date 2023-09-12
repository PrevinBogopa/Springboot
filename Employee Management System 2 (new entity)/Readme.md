In the Employee Management System,
you are required to introduce a new entity called Department to represent the department information.
Implement the Department entity with the following specifications:



Create a new Java class named Department annotated with @Entity to define it as an entity.

Include the following attributes in the Department class:

id - a unique identifier for the department (annotated with @Id.

name - a string representing the name of the department.

Provide appropriate constructors to create Department objects.

Generate getters and setters for all attributes.



Update the Employee entity class as follows:



Add a reference to the Department entity using appropriate annotations to define the relationship.



An employee can belong to only one department.

Ensure that the association between Employee and Department allows for a many-to-one relationship, where many employees can have one department.

Modify the Department entity to include a one-to-many relationship with the Employee entity.



Your task is to implement the Department entity as described above and update the Employee entity to establish the appropriate relationship between the two entities.

Make use of appropriate JPA annotations, such as @ManyToOne, @OneToMany, @JoinColumn, etc., to define the relationship between Employee and Department.



Note:



Ensure that you have an appropriate database schema in place to support the relationship between Employee and Department