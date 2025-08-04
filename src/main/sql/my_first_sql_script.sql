CREATE DATABASE family;
USE family;
CREATE TABLE family.person (
id INT auto_increment primary key,
name VARCHAR(100) NOT NULL,
email varchar(100)  NOT NULL,
gender enum('Male','Female'),
date_of_birth date,
mobile_number varchar(100) NOT NULL,
city varchar(100) NOT NULL
);

 INSERT INTO members (id, name, email, gender, date_of_birth, mobile_number, city, marriage)
 VALUES 
('2', 'shivam', 'shivamsharmaup@gmail.com', 'Male', '1996-06-06', '9650326246', 'bsr', 0),
  ('3', 'sunil', 'sunilsharmaup@gmail.com', 'Male', '1980-06-26', '9818328253', 'bsr', 1),
('4', 'suman', 'sumansharmaup@gmail.com', 'female', '1985-11-14', '8126380526', 'bsr', 1); 
 select * from members;

