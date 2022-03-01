package ru.skypro.HomeTaskObjects.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    private int size;
    private Book[] library;

    public Library(int size) {
        this.size = size;
        this.library = new Book[size];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Book i : this.library) {
            if (i != null) {
                sb.append(i).append("\n");
            }
        }
        return sb.toString();
    }

     public void addBook(Book book) {
        for (int i = 0;i<this.size;i++) {
            if (i==this.size-1&&this.library[i]!=null) {
                System.out.println("Список полон");
            }
            if (this.library[i]==null) {
                this.library[i] = book;
                break;
            }
        }
     }
    /*Здесь я заморочился и сделал ввод, с возможностью ошибки и переписыванием. Получилось два метода*/
     public Book findBookForTitle(String name) {
         Book temp = new Book();
         for (Book i : this.library) {
             if (i!=null&&i.getTitle().equalsIgnoreCase(name)) {
                 temp=i;
             }
         }
         return temp;
     }

    public void searchBookForTitle () {
        Scanner sc = new Scanner(System.in);
        boolean isFind = true;
        while (isFind) {
            System.out.println("Введите название");
            String name = sc.nextLine();
            if (findBookForTitle(name).getTitle()!=null) {
                Book book = findBookForTitle(name);
                System.out.println(book.getTitle()+", автор "+book.getAuthor()+" была опубликована в "+book.getYear()+" году");
                isFind = false;
            }
            else {
                System.out.println("Что-то пошло не так. Введите ещё раз");
            }
        }
        sc.close();
    }
    /*а здесь не стал заморачиваться*/
    public void changeYear(String name, int year) {
        {findBookForTitle(name).setYear(year);
        System.out.println(findBookForTitle(name));}
    }
}
