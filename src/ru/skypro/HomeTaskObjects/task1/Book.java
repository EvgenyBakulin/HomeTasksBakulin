package ru.skypro.HomeTaskObjects.task1;

import java.util.Objects;

public class Book {
    private Author author;
    private String title;
    private int year;

    public Book(Author author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, year);
    }

    @Override
    public String toString() {
        return author + "\""+title + "\"\nГод издания: "+ year;
    }
    //Метод сокращённой печати для вывода результата сравнения книг
    public String shortString() {
        return author.getSurame()+" "+"\""+title+"\""+", "+year;
    }
}
