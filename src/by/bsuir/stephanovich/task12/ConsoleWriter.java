package by.bsuir.stephanovich.task12;

import by.bsuir.stephanovich.task15.BookAuthorComparator;

import java.util.ArrayList;

public class ConsoleWriter {
    public static void main(String ... args){
        ArrayList<Book> collection = new ArrayList<>();
        Book b1 = new Book("Вечера на хуторе близ Диканьки", "Н. Гоголь", 20, 12);
        Book b2 = new Book("Бородино", "М. Ю. Лермонтов", 25, 11);
        Book b3 = new Book("Жураулины крык", "В. Быков", 30, 10);

        BookAuthorComparator bookAuthorComparator = new BookAuthorComparator();

        collection.add(b1);
        collection.add(b2);
        collection.add(b3);
        collection.sort(bookAuthorComparator);
        System.out.println(collection);
    }

}
