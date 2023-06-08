import view
from os import path
import json

class Logic:

    def __init__(self, path: str = 'data.json'):
        self.path = path
        self.temp_book = []

    def open_file(self):
        with open(self.path, 'r', encoding = 'UTF-8') as file:
            self.temp_book = json.load(file)

    def save_file(self):
        with open(self.path, 'w', encoding='UTF-8') as file:
            json.dump(self.temp_book, file, ensure_ascii=False, indent=4)

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