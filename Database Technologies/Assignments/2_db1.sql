mysql> select sysdate();


mysql> insert into emp values(101,"Avishkar","Kolhapur",NULL,'2023-01-01',10);
ERROR 1452 (23000): Cannot add or update a child row: a foreign key constraint fails (`Lab_b1`.`emp`, CONSTRAINT `fkemp` FOREIGN KEY (`Dept_Id`) REFERENCES `dept` (`Dept_Id`))


mysql> select * from CONSTRAINT_NAME;
ERROR 1109 (42S02): Unknown table 'CONSTRAINT_NAME' in information_schema
mysql> select constraint_name,table_name from table_constraints where constraint_name ='Lab_b1';
Empty set (0.01 sec)


mysql> select constraint_name,table_name from table_constraints where constraint_schema ='Lab_b1';



ysql> select constraint_name,table_name from referential_constraints where constraint_schema ='Lab_b1';


mysql> select constraint_name,table_name from referential_constraints where constraint_schema ='Lab_b1';

Case Study 1:
1. go to /etc/mysql/mysql.conf.d/mysqld.cnf (Only recommanded for ubuntu linux system)
2. Open using vi editor mysqld.cnf (using vi mysqld.cnf)
    and then add this line below: 
    default_storage_engine=MYISAM
3. Restart the service 
    by using the following service
    sudo service mysql restart
4. create tables t1,t2 with pk,fk;
5. insert the data into child table first and observe the messages

