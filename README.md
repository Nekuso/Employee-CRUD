## Employee CRUD Program

1. Understanding the concept and principle of object-oriented programming.
2. Creating user-defined class along with the pertinent fields and behavior of the class.
3. Developing a program that creates an array of objects of the user-defined class created.
4. Creating a menu that allows the user to perform the following operations on the array of objects of the user-defined class created.

- DESCRIPTION
Create a class named Employee that will contain data members (instance variables) and
methods to allow consistency in the company programs. Your class should meet the criteria in
the following list:
 String data members for last name and first name
 Character data for department
- Departments are categorized as:

o A – Management
o B – Finance
o C - Marketing

 Double data member for rate of pay
 Public method to calculate the employee pay

– This method should ask the user to enter for the number of hours worked during the
week, calculates the pay amount, and displays the weekly salary. Hours worked
greater than 40 should be paid double. (rate of pay * hours worked)
 Other necessary setter and getter methods
- Note that rate of pay is observed the following bracket, ensure that the setter
method validates the inputted rate of pay. You may have an if statement in your
setter method to validate set values.
Department Rate of Pay Range (per hour)

A P 200.00 – 250.00
B P 180.00 – 199.00
C P 150.00 – 179.00

In the main() method, create a MENU where users can:
[1] – Add new Employee record
[2] – Modify Employee record
[3] – Delete Employee record
[4] – View all Employee records
Loop the entire program until user choose [5] – Exit (add this in the MENU).
All values for the data members MUST be from the users’ ENTRY.