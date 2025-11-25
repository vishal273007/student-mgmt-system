# Student Management System (Core Java)

A simple console-based Java application that manages student records using Core Java concepts. This project is designed for beginners and is suitable as a fresher-level resume project.

---

## Features
- Add new students (ID, Name, Age, Course, Marks)
- View all students
- Search student by ID
- Search students by name (partial match)
- Update student details
- Delete a student
- Basic validation (unique ID, valid age, valid marks)

---

## Project Structure

```
src/
├── model/
│   └── Student.java
├── service/
│   └── StudentService.java
└── app/
    └── StudentManagementApp.java
```

- **model** – student data structure (POJO)
- **service** – logic for CRUD operations
- **app** – main class with menu-driven console UI

---

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/vishal273007/student-mgmt-system
   ```
2. Open the project in IntelliJ (or any Java IDE).
3. Ensure JDK 8+ is configured.
4. Run the main class:
   ```
   app.StudentManagementApp
   ```

---

## What This Project Demonstrates
- Object-Oriented Programming  
- Collections (`ArrayList`)  
- CRUD operations  
- Input handling (Scanner)  
- Code organization using packages  

---

## Optional Future Enhancements
- Save data to a text file or database  
- Sorting or filtering options  
- Add a simple Swing or JavaFX UI  

---

A clean and beginner-friendly Core Java project suitable for learning and showcasing fundamental Java skills.
