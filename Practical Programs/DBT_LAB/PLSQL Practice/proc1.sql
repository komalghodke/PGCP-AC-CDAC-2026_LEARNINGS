drop PROCEDURE if EXISTS proc1;
delimiter $
create PROCEDURE proc1()
BEGIN
	SELECT "HELLO....SQL!!!";
end $
delimiter ;

drop PROCEDURE if EXISTS proc2;
delimiter $
create PROCEDURE proc2()
BEGIN
	declare x int;
	declare y int DEFAULT 20;
	set x:= 23;
	SELECT x+y;
	SELECT "HELLO.....SQL!!!";
end $
delimiter ;

drop PROCEDURE if EXISTS proc3;
delimiter $
create PROCEDURE proc3(In x int)
BEGIN
		declare y int;
		set y:= x*x;
		SELECT y square;
end $
delimiter ;

drop PROCEDURE if EXISTS proc4;
delimiter $
create PROCEDURE proc4(In x int, Out z int)
BEGIN
	set z:= x*x;
end $
delimiter ;

/*
drop PROCEDURE if EXISTS proc1;
delimiter $
create PROCEDURE proc1()
BEGIN
SELECT "HELLO SQL!!!";
end $
delimiter ;
*/
