package Module_04HW.Library;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String name;
    private String author;
    private String publishingHouse;
    private int yearOfPublish;
    private int pageNumber;
    private int price;

    public Book(String name, String author, String publishingHouse, int yearOfPublish, int pageNumber, int price) {
        this.name = name;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublish = yearOfPublish;
        this.pageNumber = pageNumber;
        this.price = price;
    }

    List<Book> book = Arrays.asList(
            new Book("Супер книга1", "Пупкин", "Кукуха", 1900, 200, 100),
            new Book("Супер-пупер книга1", "Вася", "Некукуха", 900, 1000, 50),
            new Book("Просто книга1", "Егорка", "Какое-то", 2020, 10, 20),
            new Book("Супер книга2", "Пупкин", "Кукуха", 1950, 220, 120),
            new Book("Супер-пупер книга2", "Вася", "Некукуха", 900, 1000, 30),
            new Book("Просто книга2", "Егорка", "Какое-то", 2020, 10, 200),
            new Book("Супер книга3", "Пупкин", "Кукуха", 1900, 250, 100),
            new Book("Супер-пупер книга3", "Вася", "Некукуха", 900, 1000, 50),
            new Book("Просто книга3", "Егорка", "Какое-то", 2020, 10, 80),
            new Book("Супер книга4", "Пупкин", "Кукуха", 1900, 200, 100),
            new Book("Супер-пупер книга4", "Вася", "Некукуха", 900, 1000, 500),
            new Book("Просто книга4", "Егорка", "Какое-то", 2020, 10, 50)
    );

    public String searchOfBookName(String name, List<Book> books) {
        books = new ArrayList<>();
        for (String name : books) {
            if (name.toLowerCase().contains(name.toLowerCase())) {
                System.out.println(books);
            }else {
                System.out.println("Такой книги у нас нет");
            }
        }return book;
    }
    public void searchOfBookAuthor(String author, List<Book> books) {
        books = new ArrayList<>();
        for (String author : books) {
            if (name.toLowerCase().contains(name.toLowerCase())) {
                System.out.println(books);
            }else {
                System.out.println("Такой книги у нас нет");
            }
        }
    }
}
