package ru.skypro;

import ru.skypro.HomeTaskObjects.task1.Author;
import ru.skypro.HomeTaskObjects.task1.Book;
import ru.skypro.HomeTaskObjects.task1.Library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Сергей", "Есенин");
        Book bookDybrovsky = new Book(author1, "Дубровский", 1965);
        Book bookLyrik = new Book(author2, "Лирика", 1972);
        System.out.println(bookDybrovsky);
        System.out.println(bookLyrik);
        System.out.println("Хэшкод Дубровского - " + bookDybrovsky.hashCode());
        System.out.println("Хэшкод Лирики = " + bookLyrik.hashCode());
        bookDybrovsky.setYear(1970);
        bookLyrik.setYear(1990);
        System.out.println(bookDybrovsky);
        System.out.println(bookLyrik);
        System.out.println("Хэшкод Дубровского - " + bookDybrovsky.hashCode());
        System.out.println("Хэшкод Лирики = " + bookLyrik.hashCode());
        Book bookLyrik1 = new Book(author2, "Лирика", 1990);
        System.out.println(bookLyrik1);
        System.out.println("Хэшкод Лирики1 = " + bookLyrik1.hashCode());
        doubles(bookDybrovsky,bookLyrik);
        doubles(bookLyrik1,bookLyrik);
        System.out.println();
        System.out.println("Создаём библиотеку");
        Library library = new Library(5);
        library.addBook(bookDybrovsky);
        library.addBook(bookLyrik);
        System.out.println(library);
        Author author3 = new Author("Лев","Толстой");
        Book bookWarAndPeace = new Book(author3,"Война и мир",1984);
        library.addBook(bookWarAndPeace);
        System.out.println(library);
        library.searchBookForTitle();
        library.changeYear("Война и мир",1985);

    }
    public static void doubles (Book book1, Book book2) {
        if (book1.equals(book2)) {
            System.out.println("Книги "+book1.shortString() +" и "+book2.shortString()+ " дублируются");
        }
        else {
            System.out.println("Книги "+book1.shortString() +" и "+book2.shortString()+ " разные");
        }
    }
}
