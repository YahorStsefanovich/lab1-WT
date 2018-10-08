package by.bsuir.stephanovich.task14test;

import by.bsuir.stephanovich.task12.Book;
import by.bsuir.stephanovich.task15.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ComparatorTest {

    @Test
    public void compare() {
        Book b1 = new Book("Вечера на хуторе близ Диканьки", "Н. Гоголь", 20, 12);
        Book b2 = new Book("Бородино", "М. Ю. Лермонтов", 25, 11);
        Book b3 = new Book("Жураулины крык", "В. Быков", 30, 10);

        ArrayList<Book> collection = new ArrayList<>(Arrays.asList(b1, b2, b3));


        //sort by author name
        collection.sort(new BookAuthorComparator());
        Assert.assertEquals(new ArrayList<>(Arrays.asList(b3, b2, b1)), collection);

        //sort by title
        collection.sort(new BookTitleComparator());
        Assert.assertEquals(new ArrayList<>(Arrays.asList(b2, b1, b3)), collection);

        //sort by title then author
        Book b4 = new Book("Бородино", "А. С. Пушкин", 20, 10);
        collection.add(b4);
        collection.sort(new BookTitleThenAuthorComparator());
        Assert.assertEquals(new ArrayList<>(Arrays.asList(b4, b2, b1, b3)), collection);

        //sort by author then title
        Book b5 = new Book("Знак бяды", "В. Быков", 30, 10);
        collection.add(b5);
        collection.sort(new BookAuthorThenTitleComparator());
        Assert.assertEquals(new ArrayList<>(Arrays.asList(b4, b3, b5, b2, b1)), collection);

        //sort by author, title, price
        Book b6 = new Book("Вечера на хуторе близ Диканьки", "Н. Гоголь", 20, 11);
        collection.add(b6);
        collection.sort(new BookAuthorTitlePriceComparator());
        Assert.assertEquals(new ArrayList<>(Arrays.asList(b4, b3, b5, b2, b6, b1)), collection);
    }
}