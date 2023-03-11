package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Brus", "Ekkel");
        Author author2 = new Author("Josh", "Bloh");


        Book book1 = new Book("Java for beginners", author2, 2005);
        Book book2 = new Book("Java for middle developers", author2, 2010);

        book2.setYear(2015);

        System.out.println(book1);
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());

        Book[] books = new Book[5];
        books[4] = new Book("Java for beginners", new Author("Josh", "Bloh"), 2005);
        books[3] = new Book("Java for beginners", new Author("Brus", "Ekkel"), 2019);

        addBook(books, book2);
        System.out.println(Arrays.toString(books));
        System.out.println();
        printBook(books);
    }

    public static void addBook(Book[] arr, Book... newBook) {
        for (int i = 0; i < newBook.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == null) {
                    arr[j] = newBook[i];
                }
            }
        }
    }

    //Задание средней сложности
    public static void printBook(Book[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == null) {
                continue;
            }
            System.out.println(newArray[i].getAuthor().getFirstName() + " " + newArray[i].getAuthor().getLastName()
                               + ": " + newArray[i].getTitle() + ": " + newArray[i].getTitle());
        }
    }


        /*
    ## Средний уровень

1. Необходимо в классе с методом main создать массив объектов типа Book и положить туда созданные книги.
2. Написать статические методы для работы с массивом в классе, где располагается метод main:
    1. Добавить книгу (найти свободную ячейку массива и положить туда книгу). Учесть,
    что этот метод может быть вызван любое количество раз (от 1 до 5) и каждая новая книга должна
    успешно укладываться в массив.
    2. Напечатать в консоль все книги из массива в следующем формате:

        “Stephen King: The Stand: 1978”
     */
}