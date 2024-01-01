-- Q4. Display the highest, lowest, sum, and average salary of all employees. Label the columns
-- Maximum, Minimum, Sum, and Average, respectively. Round your results to the nearest whole
-- number. Place your SQL statement in a text file named lab5_4.sql.

SELECT MAX(salary) AS 'Maximum', MIN(salary) AS 'Minimum', SUM(SALARY) AS 'Sum', AVG(SALARY) AS 'Average' FROM emp;
+---------+---------+-------+---------+
| Maximum | Minimum | Sum   | Average |
+---------+---------+-------+---------+
|   30000 |   20000 | 95000 |   23750 |
+---------+---------+-------+---------+

-- Q5. Modify the query in lab5_4.sql to display the minimum, maximum, sum, and average salary
-- for each job type. Resave lab5_4.sql to lab5_5.sql. Run the statement in lab5_5.sql.

SELECT MAX(salary) AS 'Maximum', MIN(salary) AS 'Minimum', SUM(SALARY) AS 'Sum', AVG(SALARY) AS 'Average' FROM emp GROUP BY deptid;

+--------+---------+---------+-------+---------+
| deptid | Maximum | Minimum | Sum   | Average |
+--------+---------+---------+-------+---------+
|     10 |   25000 |   25000 | 25000 |   25000 |
|     20 |   30000 |   20000 | 50000 |   25000 |
|     30 |   20000 |   20000 | 20000 |   20000 |
+--------+---------+---------+-------+---------+

-- 6. Write a query to display the number of people with the same job.

mysql> SELECT deptid,COUNT(deptid) AS 'Count(*)' FROM emp GROUP BY deptid;
+--------+----------+
| deptid | Count(*) |
+--------+----------+
|     10 |        1 |
|     20 |        2 |
|     30 |        1 |
+--------+----------+

-- 7. Determine the number of managers without listing them. Label the column Number of
-- Managers. Hint: Use the MANAGER_ID column to determine the number of managers



