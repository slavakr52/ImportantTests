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

<image src="01.png" alt="Не загрузилось(">
