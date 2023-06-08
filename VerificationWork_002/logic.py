import view

class Logic:

    def __init__(self, path: str = 'data.json'):
        self.path = path
        self.temp_book = []

    def open_file(self):
        with open(self.path, 'r', encoding = 'UTF-8') as file:
            data = file.readlines()
            for note in data:
                list = note.strip().split(';')
                dict_note = {}
                dict_note['id'] = list[0]
                dict_note['title'] = list[1]
                dict_note['body'] = list[2]
                dict_note['time'] = list[3]
                self.temp_book.append(dict_note)

    def save_file(self):
        data = []
        for note in self.temp_book:
            data.append(';'.join(note.values()))
        data = '\n'.join(data)
        with open(self.path, 'w', encoding='UTF-8') as file:
            file.write(data)

    def delete(self, index: int):
        if index:
            self.temp_book.pop(index)
            view.note_is('удалена')
        else:
            view.delete_cancel()

    def add(self, new_note: dict):
        self.temp_book.append(new_note)

    def change(self, index: int, new_value: dict):
        self.temp_book[index] = new_value

    def get(self):
        return self.temp_book