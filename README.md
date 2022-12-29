# DataBaseReg
For everything to work, you will need to create a MySql database

CREATE DATABASE DataBaseReg;

USE DataBaseReg;

CREATE TABLE Users
(
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Login VARCHAR(255),
    Pass INT,
   Gender VARCHAR(6) 
);

After creating the database in the Config class, you will need to set your root password.
After that, you can start everything. For everything to work, you need to run Main.java
