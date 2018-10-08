package by.bsuir.stephanovich.task9test;

import by.bsuir.stephanovich.task9.Ball;
import by.bsuir.stephanovich.task9.Basket;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BasketTest {


    @Test
    public void getCapacity() {
        Basket basket = new Basket(5);
        Assert.assertEquals(5, basket.getCapacity());
    }

    @Test
    public void getOveralWeight() {
        Basket basket = new Basket(5);
        basket.addBall(new Ball(2, 2, "red"));
        basket.addBall(new Ball(1, 1, "blue"));
        Assertions.assertFalse(basket.isFull());
        Assert.assertEquals(2,basket.getItemAmountOfBalls());
        Assert.assertEquals(3, basket.getOveralWeight());
        Assert.assertFalse(basket.addBall(new Ball(3, 2, "green")));
        Assert.assertEquals(2, basket.getItemAmountOfBalls());
        Assertions.assertTrue(basket.addBall(new Ball(2, 2, "green")));
        Assertions.assertTrue(basket.isFull());
        Assert.assertEquals(3, basket.getItemAmountOfBalls());
        Assert.assertEquals(5, basket.getOveralWeight());
    }

    @Test
    public void getItemAmountOfBalls() {
        Basket basket = new Basket(5);
        Assert.assertEquals(0, basket.getItemAmountOfBalls());
        basket.addBall(new Ball(2, 2, "red"));
        basket.addBall(new Ball(1, 1, "blue"));
        Assert.assertEquals(2, basket.getItemAmountOfBalls());
    }

    @Test
    public void isFull() {
        Basket basket = new Basket(5);
        Assert.assertFalse(basket.isFull());
        basket.addBall(new Ball(2, 2, "red"));
        basket.addBall(new Ball(1, 1, "blue"));
        basket.addBall(new Ball(2, 2, "red"));
        Assert.assertTrue(basket.isFull());
    }

    @Test
    public void findAmountOfBallsColoredBy() {
        Basket basket = new Basket(5);
        basket.addBall(new Ball(2, 2, "red"));
        basket.addBall(new Ball(1, 1, "blue"));
        basket.addBall(new Ball(2, 2, "blue"));
        Assert.assertEquals(2,basket.findAmountOfBallsColoredBy("blue"));
    }
}