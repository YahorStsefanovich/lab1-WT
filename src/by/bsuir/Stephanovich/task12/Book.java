package by.bsuir.Stephanovich.task12;

import java.util.Objects;
import java.util.Random;

enum Education {SCHOOL, UNIVERSITY, KINDERGARTEN, PH_DEGREE}

public class Book implements Comparable<Book>{

    public Book(String title, String author, int price, int isbn){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
        education = Education.SCHOOL.ordinal();
    }

    @Override
    public int compareTo(Book b) {
        return this.isbn - b.getIsbn();
    }

    private String title;
    private String author;
    private int price;
    private static int education;
    private int isbn;

    public Book() {
        this.title = null;
        this.author = null;
        this.price = 0;
        Random r = new Random(100);
        this.isbn = r.nextInt();
        education = Education.SCHOOL.ordinal();
    }

    @Override
    protected Book clone(){
        final Book clone;
        try {
            clone = (Book)super.clone();
        } catch (CloneNotSupportedException ex){
            throw new RuntimeException("SuperClass messed up", ex);
        }
        clone.price = price;
        clone.author = author;
        clone.title = title;
        clone.isbn = isbn;
        return clone;
    }

    @Override
    public String toString(){
        return "Title: " + title + ", author: " + author + ", price: " + price;
    }

    @Override
    public int hashCode() {
        return toString().hashCode() * education;
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
        return (Objects.equals(book.author,author)) &&
                (Objects.equals(book.price, price)) &&
                (Objects.equals(book.title, title));
    }

    public static int getEducation() {
        return education;
    }

    public static void setEducation(int education) {
        Book.education = education;
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

    public static void main(String ... args){
        Book book1 = new Book("Idiot", "Mayakovskiy", 10, 4);
        Book book2 = new Book("Idiot", "Mayakovskiy", 10, 5);
        System.out.println(book1.toString());
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
