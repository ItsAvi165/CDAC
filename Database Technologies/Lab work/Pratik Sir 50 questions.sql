-- Q-1. Write an SQL query to fetch “FIRST_NAME” from Worker table using the alias name as <WORKER_NAME>.
SELECT FIRST_NAME AS WORKER_NAME FROM  Worker;

-- Q-2. Write an SQL query to fetch “FIRST_NAME” from Worker table in upper case.
SELECT UPPER(FIRST_NAME) FROM Worker;
SELECT UCASE(FIRST_NAME) FROM Worker;

-- Q-3. Write an SQL query to fetch unique values of DEPARTMENT from Worker table.
-- using group by
SELECT DEPARTMENT FROM Worker GROUP BY DEPARTMENT;

-- Q-4. Write an SQL query to print the first three characters of  FIRST_NAME from Worker table.
SELECT SUBSTRING(FIRST_NAME,1,3) AS 'First 3 letters' FROM Worker;

-- Q-5. Write an SQL query to find the position of the alphabet (‘b’) in the first name column ‘Amitabh’ from Worker table.
SELECT INSTR(FIRST_NAME,'b') AS 'b letter in Amitabh' FROM Worker WHERE WORKER_ID=4;

SELECT FIRST_NAME,INSTR(FIRST_NAME,'b') AS 'b letter in Amitabh' FROM Worker WHERE FIRST_NAME="Amitabh";

-- SELECT FIRST_NAME,INSTR(FIRST_NAME,'b') AS 'b letter in Amitabh' FROM Worker;

-- Q-6. Write an SQL query to print the FIRST_NAME from Worker table after removing white spaces from the right side.
SELECT RTRIM(FIRST_NAME) FROM Worker;

-- Q-7. Write an SQL query to print the DEPARTMENT from Worker table after removing white spaces from the left side.
SELECT LTRIM(FIRST_NAME) FROM Worker;

-- Q-8. Write an SQL query that fetches the unique values of DEPARTMENT from Worker table and prints its length.
SELECT DEPARTMENT,LENGTH(DEPARTMENT) AS LEN_DEPT FROM Worker GROUP BY DEPARTMENT;
SELECT DISTINCT DEPARTMENT, LENGTH(DEPARTMENT) AS DEPT_LEN FROM Worker;

-- Q-9. Write an SQL query to print the FIRST_NAME from Worker table after replacing ‘a’ with ‘A’.
SELECT REPLACE(FIRST_NAME,'a','A') AS 'a to A' FROM Worker;

-- Q-10. Write an SQL query to print the FIRST_NAME and LAST_NAME from Worker table into a single column COMPLETE_NAME.
-- A space char should separate them.
SELECT CONCAT(FIRST_NAME," ",LAST_NAME) AS COMPLETE_NAME FROM Worker;

-- Q-11. Write an SQL query to print all Worker details from the Worker table order by FIRST_NAME Ascending.
SELECT * FROM Worker ORDER BY FIRST_NAME ASC;

-- Q-12. Write an SQL query to print all Worker details from the Worker table order by 
-- FIRST_NAME Ascending and DEPARTMENT Descending.

SELECT FIRST_NAME,DEPARTMENT FROM Worker ORDER BY FIRST_NAME ASC, DEPARTMENT DESC;

-- Q-13. Write an SQL query to print details for Workers with the first name as “Vipul” and “Satish” from Worker table.
-- using In

SELECT * FROM Worker WHERE FIRST_NAME IN ("Vipul","Satish");
-- using Or
SELECT * FROM Worker WHERE FIRST_NAME LIKE "Vipul" OR "Satish";

-- Q-14. Write an SQL query to print details of workers excluding first names, “Vipul” and “Satish” from Worker table.
SELECT * FROM Worker WHERE FIRST_NAME NOT IN ("Vipul","Satish");

-- Q-15. Write an SQL query to print details of Workers with DEPARTMENT name as “Admin*”.
SELECT * FROM Worker WHERE DEPARTMENT = "Admin";

-- Q-16. Write an SQL query to print details of the Workers whose FIRST_NAME contains ‘a’.
SELECT * FROM Worker WHERE FIRST_NAME LIKE "%a%";

-- Q-17. Write an SQL query to print details of the Workers whose FIRST_NAME ends with ‘a’.
SELECT * FROM Worker WHERE FIRST_NAME LIKE "%a";

-- Q-18. Write an SQL query to print details of the Workers whose FIRST_NAME ends with ‘h’ and contains six alphabets.
SELECT * FROM Worker WHERE FIRST_NAME LIKE "_____h";


-- Q-19. Write an SQL query to print details of the Workers whose SALARY lies between 100000 and 500000.
SELECT * FROM Worker WHERE SALARY BETWEEN 100000 AND 500000;

-- Q-20. Write an SQL query to print details of the Workers who have joined in Feb’2014.
SELECT * FROM Worker WHERE JOINING_DATE LIKE "%2014-02%" ;

--OR

SELECT * FROM Worker WHERE YEAR(JOINING_DATE) = 2014 AND MONTH(JOINING_DATE)=02;

-- Q-21. Write an SQL query to fetch the count of employees working in the department ‘Admin’.
SELECT COUNT(*) AS 'EMPLOYEES_NUMBER' FROM Worker GROUP BY DEPARTMENT HAVING DEPARTMENT LIKE "Admin";

-- Q-22. Write an SQL query to fetch worker full names with salaries >= 50000 and <= 100000.
SELECT CONCAT(FIRST_NAME,' ',LAST_NAME) AS COMPLETE_NAME FROM Worker WHERE SALARY BETWEEN 50000 AND 100000;

-- Q-23. Write an SQL query to fetch the no. of workers for each department in the descending order.
SELECT DEPARTMENT,COUNT(DEPARTMENT) AS DEPT_COUNT FROM Worker GROUP BY DEPARTMENT ORDER BY COUNT(DEPARTMENT) DESC;

-- Q-24. Write an SQL query to print details of the Workers who are also Managers.
SELECT * FROM Worker w INNER JOIN Title t 
ON
t.WORKER_REF_ID=w.WORKER_ID
AND 
t.WORKER_TITLE = 'Manager';  

SELECT * FROM Worker w INNER JOIN Title t 
ON
t.WORKER_REF_ID=w.WORKER_ID
AND 
t.WORKER_TITLE LIKE 'Manager';  

-- Q-25. Write an SQL query to fetch number (more than 1) of same titles in the ORG of different types.
SELECT WORKER_TITLE,COUNT(*) AS COUNT_TITLE FROM Title GROUP BY WORKER_TITLE HAVING COUNT(*)>1;

-- Q-26. Write an SQL query to show only odd rows from a table. 
SELECT * FROM Worker WHERE WORKER_ID%2!=0;
SELECT * FROM Worker WHERE MOD(WORKER_ID,2)!=0;   -- != is same as < >
SELECT * FROM Worker WHERE WORKER_ID%2<>0;

-- Q-27. Write an SQL query to show only even rows from a table. 
SELECT * FROM Worker WHERE MOD(WORKER_ID,2)=0;

-- Q-28. Write an SQL query to clone a new table from another table.
CREATE TABLE Clone SELECT * FROM Worker;

-- Q-29. Write an SQL query to fetch intersecting records of two tables.
SELECT * FROM Worker W INNER JOIN Title T ON W.WORKER_ID=T.WORKER_REF_ID; 

-- Q-30. Write an SQL query to show records from one table that another table does not have.
-- MINUS
SELECT * FROM Worker W INNER JOIN Title T ON W.WORKER_ID=T.WORKER_REF_ID;
SELECT W.FIRST_NAME,W.LAST_NAME,W.SALARY,W.JOINING_DATE,W.DEPARTMENT,T.WORKER_TITLE,T.AFFECTED_FROM FROM Worker W INNER JOIN Title T ON W.WORKER_ID=T.WORKER_REF_ID;

-- Q-31. Write an SQL query to show the current date and time.
SELECT NOW();
SELECT CURDATE();  -- gives only current date
SELECT CURTIME();  -- gives only current time 


-- Q-32. Write an SQL query to show the top n (say 5) records of a table order by descending salary.
SELECT * FROM Worker ORDER BY SALARY DESC LIMIT 5;

-- Q-33. Write an SQL query to determine the nth (say n=5) highest salary from a table.
SELECT * FROM Worker ORDER BY SALARY DESC LIMIT 2,1;

Que - 3rd highest using subquery

PENDING-- Q-34. Write an SQL query to determine the 3th highest salary without using LIMIT keyword.
-- SELECT SALARY FROM Worker 
-- UNION
-- SELECT MAX(SALARY) FROM Worker GROUP BY SALARY
-- ORDER BY SALARY DESC; 


SELECT Max(SALARY)  FROM Worker  WHERE  SALARY < (SELECT Max(SALARY) FROM Worker);
IMP  -- Q-35. Write an SQL query to fetch the list of employees with the same salary.

SELECT *
FROM Worker 
WHERE SALARY IN (
    SELECT SALARY
    FROM Worker
    GROUP BY SALARY
    HAVING COUNT(*) > 1
);

PENDING-- Q-36. Write an SQL query to show the second highest salary from a table using sub-query.

-- third highest for homework

-- Q-37. Write an SQL query to show one row twice in results from a table.

-- hint - union all 
-- Q-38. Write an SQL query to list worker_id who does not get bonus.
-- hint - not in and subquery (get worker id who got bonus)
SELECT WORKER_ID FROM Worker NOT IN (SELECT WORKER_REF_ID FROM Bonus);

    SELECT WORKER_ID FROM Worker IN (SELECT WORKER_REF_ID FROM Bonus WHERE BONUS_AMOUNT IS NOT NULL);

-- SELECT * FROM Worker w RIGHT OUTER JOIN Bonus b ON w.WORKER_ID = b.WORKER_REF_ID;
SELECT * FROM Worker w INNER JOIN Bonus b ON w.WORKER_ID = b.WORKER_REF_ID AND b.BONUS_AMOUNT IS NULL;
-- Q-39. Write an SQL query to fetch the first 50% records from a table.
divide by 2 auto increment worker id 

-- Q-40. Write an SQL query to fetch the departments that have less than 4 people in it.


-- Q-41. Write an SQL query to show all departments along with the number of people in there.


-- Q-42. Write an SQL query to show the last record from a table.


-- Q-43. Write an SQL query to fetch the first row of a table.


-- Q-44. Write an SQL query to fetch the last five records from a table.


-- Q-45. Write an SQL query to print the name of employees having the highest salary in each department.
inner join 

-- Q-46. Write an SQL query to fetch three max salaries from a table using co-related subquery

-- DRY RUN AFTER REVISING THE CORELATED SUBQUERY CONCEPT FROM LEC-9.

CORELATED
-- Q-47. Write an SQL query to fetch three min salaries from a table using co-related subquery
CORELATED

-- Q-48. Write an SQL query to fetch nth max salaries from a table.
CORELATED

-- Q-49. Write an SQL query to fetch departments along with the total salaries paid for each of them.
solve this

-- Q-50. Write an SQL query to fetch the names of workers who earn the highest salary.
CORELATED