package Module_04HW.Library;

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
}
