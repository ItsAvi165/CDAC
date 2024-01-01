
create view myview as SELECT * from Marks;

-------------------------------------------------------------------------------------

create index myindex on Marks(Student_No);

-------------------------------------------------------------------------------------

create procedure getmaxmarks(OUT top int)

  BEGIN
  select max(Mark) into top from Marks;
  END &&
  delimiter ;

  call getmaxmarks(@top);
  select @top;

--------------------------------------------------------------------------------------------------------------

DECLARE cursor_name CURSOR FOR
Select statement;

--cursor example

DELIMITER //
CREATE PROCEDURE ExampleProc()
   BEGIN
      DECLARE done INT DEFAULT 0;
      DECLARE tutorialID INTEGER;
      DECLARE tutorialTitle, tutorialAuthor, tutorialDate VARCHAR(20);
      DECLARE cur CURSOR FOR SELECT * FROM tutorials;
      DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;
      OPEN cur;
      label: LOOP
      FETCH cur INTO tutorialID, tutorialTitle, tutorialAuthor, tutorialDate;
      INSERT INTO backup VALUES(tutorialID, tutorialTitle, tutorialAuthor, tutorialDate);
      IF done = 1 THEN LEAVE label;
      END IF;
      END LOOP;
      CLOSE cur;
   END//
DELIMITER ;

--------------------------------------------------------------------------------------------------------------
--OR operation in MongoDB

db.collection.find({$or:[{roll:{$lt:6},marks:{$gt:65}}]})

db.runCommand({distinct:'student',key:'address'})   --student = collection name

db.collection.find({roll:{$in:[2,4,6]}})

db.collection.find({marks:{$not:{$gt:60}}})

db.collection.find({marks:{$exists:true}})

db.remove({college:{$exists:true}})
