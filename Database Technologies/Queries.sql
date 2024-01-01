
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

-------------------------------------------------------------------------------------
