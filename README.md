CurrentCharge: Electricity Billing System
Course: Object-Oriented Programming (CSEG1044)
Semester: IV


Project Overview
CurrentCharge is a desktop-based application designed to automate the electricity billing process. It allows administrators to manage consumer data, record meter readings, and generate accurate bills based on consumption slabs.

Features
Secure Login: Admin authentication module.

Consumer Management: Add and view consumer details including Name, SAP ID, and Meter Number.

Billing Logic: Automatic calculation based on residential and commercial unit rates.

Interactive Dashboard: A drill-down UI that shows a master list of consumers and allows viewing specific billing records upon selection.

Persistent Storage: Full CRUD operations using MySQL and JDBC.

Technology Stack
Language: Java (JDK 17+)  

GUI: Java Swing and AWT  

Database: MySQL  

Libraries: mysql-connector-java.jar (JDBC) and rs2xml.jar (ResultSet to Table Model)  

Repository Structure
src/
-- student/tracker/
---- Conn.java (JDBC Connection logic)
---- Login.java (User authentication)
---- Dashboard.java (Main UI with MouseListener)
lib/
-- rs2xml.jar (Required library for JTable)
database.sql (MySQL Schema and sample data)
README.md

Setup Instructions
Database Setup: Import database.sql into your MySQL server (Database name: oops).

Library Configuration: Add mysql-connector and rs2xml.jar to your project's build path or referenced libraries.

Run: Execute Login.java to start the application.

Team Contributions
As per the Capstone Project Submission Format:  

Abhinav Joshi (SAP ID: 590015785)
Role: Team Leader
Contribution: Planning, coordination  

Abhinav Joshi (SAP ID: 590015785)
Role: Backend Developer
Contribution: Logic, OOP design  

Mohit Gehlot (SAP ID: 590017989)
Role: GUI Developer
Contribution: Swing interface  

Rudra Pratap Singh Bisht (SAP ID: 590016590)
Role: Database/Test
Contribution: JDBC, testing
