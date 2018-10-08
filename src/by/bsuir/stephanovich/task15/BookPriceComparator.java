package by.bsuir.stephanovich.task15;

import by.bsuir.stephanovich.task12.Book;
import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.getPrice() - b2.getPrice();
    }
}
