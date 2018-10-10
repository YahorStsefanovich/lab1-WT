package by.bsuir.stephanovich.task12;

import by.bsuir.stephanovich.ConsoleReader.ConsoleReader;
import by.bsuir.stephanovich.task15.*;

import java.util.ArrayList;

public class ConsoleWriter {

    private static ArrayList<Book>  fillArray(int amount){
        ArrayList<Book> collection = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            System.out.print("Input title: ");
            String title = ConsoleReader.scanner.next();

            System.out.print("Input author: ");
            String author = ConsoleReader.scanner.next();

            System.out.print("Input price: ");
            int price = ConsoleReader.readIntNumber();

            System.out.print("Input ISBN: ");
            int isbn = ConsoleReader.readIntNumber();

            Book b = new Book(title, author, price, isbn);
            collection.add(b);
            System.out.print("Added book: " +  b.toString());
        }
        System.out.println("Collection filled");
        System.out.println(collection);
        return collection;
    }

    public static void main(String ... args){
        ConsoleReader.print("Input amount of books: ");
        int amount = ConsoleReader.readIntNumber();
        ArrayList<Book> collection = fillArray(amount);

        BookTitleComparator bookTitleComparator = new BookTitleComparator();
        collection.sort(bookTitleComparator);
        System.out.println("-------------------------");
        System.out.println("Sorted in order of title: ");
        System.out.println(collection);

        BookAuthorThenTitleComparator bookAuthorThenTitleComparator = new BookAuthorThenTitleComparator();
        collection.sort(bookAuthorThenTitleComparator);
        System.out.println("-------------------------");
        System.out.println("Sorted in order of author, title: ");
        System.out.println(collection);

        BookTitleThenAuthorComparator bookTitleThenAuthorComparator = new BookTitleThenAuthorComparator();
        collection.sort(bookTitleThenAuthorComparator);
        System.out.println("-------------------------");
        System.out.println("Sorted in order of title, author: ");
        System.out.println(collection);

        BookAuthorTitlePriceComparator bookAuthorTitlePriceComparator = new BookAuthorTitlePriceComparator();
        collection.sort(bookAuthorTitlePriceComparator);
        System.out.println("-------------------------");
        System.out.println("Sorted in order of author, title, price: ");
        System.out.println(collection);
    }

}
