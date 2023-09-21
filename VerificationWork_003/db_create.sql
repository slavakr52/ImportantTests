CREATE DATABASE human_friends;
USE human_friends;
CREATE TABLE animals 
(
  id INT PRIMARY KEY AUTO_INCREMENT UNIQUE,
  type VARCHAR(30)
);

CREATE TABLE pets
 (
  id INT PRIMARY KEY AUTO_INCREMENT UNIQUE,
  animal_type VARCHAR(30),
  animals_id INT,
  FOREIGN KEY (animals_id) REFERENCES animals (id) ON DELETE CASCADE ON 
  UPDATE CASCADE
);

CREATE TABLE pack_animals
 (
  id INT PRIMARY KEY AUTO_INCREMENT UNIQUE,
  animal_type VARCHAR(30),
  animals_id INT,
  FOREIGN KEY (animals_id) REFERENCES animals (id) ON DELETE CASCADE ON 
  UPDATE CASCADE
);

CREATE TABLE dog
 (
  id INT PRIMARY KEY AUTO_INCREMENT UNIQUE,
  name VARCHAR(30),
  birth_date DATE,
  command VARCHAR(30),
  pets_id INT,
  FOREIGN KEY (pets_id) REFERENCES pets (id) ON DELETE CASCADE ON 
  UPDATE CASCADE
);

CREATE TABLE cat
 (
  id INT PRIMARY KEY AUTO_INCREMENT UNIQUE,
  name VARCHAR(30),
  birth_date DATE,
  command VARCHAR(30),
  pets_id INT,
  FOREIGN KEY (pets_id) REFERENCES pets (id) ON DELETE CASCADE ON 
  UPDATE CASCADE
);

CREATE TABLE hamster
 (
  id INT PRIMARY KEY AUTO_INCREMENT UNIQUE,
  name VARCHAR(30),
  birth_date DATE,
  command VARCHAR(30),
  pets_id INT,
  FOREIGN KEY (pets_id) REFERENCES pets (id) ON DELETE CASCADE ON 
  UPDATE CASCADE
);

CREATE TABLE horse
 (
  id INT PRIMARY KEY AUTO_INCREMENT UNIQUE,
  name VARCHAR(30),
  birth_date DATE,
  command VARCHAR(30),
  pets_id INT,
  FOREIGN KEY (pets_id) REFERENCES pack_animals (id) ON DELETE CASCADE ON 
  UPDATE CASCADE
);

CREATE TABLE camel
 (
  id INT PRIMARY KEY AUTO_INCREMENT UNIQUE,
  name VARCHAR(30),
  birth_date DATE,
  command VARCHAR(30),
  pets_id INT,
  FOREIGN KEY (pets_id) REFERENCES pack_animals (id) ON DELETE CASCADE ON 
  UPDATE CASCADE
);

CREATE TABLE donkey
 (
  id INT PRIMARY KEY AUTO_INCREMENT UNIQUE,
  name VARCHAR(30),
  birth_date DATE,
  command VARCHAR(30),
  pets_id INT,
  FOREIGN KEY (pets_id) REFERENCES pack_animals (id) ON DELETE CASCADE ON 
  UPDATE CASCADE
);

INSERT INTO animals (type)
VALUES  ('pets'),
		('pack_animals');
        
INSERT INTO pets (animal_type, animals_id)
VALUES ('Dog', '1'),
       ('Cat', '1'),
       ('Hamster', '1');
        
INSERT INTO pack_animals (animal_type, animals_id)
VALUES ('Horse', '2'),
       ('Camel', '2'),
       ('Donkey', '2');

INSERT INTO dog (name, birth_date, command, pets_id)
VALUES ('Ray', '2020-07-11', 'Sit', '1'),
       ('Jack', '2021-01-02', 'Lie down', '1'),
       ('Gray', '2021-03-10', 'Voice', '1');
       
INSERT INTO cat (name, birth_date, command, pets_id)
VALUES ('Murka', '2022-07-11', 'Kitty-kitty', '2'),
       ('Jessica', '2020-01-02', 'Kitty-kitty', '2'),
       ('Tom', '2023-03-10', 'Kitty-kitty', '2'),
       ('Rocket', '2021-04-10', 'Kitty-kitty', '2');

INSERT INTO hamster (name, birth_date, command, pets_id)
VALUES ('Brown', '2023-06-12', 'None', '3');

INSERT INTO horse (name, birth_date, command, pets_id)
VALUES ('Trinity', '2017-11-11', 'Trot', '1'),
       ('Smit', '2018-01-25', 'Gallop', '1');

INSERT INTO camel (name, birth_date, command, pets_id)
VALUES ('Humpback', '2015-10-01', 'Sit', '2');

INSERT INTO donkey (name, birth_date, command, pets_id)
VALUES ('Monkey', '2020-05-01', 'Trot', '3');

