package ru.cotel.catherine.library;

import java.util.List;

public class BookView {
    public void displayBook(List<Book> books) {
        System.out.println("Список книг");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            System.out.println(i + ". " + book.getBook());
        }
        System.out.println("----------------");
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
