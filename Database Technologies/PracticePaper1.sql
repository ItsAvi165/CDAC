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

     SELECT students.Student_No, SUM(Mark) AS TOTAL_MARKS 
     FROM students INNER JOIN marks 
     ON students.Student_No=marks.Student_No 
     GROUP BY students.Student_No HAVING SUM(marks.Mark)>160;

-- Question 2. DISPLAY STUDENT NAME (FORENAME + SURNAME), MODULE NAME, AND MARK OF STUDENTS 
-- HAVING MARK GREATER THAN THE MARK OF John Doe IN THE Science MODULE USING 
-- JOINS. 

    SELECT CONCAT(s.Forename, ' ', s.Surname) AS Student_Name, m.Module_Name, m.Mark 
    FROM Students s 
    INNER JOIN Marks m ON s.Student_No = m.Student_No 
    WHERE m.Module_Name = 'Science' 
    AND m.Mark > (SELECT Mark FROM Marks m1 
    INNER JOIN Students s1 ON m1.Student_No = s1.Student_No 
    WHERE CONCAT(s1.Forename, ' ', s1.Surname) = 'John Doe' 
    AND m1.Module_Name = 'Science');

-- 3. CREATE A FOREIGN KEY CONSTRAINT ON THE ‘STUDENT_NO’ COLUMN OF THE MARKS TABLE 
-- ASSUMING ‘STUDENT_NO’ IS THE PRIMARY KEY OF THE STUDENT TABLE.

    ALTER TABLE marks ADD FOREIGN KEY (Student_No) REFERENCES students(Student_No);
                                        --OR
    ALTER TABLE marks ADD CONSTRAINT fkmarks FOREIGN KEY (Student_No) REFERENCES students(Student_No);
