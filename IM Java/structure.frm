#User table
create table user(id INT(10) NOT NULL,
name VARCHAR(30),
password VARCHAR(20),
dept VARCHAR(10),
dob DATE,
type VARCHAR(10));
#Admin Table 
create table admin(id INT(10) NOT NULL,
name VARCHAR(30),
password VARCHAR(30),
dob DATE,
dept VARCHAR(30));
#Room Table
create table room(id INT(10) NOT NULL,
number INT(10),
type VARCHAR(10),
availabilty BIT);
#Asset Table
create table asset(id INT(10) NOT NULL,
type VARCHAR(30),
availability BIT,
quantity INT(10),
room_id INT(10),
FOREIGN KEY(room_id) REFERENCES room(id));


