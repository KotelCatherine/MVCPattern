package ru.cotel.catherine.library;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Добавлять книги в магазин.
 * 2. Удалять книги из магазина.
 * 3. Показывать список всех книг.
 * 4. Искать книгу по названию.
 */
public class BookModel {
    private final List<Book> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(new Book(book));
    }

    public void removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
        } else {
            throw new IllegalArgumentException("Неверный индекс задачи");
        }
    }

    public String searchBook(String book) {
        for (int i = 0; i < books.size(); i++) {
            if (book.equalsIgnoreCase(books.get(i).getBook())) {
                return "[" + i + ". " + books.get(i).getBook() + "]";
            }
        }
        return null;
/*        return books.stream()
                .filter(book1 -> book.equalsIgnoreCase(book1.getBook()))
                .findFirst()
                .get()
                .getBook();*/
    }

    public List<Book> getBooks() {
        return books;
    }
}
