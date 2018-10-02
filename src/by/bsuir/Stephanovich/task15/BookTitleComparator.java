package by.bsuir.Stephanovich.task15;

import by.bsuir.Stephanovich.task12.Book;

import java.util.Comparator;

public class BookTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle());
    }

    @Override
    public Comparator<Book> thenComparing(Comparator<? super Book> other) {
        return null;
    }
}
