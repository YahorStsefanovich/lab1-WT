package by.bsuir.stephanovich.task14test;

import by.bsuir.stephanovich.task12.Book;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BookTest {

    private static Book b1;
    private static Book b2;
    private static Book b3;

    @BeforeClass
    public static void initialization(){
        b1 = new Book("Вечера на хуторе близ Диканьки", "Н. Гоголь", 20, 12);
        b2 = new Book("Бородино", "М. Ю. Лермонтов", 25, 11);
        b3 = new Book("Жураулины крык", "В. Быков", 30, 10);
    }

    @Test
    public void book1MoreBook2Test() {
        Assert.assertEquals( 1, b1.compareTo(b2));
    }

    @Test
    public void book3LessBook1Test() {
        Assert.assertEquals( -1, b3.compareTo(b1));
    }

    @Test
    public void book2MoreBook1Test() {
        b1.setIsbn(10);
        Assert.assertEquals( 1, b2.compareTo(b1));
    }

    @Test
    public void book1EqualBook3Test() {
        b1.setIsbn(10);
        Assert.assertEquals( 0, b1.compareTo(b3));
    }
}