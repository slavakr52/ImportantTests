# Linux - Выполнить действия в командной строке


1.   Используйте команды операционной системы Linux и создайте две новых директории – «Игрушки для школьников» и «Игрушки для дошколят»
```powershell
slava@DESKTOP-L87T6UJ:~/homework$ mkdir toys_for_schoolchildren
slava@DESKTOP-L87T6UJ:~/homework$ mkdir toys_for_preschool_children
```
2.   Создайте в директории «Игрушки для школьников» текстовые файлы - «Роботы», «Конструктор», «Настольные игры»
```powershell
slava@DESKTOP-L87T6UJ:~/homework$ cd toys_for_schoolchildren/
slava@DESKTOP-L87T6UJ:~/homework/toys_for_schoolchildren$ cat > robots
slava@DESKTOP-L87T6UJ:~/homework/toys_for_schoolchildren$ cat > constructor
slava@DESKTOP-L87T6UJ:~/homework/toys_for_schoolchildren$ cat > table_games
```
3.    Создайте в директории «Игрушки для дошколят» текстовые файлы «Мягкие игрушки», «Куклы», «Машинки»
```powershell
slava@DESKTOP-L87T6UJ:~/homework/toys_for_schoolchildren$ cd ..
slava@DESKTOP-L87T6UJ:~/homework$ cd toys_for_preschool_children/
slava@DESKTOP-L87T6UJ:~/homework/toys_for_preschool_children$ cat > soft_toys
slava@DESKTOP-L87T6UJ:~/homework/toys_for_preschool_children$ cat > dolls
slava@DESKTOP-L87T6UJ:~/homework/toys_for_preschool_children$ cat > cars
```
4.   Объединить 2 директории в одну «Имя Игрушки»
```powershell
slava@DESKTOP-L87T6UJ:~/homework/toys_for_preschool_children$ cd ..
slava@DESKTOP-L87T6UJ:~/homework$ mkdir name_toys
slava@DESKTOP-L87T6UJ:~/homework$ cp -r toys_for_preschool_children/ toys_for_schoolchildren/ name_toys/
```
5.   Переименовать директорию «Имя Игрушки» в «Игрушки»
```powershell
slava@DESKTOP-L87T6UJ:~/homework$ mv name_toys toys
```
6.   Просмотреть содержимое каталога «Игрушки».
```powershell
slava@DESKTOP-L87T6UJ:~/homework$ cd toys
slava@DESKTOP-L87T6UJ:~/homework/toys$ ll
total 16
drwxr-xr-x 4 slava slava 4096 Jun 16 12:40 ./
drwxr-xr-x 5 slava slava 4096 Jun 16 12:44 ../
drwxr-xr-x 2 slava slava 4096 Jun 16 12:40 toys_for_preschool_children/
drwxr-xr-x 2 slava slava 4096 Jun 16 12:40 toys_for_schoolchildren/
slava@DESKTOP-L87T6UJ:~/homework/toys$
```
7.   Установить и удалить snap-пакет. (Любой, какой хотите)
```powershell
slava@DESKTOP-L87T6UJ:~/homework/toys$ sudo snap install gimp
slava@DESKTOP-L87T6UJ:~/homework/toys$ sudo snap remove gimp
```
8.   Добавить произвольную задачу для выполнения каждые 3 минуты (Например, запись в текстовый файл чего-то или копирование из каталога А в каталог Б).
```powershell
slava@DESKTOP-L87T6UJ:~/homework$ crontab -e
>  0/3 * * * * /home/slava/homework/new_task.sh
slava@DESKTOP-L87T6UJ:~/homework$ mcedit new_task.sh\
>  #!/bin/bash
>  echo $(date) >> /home/slava/homework/log
slava@DESKTOP-L87T6UJ:~/homework$ chmod +x new_task.sh
```


