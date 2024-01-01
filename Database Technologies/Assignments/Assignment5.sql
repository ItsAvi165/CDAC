CREATE TABLE employee 
(id INT,name VARCHAR(20),dept_id int, birth date);

INSERT INTO employee VALUES
( 1 , 'Maria Gloria' , 2 , '1994-03-12' ),
( 2 , 'John Smith' , 1 , '1993-02-07' ),
( 3 , 'Gal Rao' , 4 , '1992-09-11' ),
( 4 , 'Jakey Smith' , 2 , '1990-08-31' ),
( 5 , 'Rama Saho' , 1 , '1994-12-09' ),
( 6 , 'Maria Gaga' , 4 ,'1993-10-09');

CREATE TABLE emp_dept 
(dept_id INT,dept_name VARCHAR(30),dept_block VARCHAR(20));

INSERT INTO emp_dept VALUES
(1 , 'Computer Science' ,'B-Block' ),
( 2 , 'Information Technology' , 'C-Block' ),
( 3 , 'Mechanical' , 'A-Block' ),
( 4 , 'Electronic Communication' , 'D-Block');

CREATE TABLE stud 
(id INT,name VARCHAR(15),dept_id INT,birth DATE);

INSERT INTO stud VALUES
(1 , 'Maria' , 2 , '1994-03-12' ),
( 2 , 'John' , 1 , '1993-02-07' ),
( 3 , 'Gal', 4 , '1992-09-11' ),
( 4 , 'Jakey' , 2 , '1990-08-31' ),
( 5 , 'Rama', 1 , '1994-12-09' ),
( 6 , 'Maria' , 4 , '1993-10-09' );

