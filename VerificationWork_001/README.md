# Итоги блока. Выбор специализации
## Проверочная работа №1

### Задача:

>**Написать программу, которая из имеющегося массива строк формирует массив
из строк, длина которых меньше либо равна 3-м символам. Первоначальный массив можно ввести с клавиатуры, либо задать на старте выполнения алгоритма**

### Решение:
- Прежде всего, опишем алгоритм решения задачи блок-схемой:

![image](https://ibb.co/pdXvQdp)

>*Если по каким-то причинам изображение не откроется, его можно также найти в репозитории, файл diagram.png*

- Пошаговое описание алгоритма:
>*Т.к. в данном случае будем выделять отдельный метод для решения задачи, здесь будут описаны шаги непосредственно метода*
1. Принимаем на вход изначальный массив строк
2. Задаём две переменные с значением 0 - **newArraySize** и **count**.  
В первой переменной мы будем хранить число, которое будет указывать длину нового массива. Длина нового массива с нужными нам элементами с очень высокой вероятностью не будет совпадать с длиной изначального массива, поэтому прежде чем заполнять новый массив элементами, мы должны вычислить его длину.  
Вторая переменная является счётчиком, она нам понадобится чуть позже.
3. Используя цикл **for**, пробегаем по изначальному массиву в поисках нужных нам элементов. Если элемент удовлетворяет условию (длина элемента не должна превышать 3 символа), прибавляем к переменной **newArraySize** +1. По окончанию цикла в данной переменной будет храниться число, соответствующее длине нового массива.
4. Добавляем новый массив с длиной, равной **newArraySize**. Используя цикл **for**, пробегаем по изначальному массиву в поисках нужных нам элементов. Если элемент удовлетворяет условию (длина элемента не должна превышать 3 символа), записываем его как элемент нового массива с индексом, равным **count**, после прибавляем к переменной **count** +1. По окончанию цикла получаем новый массив, заполненный элементами, удовлетворяющих условию.
5. Возвращаем новый массив для дальнейшего использования.

Удачи!


