
------------------------------------------------
---- CSIPROJECT                 ----
------------------------------------------------

CREATE USER CSIPROJECT IDENTIFIED BY mohammed; 
GRANT CREATE SESSION TO CSIPROJECT;
GRANT CREATE TABLE TO CSIPROJECT;
GRANT CREATE VIEW TO CSIPROJECT;
GRANT CREATE PROCEDURE TO CSIPROJECT;
GRANT CREATE SYNONYM TO CSIPROJECT;
GRANT CREATE SEQUENCE TO CSIPROJECT;
ALTER USER CSIPROJECT QUOTA UNLIMITED ON USERS;

connect CSIPROJECT/mohammed;

create table Address 
	( 
		firstname varchar(25), 
		mi char(1), 
		lastname varchar(25), 
		street varchar(40), 
		city varchar(20), 
		state varchar(2), 
		zip varchar(5), 
		telephone varchar(10), 
		email varchar(30) 
); 
