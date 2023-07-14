# Student Management System

The Student Management System is a Java-based project that provides a robust solution for modeling and managing the relationship between Students,courses,books,laptop and their Addresses. Built using Spring Boot and JPA, this project offers a RESTful API for performing CRUD operations on the all models. The data is stored in a MySQL database, ensuring efficient and reliable data management.

## Technologies Used

The following technologies are utilized in this project:

- Java
- Spring Framework
- Hibernate
- MySQL

## API Endpoints

The system provides the following API endpoints for seamless integration and interaction with the application:

### Student Endpoints

- `GET /student`: Retrieve a list of all student.
- `GET /student/{id}`: Retrieve an student by their ID.
- `POST /student`: Create a new student.
- `PUT /student/{id}`: Update an existing student.
- `DELETE /student/{id}`: Delete an student.

### Course Endpoints

- `GET /course`: Retrieve a list of all course.
- `GET /course/{id}`: Retrieve an course by their ID.
- `POST /course`: Create a new course.
- `PUT /course/{id}`: Update an existing course.
- `DELETE /course/{id}`: Delete an course.

  ### Book Endpoints

- `GET /book`: Retrieve a list of all book.
- `GET /book/{id}`: Retrieve an book by their ID.
- `POST /book`: Create a new book.
- `PUT /book/{id}`: Update an existing book.
- `DELETE /book/{id}`: Delete an book.

   ### Laptop Endpoints

- `GET /laptop`: Retrieve a list of all laptop.
- `GET /laptop/{id}`: Retrieve an laptop by their ID.
- `POST /laptop`: Create a new laptop.
- `PUT /laptop/{id}`: Update an existing laptop.
- `DELETE /laptop/{id}`: Delete an laptop.

### Address Endpoints

- `GET /addresses`: Retrieve a list of all addresses.
- `GET /addresses/{id}`: Retrieve an address by its ID.
- `POST /addresses`: Create a new address.
- `PUT /addresses/{id}`: Update an existing address.
- `DELETE /addresses/{id}`: Delete an address.

## Controllers

The project includes two controllers to handle requests related to the Employee and Address models:

### StudenteController

The `StudentController` handles requests related to the Student model, providing a seamless interface to perform CRUD operations.

### AddressController

The `AddressController` handles requests related to the Address model, enabling the manipulation of address information effortlessly.

## Services

The project includes two services responsible for implementing the business logic and handling CRUD operations on the Employee and Address models:

###StudentService

The `StudentService` encapsulates the logic for performing CRUD operations on the Student model, ensuring efficient and secure data management.

### AddressService

The `AddressService` facilitates CRUD operations on the Address model, providing comprehensive functionality to manage address information with ease.

## Repositories

The project utilizes five repositories to interact with the data source and perform database operations:

### StudentRepository

The `StudentRepository` provides access to the Student data source, allowing seamless retrieval and storage of student-related information.

### AddressRepository

The `AddressRepository` facilitates interaction with the Address data source, ensuring efficient and reliable management of address information.

## Summary

The Student Management System is a Java-based solution that offers a professional and efficient way to manage student and address information. Leveraging the power of Java, Spring Framework, Hibernate, and MySQL, it provides a RESTful API for performing CRUD operations on both the student and Address models. To contribute to this project, simply fork the repository, make your enhancements, and submit a pull request.

We welcome contributions and look forward to further improving this management system to meet the evolving needs of businesses and organizations.
