package ru.cotel.catherine;

import ru.cotel.catherine.library.BookController;
import ru.cotel.catherine.library.BookModel;
import ru.cotel.catherine.library.BookView;

public class Main {
    public static void main(String[] args) {
       /* TaskModel model = new TaskModel();
        TaskView taskView = new TaskView();
        TaskController taskController = new TaskController(model, taskView);
        taskController.start();*/

        BookModel model = new BookModel();
        BookView view = new BookView();
        BookController bookController = new BookController(model, view);
        bookController.start();
    }
}