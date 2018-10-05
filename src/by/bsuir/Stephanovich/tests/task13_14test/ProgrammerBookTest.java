package by.bsuir.Stephanovich.tests.task13_14test;

import by.bsuir.Stephanovich.task12.Book;
import by.bsuir.Stephanovich.task13_14.ProgrammerBook;
import org.junit.Assert;
import org.junit.Test;

public class ProgrammerBookTest {

    @Test
    public void equals() {
        ProgrammerBook pb1 = new ProgrammerBook("Философия Java", "Б. Эккель", 100, 14, "Русский", 2);
        ProgrammerBook pb2 = new ProgrammerBook("Java philosophy", "B. Eckel", 100, 14, "English", 2);
        Assert.assertFalse(pb1.equals(pb2));

        pb1.setTitle("Java philosophy");
        pb1.setLanguge("English");
        pb1.setAuthor("B. Eckel");
        Assert.assertTrue(pb1.equals(pb2));
    }

    @Test
    public void toStringTest() {
        Book pb = new ProgrammerBook("Философия Java", "Б. Эккель", 100, 14, "Русский", 2);
        Book b = new Book("Философия Java", "Б. Эккель", 100, 14);
        Assert.assertNotSame(b, pb);
        Assert.assertNotEquals(pb.toString(), b.toString());
    }

    @Test
    public void hashCodeTest() {
        Book pb = new ProgrammerBook("Философия Java", "Б. Эккель", 100, 14, "Русский", 2);
        Book b = new Book("Философия Java", "Б. Эккель", 100, 14);
        Assert.assertNotEquals(pb.hashCode(), b.hashCode());
    }
}