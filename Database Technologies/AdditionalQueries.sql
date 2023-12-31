--Query to print tables whose name is starting from some letter

SELECT  TABLE_NAME
FROM    INFORMATION_SCHEMA.TABLES
WHERE   TABLE_NAME LIKE 'T%'

OR

SHOW TABLES LIKE 'T%'

--To see stored procedures and functions
show procedure status where db='dbt';
show function status where db='dbt';
