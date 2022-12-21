string[] Array = {"console", "12", "1564", "all", "check", "sum", "creater", "work", "add", "7", "do"}; 
Console.WriteLine($"Изначальный массив: [{String.Join(", ", Array)}]"); 
Console.WriteLine($"Массив с элементами изначального массива, длина которых не более 3-х символов: [{String.Join(", ", FilterArray(Array))}]"); 
 
string[] FilterArray(string[] array) 
{ 
    int newArraySize = 0; 
    int count = 0; 
    for (int i = 0; i < array.Length; i++) 
    { 
        if (array[i].Length < 4) newArraySize++; 
    } 
 
    string[] NewArray = new string[newArraySize]; 
    for (int i = 0; i < array.Length; i++) 
    { 
        if (array[i].Length < 4) 
        { 
            NewArray[count] = array[i]; 
            count++; 
        } 
    } 
    return NewArray; 
}