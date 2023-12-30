--Queries to create table and insert data
-- Create Students table
CREATE TABLE Students (
    Student_No INT PRIMARY KEY,
    Forename VARCHAR(50),
    Surname VARCHAR(50)
);

-- Insert sample data into Students table
INSERT INTO Students (Student_No, Forename, Surname)
VALUES
    (1, 'John', 'Doe'),
    (2, 'Jane', 'Smith'),
    (3, 'Emile', 'Zola');

-- Create Marks table
CREATE TABLE Marks (
    Student_No INT,
    Module_Name VARCHAR(50),
    Mark INT,
    FOREIGN KEY (Student_No) REFERENCES Students(Student_No)
);

-- Insert sample data into Marks table
INSERT INTO Marks (Student_No, Module_Name, Mark)
VALUES
    (1, 'Math', 90),
    (1, 'Science', 75),
    (2, 'Math', 85),
    (2, 'Science', 70),
    (3, 'Math', 95),
    (3, 'Science', 80);



-- Question 1. DISPLAY STUDENT NO. AND TOTAL MARKS OF EACH STUDENT HAVING TOTAL MARKS GREATER 
-- THAN 160.

 select students.Student_No, SUM(Mark) as TOTAL_MARKS 
 from students inner join marks 
 on students.Student_No=marks.Student_No 
 group by students.Student_No having SUM(marks.Mark)>160;

-- Question 2. DISPLAY STUDENT NAME (FORENAME + SURNAME), MODULE NAME, AND MARK OF STUDENTS 
-- HAVING MARK GREATER THAN THE MARK OF EMILE ZOLA IN THE DATABASES MODULE USING 
-- JOINS. 

Select CONCAT(Forename," ",Surname), Module_Name, Mark as Marks 
from students inner join marks 
on students.Student_No=marks.Student_No 
group by students.Student_No having SUM(Mark)>
(select SUM(Mark) from marks where Student_No = 3);
