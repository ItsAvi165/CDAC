CREATE TABLE Worker 
(WORKER_ID INT,FIRST_NAME VARCHAR(15),
LAST_NAME VARCHAR(15),SALARY INT,
JOINING_DATE DATE,DEPARTMENT VARCHAR(10));

CREATE TABLE Bonus(WORKER_REF_ID INT,BONUS_DATE DATETIME,BONUS_AMOUNT INT);

CREATE TABLE Title(WORKER_REF_ID INT,WORKER_TITLE VARCHAR(20),AFFECTED_FROM DATETIME);

INSERT INTO Worker VALUES(001,'Monika','Arora',100000,'2014-02-20 09:00:00','HR'),
INSERT INTO Worker VALUES
(002,'Niharika','Verma',300000,'2014-02-20 09:00:00','HR'),
(003,'Vishal','Singhal',300000,'2014-02-20 09:00:00','HR'),
(004,'Amitabh','Singh',500000,'2014-02-20 09:00:00','Admin'), 
(005,'Vivek','Bhati',500000,'2014-06-11 09:00:00','Admin'), 
(006,'Vipul','Diwan',200000,'2014-06-11 09:00:00','Account'), 
(007,'Satish','Kumar',75000,'2014-01-20 09:00:00','Account'), 
(008,'Geetika','Chauhan',90000,'2014-04-11 09:00:00','Admin');

INSERT INTO Bonus VALUES(1,'2016-02-20 00:00:00',5000), (2,'2016-06-11 00:00:00',3000),
(3,'2016-02-20 00:00:00',4000),
(1,'2016-02-20 00:00:00',4500),
(2,'2016-06-11 00:00:00',3500);

INSERT INTO Title VALUES(1,'Manager','2016-02-20 00:00:00'), 
(2,'Executive','2016-06-11 00:00:00'), 
(8,'Executive','2016-06-11 00:00:00'), 
(5,'Manager','2016-06-11 00:00:00'), 
(4,'Asst.Manager','2016-06-11 00:00:00'), 
(7,'Executive','2016-06-11 00:00:00'), 
(6,'Lead','2016-06-11 00:00:00'), 
(3,'Lead','2016-06-11 00:00:00');

mysql> SELECT * FROM Worker;
+-----------+------------+-----------+--------+--------------+------------+
| WORKER_ID | FIRST_NAME | LAST_NAME | SALARY | JOINING_DATE | DEPARTMENT |
+-----------+------------+-----------+--------+--------------+------------+
|         1 | Monika     | Arora     | 100000 | 2014-02-20   | HR         |
|         2 | Niharika   | Verma     | 300000 | 2014-02-20   | HR         |
|         3 | Vishal     | Singhal   | 300000 | 2014-02-20   | HR         |
|         4 | Amitabh    | Singh     | 500000 | 2014-02-20   | Admin      |
|         5 | Vivek      | Bhati     | 500000 | 2014-06-11   | Admin      |
|         6 | Vipul      | Diwan     | 200000 | 2014-06-11   | Account    |
|         7 | Satish     | Kumar     |  75000 | 2014-01-20   | Account    |
|         8 | Geetika    | Chauhan   |  90000 | 2014-04-11   | Admin      |
+-----------+------------+-----------+--------+--------------+------------+
8 rows in set (0.00 sec)

mysql> SELECT * FROM Bonus;
+---------------+---------------------+--------------+
| WORKER_REF_ID | BONUS_DATE          | BONUS_AMOUNT |
+---------------+---------------------+--------------+
|             1 | 2016-02-20 00:00:00 |         5000 |
|             2 | 2016-06-11 00:00:00 |         3000 |
|             3 | 2016-02-20 00:00:00 |         4000 |
|             1 | 2016-02-20 00:00:00 |         4500 |
|             2 | 2016-06-11 00:00:00 |         3500 |
+---------------+---------------------+--------------+
5 rows in set (0.00 sec)

mysql> SELECT * FROM Title;
+---------------+--------------+---------------------+
| WORKER_REF_ID | WORKER_TITLE | AFFECTED_FROM       |
+---------------+--------------+---------------------+
|             1 | Manager      | 2016-02-20 00:00:00 |
|             2 | Executive    | 2016-06-11 00:00:00 |
|             8 | Executive    | 2016-06-11 00:00:00 |
|             5 | Manager      | 2016-06-11 00:00:00 |
|             4 | Asst.Manager | 2016-06-11 00:00:00 |
|             7 | Executive    | 2016-06-11 00:00:00 |
|             6 | Lead         | 2016-06-11 00:00:00 |
|             3 | Lead         | 2016-06-11 00:00:00 |
+---------------+--------------+---------------------+
8 rows in set (0.00 sec)

-- 1. Write an SQL query to fetch “FIRST_NAME” from the Worker table using the
-- alias name <WORKER_NAME>.

mysql> SELECT FIRST_NAME AS 'WORKER_NAME' FROM Worker;
+-------------+
| WORKER_NAME |
+-------------+
| Monika      |
| Niharika    |
| Vishal      |
| Amitabh     |
| Vivek       |
| Vipul       |
| Satish      |
| Geetika     |
+-------------+

-- 2. Write an SQL query to fetch “FIRST_NAME” from the Worker table in upper
-- case.

mysql> SELECT UPPER(FIRST_NAME) AS 'UPPER_WORKER_NAME' FROM Worker;
+-------------------+
| UPPER_WORKER_NAME |
+-------------------+
| MONIKA            |
| NIHARIKA          |
| VISHAL            |
| AMITABH           |
| VIVEK             |
| VIPUL             |
| SATISH            |
| GEETIKA           |
+-------------------+

-- 3. Write an SQL query to fetch unique values of DEPARTMENT from the Worker
-- table.

mysql> SELECT DISTINCT DEPARTMENT FROM Worker;
+------------+
| DEPARTMENT |
+------------+
| HR         |
| Admin      |
| Account    |
+------------+

-- 4. Write an SQL query to print the first three characters of FIRST_NAME from the
-- Worker table.

mysql> SELECT LEFT(FIRST_NAME,3) AS '3_LETTER_FIRST_NAME' FROM Worker;
+---------------------+
| 3_LETTER_FIRST_NAME |
+---------------------+
| Mon                 |
| Nih                 |
| Vis                 |
| Ami                 |
| Viv                 |
| Vip                 |
| Sat                 |
| Gee                 |
+---------------------+

-- 5. Write an SQL query to find the position of the alphabet (‘a’) in the first name
-- column ‘Amitabh’ from the Worker table.

mysql> SELECT LOCATE('a','Amitabh',2);
+-------------------------+
| LOCATE('a','Amitabh',2) |
+-------------------------+
|                       5 |
+-------------------------+

-- 6. Write an SQL query to print all Worker details from the Worker table order by
-- FIRST_NAME Ascending.

mysql> SELECT * FROM Worker ORDER BY FIRST_NAME ASC;
+-----------+------------+-----------+--------+--------------+------------+
| WORKER_ID | FIRST_NAME | LAST_NAME | SALARY | JOINING_DATE | DEPARTMENT |
+-----------+------------+-----------+--------+--------------+------------+
|         4 | Amitabh    | Singh     | 500000 | 2014-02-20   | Admin      |
|         8 | Geetika    | Chauhan   |  90000 | 2014-04-11   | Admin      |
|         1 | Monika     | Arora     | 100000 | 2014-02-20   | HR         |
|         2 | Niharika   | Verma     | 300000 | 2014-02-20   | HR         |
|         7 | Satish     | Kumar     |  75000 | 2014-01-20   | Account    |
|         6 | Vipul      | Diwan     | 200000 | 2014-06-11   | Account    |
|         3 | Vishal     | Singhal   | 300000 | 2014-02-20   | HR         |
|         5 | Vivek      | Bhati     | 500000 | 2014-06-11   | Admin      |
+-----------+------------+-----------+--------+--------------+------------+

-- 7. Write an SQL query to print all Worker details from the Worker table order by
-- FIRST_NAME Ascending and DEPARTMENT Descending.

mysql> SELECT * FROM Worker ORDER BY FIRST_NAME ASC,DEPARTMENT DESC;
+-----------+------------+-----------+--------+--------------+------------+
| WORKER_ID | FIRST_NAME | LAST_NAME | SALARY | JOINING_DATE | DEPARTMENT |
+-----------+------------+-----------+--------+--------------+------------+
|         4 | Amitabh    | Singh     | 500000 | 2014-02-20   | Admin      |
|         8 | Geetika    | Chauhan   |  90000 | 2014-04-11   | Admin      |
|         1 | Monika     | Arora     | 100000 | 2014-02-20   | HR         |
|         2 | Niharika   | Verma     | 300000 | 2014-02-20   | HR         |
|         7 | Satish     | Kumar     |  75000 | 2014-01-20   | Account    |
|         6 | Vipul      | Diwan     | 200000 | 2014-06-11   | Account    |
|         3 | Vishal     | Singhal   | 300000 | 2014-02-20   | HR         |
|         5 | Vivek      | Bhati     | 500000 | 2014-06-11   | Admin      |
+-----------+------------+-----------+--------+--------------+------------+

-- 8. Write an SQL query to print details for Workers with the first names “Vipul” and
-- “Satish” from the Worker table.

mysql> SELECT * FROM Worker WHERE FIRST_NAME IN ('Satish','Vipul');
+-----------+------------+-----------+--------+--------------+------------+
| WORKER_ID | FIRST_NAME | LAST_NAME | SALARY | JOINING_DATE | DEPARTMENT |
+-----------+------------+-----------+--------+--------------+------------+
|         6 | Vipul      | Diwan     | 200000 | 2014-06-11   | Account    |
|         7 | Satish     | Kumar     |  75000 | 2014-01-20   | Account    |
+-----------+------------+-----------+--------+--------------+------------+

-- 9. Write an SQL query to print details of workers excluding first names, “Vipul” and
-- “Satish” from the Worker table.

mysql> SELECT * FROM Worker WHERE FIRST_NAME NOT IN ('Satish','Vipul');
+-----------+------------+-----------+--------+--------------+------------+
| WORKER_ID | FIRST_NAME | LAST_NAME | SALARY | JOINING_DATE | DEPARTMENT |
+-----------+------------+-----------+--------+--------------+------------+
|         1 | Monika     | Arora     | 100000 | 2014-02-20   | HR         |
|         2 | Niharika   | Verma     | 300000 | 2014-02-20   | HR         |
|         3 | Vishal     | Singhal   | 300000 | 2014-02-20   | HR         |
|         4 | Amitabh    | Singh     | 500000 | 2014-02-20   | Admin      |
|         5 | Vivek      | Bhati     | 500000 | 2014-06-11   | Admin      |
|         8 | Geetika    | Chauhan   |  90000 | 2014-04-11   | Admin      |
+-----------+------------+-----------+--------+--------------+------------+

-- 10. Write an SQL query to print details of Workers with DEPARTMENT name as
-- “Admin”.

mysql> SELECT * FROM Worker WHERE DEPARTMENT='Admin';
+-----------+------------+-----------+--------+--------------+------------+
| WORKER_ID | FIRST_NAME | LAST_NAME | SALARY | JOINING_DATE | DEPARTMENT |
+-----------+------------+-----------+--------+--------------+------------+
|         4 | Amitabh    | Singh     | 500000 | 2014-02-20   | Admin      |
|         5 | Vivek      | Bhati     | 500000 | 2014-06-11   | Admin      |
|         8 | Geetika    | Chauhan   |  90000 | 2014-04-11   | Admin      |
+-----------+------------+-----------+--------+--------------+------------+

-- 11. Write an SQL query to print details of the Workers whose FIRST_NAME contains
-- ‘a’.

mysql> SELECT * FROM Worker WHERE FIRST_NAME LIKE 'a%';
+-----------+------------+-----------+--------+--------------+------------+
| WORKER_ID | FIRST_NAME | LAST_NAME | SALARY | JOINING_DATE | DEPARTMENT |
+-----------+------------+-----------+--------+--------------+------------+
|         4 | Amitabh    | Singh     | 500000 | 2014-02-20   | Admin      |
+-----------+------------+-----------+--------+--------------+------------+

-- 12. Write an SQL query to print names of the Workers whose FIRST_NAME ends
-- with ‘a’.

mysql> SELECT * FROM Worker WHERE FIRST_NAME LIKE '%a';
+-----------+------------+-----------+--------+--------------+------------+
| WORKER_ID | FIRST_NAME | LAST_NAME | SALARY | JOINING_DATE | DEPARTMENT |
+-----------+------------+-----------+--------+--------------+------------+
|         1 | Monika     | Arora     | 100000 | 2014-02-20   | HR         |
|         2 | Niharika   | Verma     | 300000 | 2014-02-20   | HR         |
|         8 | Geetika    | Chauhan   |  90000 | 2014-04-11   | Admin      |
+-----------+------------+-----------+--------+--------------+------------+

-- 13. Write an SQL query to print details of the Workers whose FIRST_NAME ends
-- with ‘h’ and contains six alphabets.

mysql> SELECT * FROM Worker WHERE FIRST_NAME LIKE '_____h';
+-----------+------------+-----------+--------+--------------+------------+
| WORKER_ID | FIRST_NAME | LAST_NAME | SALARY | JOINING_DATE | DEPARTMENT |
+-----------+------------+-----------+--------+--------------+------------+
|         7 | Satish     | Kumar     |  75000 | 2014-01-20   | Account    |
+-----------+------------+-----------+--------+--------------+------------+

-- 14. Write an SQL query to print details of the Workers whose SALARY lies between
-- 100000 and 500000.

mysql> SELECT * FROM Worker WHERE SALARY BETWEEN 100000 AND 500000 ;
+-----------+------------+-----------+--------+--------------+------------+
| WORKER_ID | FIRST_NAME | LAST_NAME | SALARY | JOINING_DATE | DEPARTMENT |
+-----------+------------+-----------+--------+--------------+------------+
|         1 | Monika     | Arora     | 100000 | 2014-02-20   | HR         |
|         2 | Niharika   | Verma     | 300000 | 2014-02-20   | HR         |
|         3 | Vishal     | Singhal   | 300000 | 2014-02-20   | HR         |
|         4 | Amitabh    | Singh     | 500000 | 2014-02-20   | Admin      |
|         5 | Vivek      | Bhati     | 500000 | 2014-06-11   | Admin      |
|         6 | Vipul      | Diwan     | 200000 | 2014-06-11   | Account    |
+-----------+------------+-----------+--------+--------------+------------+

-- 15. Write an SQL query to print details of the Workers who joined in Feb’2014.

mysql> SELECT * FROM Worker WHERE JOINING_DATE LIKE '2014-02%';
+-----------+------------+-----------+--------+--------------+------------+
| WORKER_ID | FIRST_NAME | LAST_NAME | SALARY | JOINING_DATE | DEPARTMENT |
+-----------+------------+-----------+--------+--------------+------------+
|         1 | Monika     | Arora     | 100000 | 2014-02-20   | HR         |
|         2 | Niharika   | Verma     | 300000 | 2014-02-20   | HR         |
|         3 | Vishal     | Singhal   | 300000 | 2014-02-20   | HR         |
|         4 | Amitabh    | Singh     | 500000 | 2014-02-20   | Admin      |
+-----------+------------+-----------+--------+--------------+------------+

-- 16. Write an SQL query to fetch the count of employees working in the department
-- ‘Admin’.

mysql> SELECT COUNT(WORKER_ID) FROM Worker WHERE DEPARTMENT = 'Admin';
+------------------+
| COUNT(WORKER_ID) |
+------------------+
|                3 |
+------------------+

-- 17. Write an SQL query to fetch worker names with salaries >= 50000 and <=
-- 100000.

mysql> SELECT FIRST_NAME FROM Worker WHERE (SALARY >= 50000 AND SALARY <= 100000);
+------------+
| FIRST_NAME |
+------------+
| Monika     |
| Satish     |
| Geetika    |
+------------+

-- 18. Write an SQL query to fetch the no. of workers for each department in
-- descending order.
mysql> SELECT DEPARTMENT,COUNT(DEPARTMENT) AS DEPARTMENT_COUNT FROM Worker 
GROUP BY DEPARTMENT 
ORDER BY COUNT(DEPARTMENT) DESC;

+------------+------------------+
| DEPARTMENT | DEPARTMENT_COUNT |
+------------+------------------+
| HR         |                3 |
| Admin      |                3 |
| Account    |                2 |
+------------+------------------+

-- 19. Write an SQL query to print details of the Workers who are also Managers.



-- 20. Write an SQL query to fetch duplicate records having matching data in some
-- fields of a table.



-- 21. Write an SQL query to show only odd rows from a table.
-- 22. Write an SQL query to show only even rows from a table.
-- 23. Write an SQL query to clone a new table from another table.
-- 24. Write an SQL query to fetch intersecting records of previous two tables.
-- 25. Write an SQL query to show records from one table that another table does not
-- have.
-- 26. Write an SQL query to show the top n (say 10) records of a table.
-- 27. Write an SQL query to fetch the list of employees with the same salary.
-- 28. Write an SQL query to show the second-highest salary from a table.
-- 29. Write an SQL query to fetch intersecting records of two tables.
-- 30. Write an SQL query to fetch the first 50% of records from a table.
-- 31. Write an SQL query to fetch the departments that have less than five people in
-- them.
-- 32. Write an SQL query to show all departments along with the number of people in
-- there.
-- 33. Write an SQL query to show the last record from a table.
-- 34. Write an SQL query to fetch the first row of a table.
-- 35. Write an SQL query to fetch the last five records from a table.
-- 36. Write an SQL query to print the name of employees having the highest salary in
-- each department.
-- 37. Write an SQL query to fetch three max salaries from a table.
-- 38. Write an SQL query to fetch departments along with the total salaries paid for
-- each of them.
-- 39. Write an SQL query to fetch the names of workers who earn the highest salary.
