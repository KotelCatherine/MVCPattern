package ru.cotel.catherine.library;

import java.util.Scanner;

public class BookController {
    private final BookModel model;
    private final BookView view;

    public BookController(BookModel model, BookView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Команды ADD, REMOVE, LIST, FIND, EXIT");
            System.out.print("Введите команду ");
            String command = scanner.nextLine();
            try {
                switch (command.toLowerCase()) {
                    case "add":
                        System.out.println("Введите название книги ");
                        String description = scanner.nextLine();
                        model.addBook(description);
                        view.displayMessage("Книга добавлена");
                        break;
                    case "remove":
                        System.out.println("Введите индекс книги для удаления ");
                        int index = Integer.parseInt((scanner.nextLine()));
                        model.removeBook(index);
                        view.displayMessage("Книга удалена");
                        break;
                    case "list":
                        view.displayBook(model.getBooks());
                        break;
                    case "find":
                        System.out.println("Введите название книги для поиска");
                        String bookName = scanner.nextLine();
                        if (model.searchBook(bookName) != null) {
                            view.displayMessage("Книга : " + model.searchBook(bookName) + " найдена");
                        } else {
                            view.displayMessage("Такая книга не найдена");
                        }
                        break;
                    case "exit":
                        view.displayMessage("Программа завершена");
                        return;
                    default:
                        view.displayMessage("Неизвестная команда");
                }
            } catch (Exception e) {
                view.displayMessage("Ошибка " + e.getMessage());
            }
        }
    }
}
