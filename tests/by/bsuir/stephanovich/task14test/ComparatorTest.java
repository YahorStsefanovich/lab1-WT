package by.bsuir.stephanovich.task14test;

import by.bsuir.stephanovich.task12.Book;
import by.bsuir.stephanovich.task15.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

public class ComparatorTest {

    private static Book b1;
    private static Book b2;
    private static Book b3;
    private static Book b4;
    private static Book b5;
    private static Book b6;
    private ArrayList<Book> collection;

    @BeforeClass
    public static void initialization(){
        b1 = new Book("Вечера на хуторе близ Диканьки", "Н. Гоголь", 20, 12);
        b2 = new Book("Бородино", "М. Ю. Лермонтов", 25, 11);
        b3 = new Book("Жураулины крык", "В. Быков", 30, 10);
        b4 = new Book("Бородино", "А. С. Пушкин", 20, 10);
        b5 = new Book("Знак бяды", "В. Быков", 30, 10);
        b6 = new Book("Вечера на хуторе близ Диканьки", "Н. Гоголь", 20, 11);
    }

    @Before
    public void initializationBeforeEachTest(){
        collection = new ArrayList<>(Arrays.asList(b1, b2, b3));
    }

    @Test
    public void authorComparator() {
        //sort by author name
        collection.sort(new BookAuthorComparator());
        Assert.assertEquals(new ArrayList<>(Arrays.asList(b3, b2, b1)), collection);
    }

    @Test
    public void titleComparator() {
        //sort by title
        collection.sort(new BookTitleComparator());
        Assert.assertEquals(new ArrayList<>(Arrays.asList(b2, b1, b3)), collection);
    }

    @Test
    public void titleThenAuthorComparator() {
        //sort by title then author
        collection.add(b4);
        collection.sort(new BookTitleThenAuthorComparator());
        Assert.assertEquals(new ArrayList<>(Arrays.asList(b4, b2, b1, b3)), collection);
    }

    @Test
    public void authorThenTitleComparator() {
        //sort by author then title
        collection.add(b4);
        collection.add(b5);
        collection.sort(new BookAuthorThenTitleComparator());
        Assert.assertEquals(new ArrayList<>(Arrays.asList(b4, b3, b5, b2, b1)), collection);
    }

    @Test
    public void authorThenTitleThenPriceComparator() {
        //sort by author, title, price
        collection.add(b4);
        collection.add(b5);
        collection.add(b6);
        collection.sort(new BookAuthorTitlePriceComparator());
        Assert.assertEquals(new ArrayList<>(Arrays.asList(b4, b3, b5, b2, b6, b1)), collection);
    }
}