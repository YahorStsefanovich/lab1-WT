package tests.tests.task14test;

import by.bsuir.Stephanovich.task12.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void compareTo() {
        Book b1 = new Book("Вечера на хуторе близ Диканьки", "Н. Гоголь", 20, 12);
        Book b2 = new Book("Бородино", "М. Ю. Лермонтов", 25, 11);
        Book b3 = new Book("Жураулины крык", "В. Быков", 30, 10);
        Assert.assertEquals( 1, b1.compareTo(b2));
        Assert.assertEquals( -1, b3.compareTo(b1));

        b1.setIsbn(10);
        Assert.assertEquals( 1, b2.compareTo(b1));
        Assert.assertEquals( 0, b1.compareTo(b3));
    }
}