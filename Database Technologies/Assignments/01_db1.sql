mysql> CREATE DATABASE Lab_b1;

-- Here we have created database 'Lab_b1'

mysql> USE Lab_b1;

-- In order to use this database we need to use 'USE' keyword on Database name 'Lab_b1'

mysql> CREATE TABLE emp (Emp_Id INT, Emp_Name VARCHAR(20), Emp_Address VARCHAR(30), Manager_Id INT, Hire_date date);

-- We are now in the database, here we will create table named emp with following properties in the brackets

mysql> CREATE TABLE dept (Dept_Id INT,Dname VARCHAR(15), Location VARCHAR(20));

-- Again wer are creating another table of name dept

mysql> DESC dept;

-- Here we are describing the dept table

mysql> use information_schema;

-- Here we are using database 'information_schema', which is data dictonery, which stores tables of all the databases we create

mysql> SHOW TABLES;

-- Here we want to see tables here we have all the tables (which are actually a dabase infromation)

mysql> DESC TABLES;

-- Here we are describing the table properties i.e., attributes, their is a table named 'TABLES' which is like a normal table

mysql> SELECT table_name FROM tables;

-- Now we will select column name table_name from table 'tables'

mysql> SELECT table_name
    -> FROM tables
    -> WHERE TABLE_SCHEMA='Lab_b1';

-- Here we are using WHERE for condition to show 'Lab_b1' only table we can do this by also accessing database Lab_b1

mysql> SHOW TABLES;

mysql> DESC dep;

mysql> ALTER TABLE emp ADD CONSTRAINT pkemp primary key(Emp_Id);

mysql> ALTER TABLE dept ADD CONSTRAINT pkemp primary key(Dept_Id);

mysql> ALTER TABLE emp ADD Dept_Id INT;

mysql> ALTER TABLE emp ADD CONSTRAINT fkemp foreign key(Dept_Id) references dept(Dept_Id);
