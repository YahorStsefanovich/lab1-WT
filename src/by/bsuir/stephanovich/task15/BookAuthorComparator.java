package by.bsuir.stephanovich.task15;

import by.bsuir.stephanovich.task12.Book;
import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}
