package by.bsuir.Stephanovich.task15;

import by.bsuir.Stephanovich.task12.Book;
import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getAuthor().compareTo(b2.getAuthor());
    }
}
