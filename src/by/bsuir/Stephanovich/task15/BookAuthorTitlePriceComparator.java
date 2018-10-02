package by.bsuir.Stephanovich.task15;

import by.bsuir.Stephanovich.task12.Book;

import java.util.Comparator;

public class BookAuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        Comparator<Book> cmp = new BookAuthorComparator().
                thenComparing(new BookTitleComparator()).
                thenComparing(new BookPriceComparator());
        return cmp.compare(b1, b2);
    }
}
