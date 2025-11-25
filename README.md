# Student Management System (Core Java)

This is a simple console-based Java program to manage student records.  
You can add, view, search, update, and delete students. It's built with just Core Java, so it's great for practicing OOP, collections, and basic input validation.

---

## Features

- Create student records (ID, Name, Age, Course, Marks)  
- List all students  
- Search by student ID  
- Search by partial name match  
- Update student details (name, age, course, marks)  
- Remove a student by ID  
- Validates input: unique ID, reasonable age, valid marks

---

## Project Structure

```
src/
├── model/
│ └── Student.java
├── service/
│ └── StudentService.java
└── app/
└── StudentManagementApp.java
```

- **model**: student data model  
- **service**: core logic for CRUD operations  
- **app**: user interface (console-based) and entry point

---

## How to Run Locally

1. Clone the repo:  
   `git clone https://github.com/vishal273007/student-mgmt-system`  
2. Open it in IntelliJ (or any Java IDE)  
3. Make sure JDK 8 (or later) is set up  
4. Run the main class: `app.StudentManagementApp` 

---

## Why I Built This / What I Learned

- To strengthen my understanding of **Object-Oriented Programming**  
- To work with `ArrayList` and practice storing data in memory  
- To handle console input and do basic validation  
- To structure a project using different packages (model, service, app)

---

## Next Steps (Future Enhancements)

- Persist data to a file or a database  
- Add sorting / filtering (like by marks or name)  
- Build a basic GUI using JavaFX or Swing  
- Write unit tests for service methods
