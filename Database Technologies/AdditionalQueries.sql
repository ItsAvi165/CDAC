--Query to print tables whose name is starting from some letter

SELECT  TABLE_NAME
FROM    INFORMATION_SCHEMA.TABLES
WHERE   TABLE_NAME LIKE 'T%'

OR

SHOW TABLES LIKE 'T%'
-------------------------------------------------------------------------------------------------------------------------------------
--To see stored procedures and functions
show procedure status where db='dbt';
show function status where db='dbt';

-------------------------------------------------------------------------------------------------------------------------------------

SELECT FIRST_NAME, LAST_NAME FROM employees WHERE ABS(TIMESTAMPDIFF(YEAR,NOW(),HIRE_DATE)) >
(SELECT ABS(TIMESTAMPDIFF(YEAR,NOW(),HIRE_DATE)) FROM employees WHERE FIRST_NAME='Clara');

--Unit of TIMESTAMPDIFF can be - FRAC_SECOND (microseconds), SECOND, MINUTE, HOUR, DAY, WEEK, MONTH, QUARTER, or YEAR.

-------------------------------------------------------------------------------------------------------------------------------------

YEAR(HIRE_DATE) AS JOIN_YEAR

SELECT YEAR(HIRE_DATE) AS JOIN_YEAR, COUNT(*) AS EMPLOYEE_COUNT FROM employees
GROUP BY JOIN_YEAR HAVING EMPLOYEE_COUNT > 10;     --can use aliases in the same query again eg. JOIN_YEAR and EMPLOYEE_COUNT
-------------------------------------------------------------------------------------------------------------------------------------

SELECT JOB_TITLE,SUBSTRING(JOB_TITLE,1,1) AS FIRST_LETTER_OF_JOB_TITLE FROM jobs
WHERE (LENGTH(JOB_TITLE) - LENGTH(REPLACE(JOB_TITLE,' ', '')) + 1) > 1;

--OR

 SELECT JOB_TITLE,SUBSTRING(JOB_TITLE,1,1) AS FIRST_LETTER_OF_JOB_TITLE FROM jobs
 WHERE JOB_TITLE LIKE '% %';

-------------------------------------------------------------------------------------------------------------------------------------




-------------------------------------------------------------------------------------------------------------------------------------





-------------------------------------------------------------------------------------------------------------------------------------





-------------------------------------------------------------------------------------------------------------------------------------
