# 🎓 Enterprise Student Grade Tracker

*A robust, scalable, and highly efficient console-based application for managing student grades and computing advanced analytical statistics. Built with Core Java.*

## 🚀 Project Overview
Developed as a core technical task for the **Java Programming Internship at CodeAlpha**, this project transcends a basic grade tracking script. It integrates clean coding practices, a modular **Model-Service-UI architecture**, and strict input validation to simulate a professional backend environment.

## ✨ Technical Features & Optimizations
* **Dynamic Data Structures:** Utilizes `ArrayList` to ensure unrestricted and scalable student data entry without hardcoded array limits.
* **Algorithmic Efficiency [O(n)]:** Implements a single-pass algorithm to simultaneously compute Average, Highest, and Lowest grades, significantly reducing time complexity.
* **Rank Generation [O(n log n)]:** Incorporates the `Comparable` interface to dynamically sort and rank students from highest to lowest scores.
* **Strict Regex Validation:** Employs Regular Expressions (`^[a-zA-Z\s]+$`) to validate string inputs (names) and robust Exception Handling to secure numeric inputs against system crashes.
* **Automated Analytics:** Automatically computes corresponding Letter Grades (A, B, C, D, F) and tracks Pass/Fail ratios based on standard academic criteria.

## 🏗️ System Architecture
The application adheres strictly to the **Separation of Concerns (SoC)** principle:
1. **`Student.java` (Model):** Encapsulates core data and sorting mechanics.
2. **`GradeStatistics.java` (DTO):** Ensures immutable and secure data transfer for computed metrics.
3. **`GradeTrackerService.java` (Service):** Houses the core business logic and algorithms, decoupled from the UI.
4. **`GradeTrackerApplication.java` (UI):** Manages user interactions, strict validations, and formatted console outputs.

## 🛠️ Tech Stack
* **Language:** Core Java
* **Concepts:** Object-Oriented Programming (OOP), Data Structures & Algorithms (DSA), Exception Handling, Regular Expressions.

## ⚙️ How to Run Locally
1. Clone the repository: 
   ```bash
   git clone [https://github.com/AkramSE/CodeAlpha_StudentGradeTracker.git](https://github.com/AkramSE/CodeAlpha_StudentGradeTracker.git)
   
