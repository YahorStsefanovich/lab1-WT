package by.bsuir.Stephanovich.tests.task12test;

import by.bsuir.Stephanovich.task12.Book;
import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void compareTo() throws CloneNotSupportedException {
        Book b1 = new Book("Бородино", "А.С. Пушкин", 20, 1);
        Book b2 = new Book("Жураулины крык", "В. Караткевич", 40, 3);
        Assert.assertEquals(-1, b1.compareTo(b2));

        Book b3 = b2.clone();
        Assert.assertEquals(0, b2.compareTo(b3));


        Book b4 = new Book("Вечера на хуторе близ Диканьки", "Н. Гоголь", 10, 5);
        Assert.assertEquals(1, b4.compareTo(b2));
    }

    @Test
    public void cloninig() {
        Book b1 = new Book("Соколиный глаз", "Д.Ф. Купер", 30, 4);
        Book b2 = b1.clone();
        Assert.assertEquals(0, b1.compareTo(b2));

        b2.setPrice(10);
        Assert.assertEquals(10, b2.getPrice());
        Assert.assertNotEquals(10, b1.getPrice());
        Assert.assertFalse(b1.equals(b2));
    }

    @Test
    public void equals() {
        Book b1 = new Book("Приключения Тома Соера", "М. Твен", 35, 15);
        Book b2 = b1.clone();
        Assert.assertTrue(b1.equals(b2));

        b2.setTitle("Приключения Тома Сойера");
        b2.setPrice(30);
        Assert.assertFalse(b1.equals(b2));
    }
}