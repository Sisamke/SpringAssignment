SPRING BOOT ASSIGNMENT REPORT (PART A & PART B)
🟢 1. Introduction

This assignment focuses on developing a backend application using Spring Boot. The goal was to understand how modern Java frameworks are used to build RESTful web services and manage data efficiently.

The project was divided into two parts:

Part A: Project setup and configuration
Part B: Implementation of CRUD operations and validation
🟢 2. Part A: Project Setup
🔹 2.1 Creating the Spring Boot Project

The project was created using IntelliJ IDEA. A Spring Boot application was generated with the necessary dependencies to support web development.

🔹 2.2 Project Structure

The project followed a layered architecture with the following packages:

model → contains entity classes
repository → handles database access
service → contains business logic
controller → handles HTTP requests

This structure improves organization and separation of concerns.

🔹 2.3 Dependency Management

Dependencies were managed using Maven in the pom.xml file. The following were included:

Spring Web → for building REST APIs
Spring Data JPA → for database interaction
Validation → for input checking
H2 Database → for testing
🔹 2.4 Version Control

The project was linked to Git and uploaded to GitHub for version control. This allows tracking changes and backing up the project.

🔹 2.5 Running the Application

The application was successfully run within IntelliJ, confirming that the Spring Boot setup was correct.

🟢 3. Part B: CRUD Operations and Validation
🔹 3.1 Model Layer

A Course class was created to represent course data.

It includes:

ID (auto-generated)
Course name
Course description

Annotations such as @Entity were used to map the class to a database table.

🔹 3.2 Repository Layer

The CourseRepository interface extends Spring Data JPA.

This provides built-in methods such as:

save()
findAll()
findById()
deleteById()

No manual SQL queries were required.

🔹 3.3 Service Layer

The service layer was used to implement business logic.

It contains methods to:

Retrieve all courses
Create a course
Update a course
Delete a course

This layer ensures that logic is separated from the controller.

🔹 3.4 Controller Layer
: 
The controller exposes REST endpoints to interact with the system.

Implemented Endpoints:
Operation	Method	Endpoint
Create	POST	/courses
Read	GET	/courses
Update	PUT	/courses/{id}
Delete	DELETE	/courses/{id}

These endpoints allow users to interact with the application using HTTP requests.

🔹 3.5 Validation

Validation was implemented using annotations.

Used Annotations:
@NotBlank → prevents empty fields
@Valid → triggers validation in controller
Purpose:
Ensures data accuracy
Prevents invalid input from being stored

If invalid data is submitted, the system returns an error response.

🔹 3.6 Testing the Application

The application was tested using tools such as:

Browser (for GET requests)
Postman (for POST, PUT, DELETE requests)

Testing confirmed that all CRUD operations function correctly.

🟢 4. Conclusion

The assignment successfully demonstrated how to build a Spring Boot application from setup to implementation.

Key achievements:

Successfully configured a Spring Boot project
Implemented full CRUD operations
Applied validation to ensure data integrity
Tested endpoints to confirm functionality

The project shows how Spring Boot simplifies backend development and supports scalable application design.