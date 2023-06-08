import view
import logic

note = logic.Logic()

def main_start():
    
    while True:
        user_choise = view.menu()
        if user_choise == 0:
            view.input_error()
            view.click_to_continue()
        if user_choise:
            if (1 <= user_choise <=8):
                match user_choise:
                    case 1:
                        note_book = note.get()
                        if note_book:
                            view.note_book_is('уже загружены')
                        else:
                            note.open_file()
                            view.note_book_is('загружены')
                    case 2:
                        note_book = note.get()
                        if note_book:
                            note.save_file()
                            view.note_book_is('сохранены')
                        else:
                            view.note_book_warning()
                    case 3:
                        note_book = note.get()
                        if note_book:
                            view.show_all_notes(note_book)
                        else:
                            view.note_book_warning()
                    case 4:
                        note_book = note.get()
                        if note_book:
                            index = view.open_note(note_book)
                            view.open_selected_note(note_book, index)
                        else:
                            view.note_book_warning()
                    case 5:
                        note_book = note.get()
                        if note_book:
                            new_entry = view.new_note(note_book)
                            note.add(new_entry)
                            view.note_is('добавлена')
                        else:
                            view.add_note_warning()
                            view.click_to_continue()
                            note.open_file()
                            new_entry = view.new_note(note_book)
                            note.add(new_entry)
                            view.note_is('добавлена')
                    case 6:
                        note_book = note.get()
                        if note_book:
                            new_value = view.change_note(note_book)
                            if new_value:
                                note.change(*new_value)
                                view.note_is('изменена')
                        else:
                            view.note_book_warning()
                    case 7:
                        note_book = note.get()
                        if note_book:
                            index = view.delete_note(note_book)
                            confirm = view.delete_selected_note(note_book, index)
                            if confirm:
                                note.delete(index)
                            else:
                                view.delete_cancel()
                        else:
                            view.note_book_warning()
                    case 8:
                        value = view.exit_secure()
                        if value:
                            view.exit()
                            break
                        else:
                            view.exit_cancel()
            else: 
                view.input_error()
            view.click_to_continue()