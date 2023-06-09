import time
import textwrap

def menu():
    print('''Главное меню:
    1. Открыть файл
    2. Сохранить файл
    3. Показать все заметки
    4. Открыть заметку
    5. Добавить заметку
    6. Изменить заметку
    7. Удалить заметку
    8. Выход''')
    try:
        user_choise = int(input('Выберите пункт меню: '))
        return user_choise
    except:
        menu_input_error()
        click_to_continue()

def show_all_notes(note_book: list[dict]):
        print()
        print('   Время создания             Название заметки')
        print('=================================================')
        for i, note in enumerate(note_book, 1):
            print(f"{i:=3d}. {note.get('time'):<26} {note.get('title')}")
        print('=================================================')

def open_note(note_book: list[dict]):
    show_all_notes(note_book)
    try:
        return int(input('\nВыберите номер заметки: '))
    except:
        input_error()

def open_selected_note(note_book: list[dict], index: int):
        if index == 0:
            input_error()
        if index:
            if (1 <= index <= len(note_book)):
                title = note_book[index - 1].get('title')
                body = note_book[index - 1].get('body')
                time = note_book[index - 1].get('time')
                change_time = note_book[index - 1].get('change_time')
                print('\n=================================================')
                print(textwrap.fill(title, 50))
                print('-  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -')
                print(textwrap.fill(body, 50))
                print('=================================================')
                print(f'Создано: {time}')
                if change_time:
                    print(f'Изменено: {change_time}')

            else:
                input_error()

def new_note(note_book: list[dict]):
        if len(note_book):
            id = int(note_book[len(note_book) - 1].get('id'))
            new_id = id + 1
        else:
            new_id = 1
        title = input('\nВведите название заметки: ')
        body = input('Введите заметку: ')
        t = time.localtime()
        current_time = time.strftime("%d %B %H:%M", t)
        new_note = {'id': str(new_id),
                        'title': title,
                        'body': body,
                        'time': current_time,
                        'change_time': 0}
        return new_note

def change_note(note_book: list[dict]):
    show_all_notes(note_book)
    try:
        choice = int(input('\nВведите номер заметки, которую хотите изменить: '))
        title = input('Введите новый заголовок (нажмите Enter, чтобы оставить без изменений): ')
        body = input('Введите новую заметку (нажмите Enter, чтобы оставить без изменений): ')
        t = time.localtime()
        current_time = time.strftime("%d %B %H:%M", t)
        return choice - 1, {'id': note_book[choice - 1].get('id'),
                            'title': title if title else note_book[choice - 1].get('title'),
                            'body': body if body else note_book[choice - 1].get('body'),
                            'time': note_book[choice - 1].get('time'),
                            'change_time': current_time}
    except:
        input_error()

def delete_note(note_book: list[dict]):
    show_all_notes(note_book)
    try:
        return int(input('\nВведите номер заметки, которую хотите удалить: ')) - 1
    except:
        input_error()

def delete_selected_note(note_book: list[dict], index: int):
        if index == 0:
            input_error()
        if index:
            if (1 <= index + 1 <= len(note_book)):
                title = note_book[index].get('title')
                value = delete_secure(title)
                return value
            else:
                input_error()

def delete_secure(title: str):
    value = input(f'\nВы уверены, что хотите удалить заметку "{title}"?'
                  '\nДля подтверждения введите любой символ, для отмены нажмите Enter     ')
    return value

def delete_cancel():
    print('\nУдаление отменено')
        
def click_to_continue():
    input('\nНажмите Enter для продолжения\n')

def menu_input_error():
    print('\nВведены некорректные данные! Повторите ввод')

def input_error():
    print('\nВведены некорректные данные! Будет выполнен выход в главное меню')

def exit():
    print('\nВыход...')

def exit_cancel():
    print('\nВыход отменён')

def exit_secure():
    value = input('\nВы уверены, что хотите выйти? Все несохранённые данные будут утеряны!'
                  '\nДля выхода введите любой символ, для отмены нажмите Enter     ')
    return value

def note_book_is(status: str):
    print(f'\nЗаметки {status}!')

def note_is(status: str):
    print(f'\nЗаметка {status}!')

def note_book_warning():
    print('\nЗаметки пусты либо файл не открыт!')

def note_book_empty():
    print('\nЗаметки пусты! Создайте новую заметку')

def add_note_warning():
     print('\nЗаметки пусты либо файл не был открыт!'
           '\nДля избежания возможной потери информации файл будет открыт автоматически')



