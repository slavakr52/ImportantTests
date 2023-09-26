# Задача 1

> Используя команду cat в терминале операционной системы Linux, создать два файла Домашние животные (заполнив файл собаками, кошками,
хомяками) и Вьючные животными заполнив файл Лошадьми, верблюдами и
ослы), а затем объединить их. Просмотреть содержимое созданного файла.
Переименовать файл, дав ему новое имя (Друзья человека).

```powershell
slava@Kompukter2:~/verification_work_3$ cat > pets
dogs
cats
hamsters

slava@Kompukter2:~/verification_work_3$ cat > pack_animals
horses
camels
donkeys

slava@Kompukter2:~/verification_work_3$ cat pets pack_animals > animals

slava@Kompukter2:~/verification_work_3$ cat animals
dogs
cats
hamsters
horses
camels
donkeys

slava@Kompukter2:~/verification_work_3$ mv animals human_friends
```

# Задача 2

> Создать директорию, переместить файл туда.

```powershell
slava@Kompukter2:~/verification_work_3$ mkdir animals

slava@Kompukter2:~/verification_work_3$ mv human_friends animals/
```
# Задача 3

> Подключить дополнительный репозиторий MySQL. Установить любой пакет
из этого репозитория.

```powershell
slava@Kompukter2:~/verification_work_3$ sudo add-apt-repository https://dev.mysql.com/downloads/repo/apt/

slava@Kompukter2:~/verification_work_3$ sudo apt-get install mysql-server
```
# Задача 4

> Установить и удалить deb-пакет с помощью dpkg.

```powershell
slava@Kompukter2:~/verification_work_3$ wget https://dev.mysql.com/get/Downloads/Connector-J/mysql-connector-j_8.0.32-1ubuntu22.04_all.deb

slava@Kompukter2:~/verification_work_3$ sudo dpkg -i mysql-connector-j_8.0.32-1ubuntu22.04_all.deb

slava@Kompukter2:~/verification_work_3$ sudo dpkg -r mysql-connector-j
```
# Задача 5

> Выложить историю команд в терминале ubuntu

```powershell
  393  cd ~
  394  mkdir verification_work_3
  395  cd verification_work_3/
  396  cat > pets
  397  cat > pack_animals
  398  cat pets pack_animals > animals
  399  ls
  400  cat animals
  401  mv animals human_friends
  402  ls
  403  mkdir animals
  404  mv human_friends animals/
  405  ls
  406  cd anim
  407  cd animals/
  408  ls
  409  add --help
  410  add-apt-repository
  411  sudo add-apt-repository
  412  add-apt-repository https://dev.mysql.com/downloads/repo/apt/
  413  sudo add-apt-repository https://dev.mysql.com/downloads/repo/apt/
  414  sudo dpkg -i mysql-apt-config_0.8.17-1_all.deb
  415  sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb
  416  sudo apt-get install mysql-server
  417  wget https://dev.mysql.com/get/Downloads/Connector-J/mysql-connector-j_8.0.32-1ubuntu22.04_all.deb
  418  sudo dpkg - i mysql-connector-j_8.0.32-1ubuntu22.04_all.deb
  419  sudo dpkg -i mysql-connector-j_8.0.32-1ubuntu22.04_all.deb
  420  cd ..
  421  sudo dpkg -r mysql-connector-j
  422  history
slava@Kompukter2:~/verification_work_3$
```
# Задача 6

> Нарисовать диаграмму, в которой есть класс родительский класс, домашние
животные и вьючные животные, в составы которых в случае домашних
животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные
войдут: Лошади, верблюды и ослы).

<image src="images/01.png" alt="Не загрузилось(">

# Задача 7, 8, 9, 10, 11, 12

> В подключенном MySQL репозитории создать базу данных “Друзья
человека”

> Создать таблицы с иерархией из диаграммы в БД

> Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения

> Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой
питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.

> Создать новую таблицу “молодые животные” в которую попадут все
животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью
до месяца подсчитать возраст животных в новой таблице

> Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
прошлую принадлежность к старым таблицам.

### Далее готовый SQL-скрипт, позволяющий запустить базу данных со всеми вводными параметрами:

```
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
```


