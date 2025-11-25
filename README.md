# Student Management System (Core Java)

Beginner-friendly console project to practice Core Java fundamentals while managing student records (add, list, search, update, delete) using plain Java SE.

---

## Why this project?

- Reinforce **OOP** concepts (classes, encapsulation, simple service layer)
- Practice with **`ArrayList`**, loops, and `Scanner`
- Learn basic **input validation** and menu-driven programs 
- Understand how to organize code with packages (`model`, `service`, `app`)

---

## Prerequisites

- JDK 8+ installed (`java -version` to confirm)
- Any IDE or text editor that can run Java (IntelliJ IDEA, VS Code, etc.)
- Terminal access to compile/run classes

---

## Quick Start

```bash
git clone https://github.com/vishal273007/student-mgmt-system.git
cd student-mgmt-system
javac -d out src/model/Student.java src/service/StudentService.java src/app/StudentManagementApp.java
java -cp out app.StudentManagementApp
```

> Tip: In an IDE, just run `StudentManagementApp` and the console menu will appear.

---

## Key Features

| Action | What you practice |
| --- | --- |
| Add student | Creating objects, validating IDs/age/marks |
| List students | Iterating over collections |
| Search (ID / name) | Conditional logic + string comparisons |
| Update / Delete | CRUD flow and error handling |

---

## Project Layout

```
src/
├─ model/   → Student data class
├─ service/ → CRUD + validation logic
└─ app/     → Main menu + user input
```

---

## Next Practice Ideas

1. Persist students to a text/JSON file.
2. Add GPA/grade calculations.
3. Replace console input with JavaFX/Swing (still Core Java).

Keep this repo focused on Core Java only—Spring or other frameworks can live in a separate project.
