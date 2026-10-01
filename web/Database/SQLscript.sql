CREATE DATABASE Company;

USE Company;

CREATE TABLE Persons (
  Id int AUTO_INCREMENT PRIMARY KEY,
  Name varchar(255) NOT NULL,
  LastName varchar(255) NOT NULL,  
  Address varchar(255) NOT NULL,
  Age int NOT NULL,
  PhoneNumber varchar(255) NOT NULL
);

INSERT INTO Persons (Name, LastName, Address, Age, PhoneNumber)
VALUES ('Rafael', 'Gonzalez', 'Cerbatana, Puriscal', 40, '+50687789099');

INSERT INTO Persons (Name, LastName, Address, Age, PhoneNumber)
VALUES ('Gabriela', 'Salas', 'Grifo Alto, Puriscal', 32, '+50687459087');

SELECT * FROM Persons;