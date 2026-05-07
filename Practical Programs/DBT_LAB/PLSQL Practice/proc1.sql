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

drop PROCEDURE if EXISTS proc5;
delimiter $
create procedure proc5(IN tname VARCHAR(60))
begin
	set @a:= CONCAT("select * from", tname);
end $
delimiter ;

drop PROCEDURE if EXISTS show_students;
DELIMITER //
CREATE PROCEDURE show_students()
BEGIN
    SELECT * FROM student;
END //
DELIMITER ;

drop PROCEDURE if EXISTS get_student;
DELIMITER //
CREATE PROCEDURE get_student(IN sid INT)
BEGIN
    SELECT * FROM student WHERE id = sid;
END //
DELIMITER ;
	
	

drop PROCEDURE if EXISTS get_ag;	
DELIMITER //
CREATE PROCEDURE get_ag(IN sid INT, OUT sage INT)
BEGIN
    SELECT age INTO sage
    FROM student
    WHERE id = sid;
END //
DELIMITER ;
	

drop PROCEDURE if EXISTS inc_ag;
DELIMITER //
CREATE PROCEDURE inc_ag(IN sid INT)
BEGIN
    UPDATE student
    SET age = age + 1
    WHERE id = sid;
END //
DELIMITER ;

drop PROCEDURE if EXISTS show_students_cursor;
DELIMITER //
CREATE PROCEDURE show_students_cursor()
BEGIN
    DECLARE done INT DEFAULT 0;
    DECLARE sname VARCHAR(50);

    DECLARE cur CURSOR FOR SELECT name FROM student;
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;
    OPEN cur;

    read_loop: LOOP
        FETCH cur INTO sname;
        IF done = 1 THEN
            LEAVE read_loop;
        END IF;
        SELECT sname;
    END LOOP;

    CLOSE cur;
END //
DELIMITER ;

DELIMITER //


drop TRIGGER if EXISTS trg_after_insert;
CREATE TRIGGER trg_after_insert
AFTER INSERT
ON student
FOR EACH ROW
BEGIN
    INSERT INTO student_log(message)
    VALUES(CONCAT('Inserted student: ', NEW.name));
END //
DELIMITER ;

drop TRIGGER if EXISTS trg_before_insert;
DELIMITER //
CREATE TRIGGER trg_before_insert
BEFORE INSERT
ON student
FOR EACH ROW
BEGIN
    SET NEW.age = ABS(NEW.age);
END //
DELIMITER ;


drop FUNCTION if EXISTS get_square;
DELIMITER //
CREATE FUNCTION get_square(num INT)
RETURNS INT
DETERMINISTIC
BEGIN
    RETURN num * num;
END //
DELIMITER ;


drop FUNCTION if EXISTS get_age;
DELIMITER //
CREATE FUNCTION get_age(sid INT)
RETURNS INT
DETERMINISTIC

BEGIN
    DECLARE sage INT;
    SELECT age INTO sage
    FROM student
    WHERE id = sid;
    RETURN sage;
END //
DELIMITER ;



drop FUNCTION if EXISTS check_adult;
DELIMITER //
CREATE FUNCTION check_adult(a INT)
RETURNS VARCHAR(20)
DETERMINISTIC

BEGIN
    IF a >= 18 THEN
        RETURN 'Adult';
    ELSE
        RETURN 'Minor';
    END IF;
END //
DELIMITER ;