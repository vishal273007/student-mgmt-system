# Student Management System (Core Java)

A simple console-based Java program to manage student records. 
You can add, view, search, update, and delete students. 
Built with Core Java, this project is great for practicing OOP, collections, and basic input validation.

---

## Features

- Create student records (ID, Name, Age, Course, Marks)  
- List all students  
- Search by student ID  
- Search students by name (partial match)  
- Update student details  
- Delete a student  
- Basic validation for unique ID, age, and marks  

---

## Project Structure

```
src/
├── model/
│   └── Student.java
│
├── service/
│   └── StudentService.java
│
└── app/
    └── StudentManagementApp.java
```

- **model** – contains the Student class  
- **service** – business logic (CRUD operations)  
- **app** – main class with console menu  

---

## How to Run

1. Clone the repository:  
   ```
   git clone https://github.com/vishal273007/student-mgmt-system
   ```
2. Open the project in IntelliJ IDEA (or any Java IDE)  
3. Ensure JDK 8 or above is set  
4. Run the main class:  
   ```
   app.StudentManagementApp
   ```

---

## What This Project Demonstrates

- Object-Oriented Programming (OOP)  
- Working with `ArrayList`  
- CRUD operations  
- Basic input handling and validation  
- Clean package organization  
