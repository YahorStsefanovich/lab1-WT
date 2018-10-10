package by.bsuir.stephanovich.task12;

import by.bsuir.stephanovich.task15.BookAuthorComparator;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Book implements Comparable<Book>, Cloneable{

    public Book(String title, String author, int price, int isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        edition = 1;
    }

    @Override
    public int compareTo(Book b) {
        return Integer.compare(this.isbn - b.getIsbn(), 0);
    }

    private String title;
    private String author;
    private int price;
    private static int edition;
    private int isbn;

    public Book() {
        this.title = null;
        this.author = null;
        this.price = 0;
        Random r = new Random(100);
        this.isbn = r.nextInt();
        edition = 1;
    }

    @Override
    public Book clone(){
        try {
            return (Book)super.clone();
        }
        catch (CloneNotSupportedException ex){
            throw new InternalError();
        }
    }

    @Override
    public String toString(){
        return  "\n----------------------\n" +
                "Class: " + getClass().getName()  +
                ",\n title: " + title +
                ",\n author: " + author +
                ",\n price: " + price +
                "\n isbn: " + isbn;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + price;
        result = (prime * result) + author.hashCode();
        result = (prime * result) + title.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        Book book = (Book)obj;

        return (Objects.equals(book.author, author)) &&
                (Objects.equals(book.price, price)) &&
                (Objects.equals(book.title, title));
    }

    public static int getEdition() {
        return edition;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }


}
