package ru.skypro.HomeTaskObjects.task1;

public class Book {
    private Author author;
    private String title;
    private int year;

    public Book (Author author, String title, int year) {
       // this.author = new Author(name, surname);
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

    public Author getAuthor(){
        return author;
    }
    public void printBook() {
        System.out.println("Имя автора - " + this.getAuthor().getName());
        System.out.println("Фамилия автора - " + this.getAuthor().getSurame());
        System.out.println("Название - " + this.getTitle() + "\nГод издания - " + this.getYear()+" год\n");
    }
}
