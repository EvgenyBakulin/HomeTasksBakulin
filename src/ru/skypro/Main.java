package ru.skypro;

import ru.skypro.HomeTaskObjects.task1.Author;
import ru.skypro.HomeTaskObjects.task1.Book;

public class Main {

    public static void main(String[] args) {
	    Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Сергей", "Есенин");
        Book bookDybrovsky = new Book(author1,"Дубровский",1965);
        Book bookLyrik = new Book(author2,"Лирика", 1972);
        bookDybrovsky.printBook();
        bookLyrik.printBook();
        bookDybrovsky.setYear(1970);
        bookLyrik.setYear(1990);
        bookDybrovsky.printBook();
        bookLyrik.printBook();
    }
}
