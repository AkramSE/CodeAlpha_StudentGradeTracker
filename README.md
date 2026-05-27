<h1 align="center">🎓 Enterprise Student Grade Tracker</h1>

<div align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Data_Structures-007396?style=for-the-badge" alt="Data Structures"/>
  <img src="https://img.shields.io/badge/OOP-Principles-4CAF50?style=for-the-badge" alt="OOP Principles"/>
</div>

<br>

Welcome to the **Student Grade Tracker**. This repository contains a robust, console-based (CLI) application built entirely in **Java** for the CodeAlpha Internship. It demonstrates a strong command over core programming concepts, object-oriented programming (OOP), algorithm optimization, and clean code architecture.

## 🚀 Projects Overview

Here are the technical details and features of this application:

### 📊 System Features & Optimizations
* **Dynamic Data Handling:** Utilizes `ArrayList` to ensure unrestricted and scalable student data entry without hardcoded array limits.
* **Algorithmic Efficiency [O(n)]:** Implements a single-pass algorithm to simultaneously compute Average, Highest, and Lowest grades.
* **Rank Generation [O(n log n)]:** Incorporates the `Comparable` interface to dynamically sort and rank students from highest to lowest scores.
* **Strict Validation:** Employs Regular Expressions (`Regex`) to validate string inputs and robust Exception Handling to secure numeric inputs against system crashes.
* **Automated Analytics:** Automatically computes corresponding Letter Grades (A, B, C, D, F) based on standard academic criteria.

## 🏗️ System Architecture

The application adheres strictly to the **Separation of Concerns (SoC)** principle:
1. `Student.java` **(Model):** Encapsulates core data and sorting mechanics.
2. `GradeStatistics.java` **(DTO):** Ensures immutable data transfer for computed metrics.
3. `GradeTrackerService.java` **(Service):** Houses the core business logic and algorithms.
4. `Main.java` **(UI):** Manages user interactions and console formatting.

## ⚙️ How to Run Locally

1. Clone the repository: 
   ```bash
   git clone [https://github.com/AkramSE/CodeAlpha_StudentGradeTracker.git](https://github.com/AkramSE/CodeAlpha_StudentGradeTracker.git)
   
