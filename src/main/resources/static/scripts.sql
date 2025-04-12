CREATE DATABASE `identity-service-revise`;

USE `identity-service-revise`;

CREATE TABLE USERS (
	id CHAR(36) PRIMARY KEY,
    username VARCHAR(30) NOT NULL UNIQUE,
    password VARCHAR(255),
    first_name VARCHAR(30),
	last_name VARCHAR(30),
    date_of_birth DATE
);

SELECT * FROM USERS;