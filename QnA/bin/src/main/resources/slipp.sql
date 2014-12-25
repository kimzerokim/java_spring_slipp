DROP TABLE IF EXISTS USERS;

CREATE TABLE USERS (
	userId		varchar(12)		NOT NULL,
	password	varchar(12)		NOT NULL,
	name		varchar(20)		NOT NULL,
	email		varchar(50)		NOT NULL
	
	PRIMARY KEY			(userId)
); 

INSERT INTO USERS VALUES('ky200223', 'password', '영킴', 'asdfh@asdfkh.com');
	