# Bug Tracking System (Core Java)

## 📌 Project Overview
This is a basic console-based **Bug Tracking System** developed using **Core Java**.  
The application allows users to add bugs, view all reported bugs, and close bugs.  
It follows clean code principles and uses **JUnit** for unit testing.

---

## 🛠 Technologies Used
- Core Java  
- JUnit 5  
- Agile Methodology  
- Scrum  
- Test-Driven Development (TDD)

---

## ⚙️ Features
- Add new bugs with unique ID
- Prevent duplicate bug IDs
- View all reported bugs
- Close bugs by ID
- Unit testing using JUnit

---

## 📂 Project Structure
```

Bug Tracking System
└── src
├── Bug.java
├── BugService.java
├── BugServiceTest.java
└── Main.java

```

---

## 🧠 Design Concepts Used
- Encapsulation (private fields with getters)
- Service-based class design
- Validation for duplicate and invalid bug IDs
- Loop optimization using `break`
- Separation of logic and execution

---

## 🧪 Testing
JUnit test cases are written to verify:
- Bug creation
- Duplicate bug ID validation
- Closing existing bugs
- Handling invalid bug IDs

---

## 🚀 How to Run
1. Clone the repository  
2. Open project in IntelliJ IDEA  
3. Run `Main.java`  
4. Run `BugServiceTest.java` to execute unit tests  

---

## 🔄 Agile & Scrum Implementation
- Features developed incrementally
- Each functionality treated as a sprint task
- TDD followed using JUnit
- Manual + automated testing approach

---

## 📌 Future Enhancements
- Add bug priority and severity
- Implement user roles (Admin / Tester)
- Store data using database
- Add console-based menu system

---
