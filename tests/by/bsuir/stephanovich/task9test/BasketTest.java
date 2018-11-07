package by.bsuir.stephanovich.task9test;

import by.bsuir.stephanovich.task9.Ball;
import by.bsuir.stephanovich.task9.Basket;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BasketTest {

    private static Basket basket;

    @BeforeClass
    public static void initialization(){
        basket = new Basket(5);
        basket.addBall(new Ball(2, 2, "red"));
        basket.addBall(new Ball(1, 1, "blue"));
    }

    @Test
    public void getCapacityTest() {
        Assert.assertEquals(5, basket.getCapacity());
    }

    @Test
    public void basketIsNotFullTest() {
        basket = new Basket(5);
        Assertions.assertFalse(basket.isFull());
    }

    @Test
    public void itemAmountOfBallsTest() {
        Assert.assertEquals(2,basket.getItemAmountOfBalls());
    }


    @Test
    public void addBallInFullBasketTest() {
        boolean actual = basket.addBall(new Ball(3, 2, "green"));
        Assert.assertFalse(actual);
    }

    @Test
    public void addBallInNotFullBasketTest() {
        boolean actual = basket.addBall(new Ball(2, 2, "green"));
        Assert.assertTrue(actual);
    }

    @Test
    public void getOveralWeightTest() {
        Assert.assertEquals(5, basket.getOveralWeight());
    }

    @Test
    public void basketIsFullTest() {
        Assertions.assertTrue(basket.isFull());
    }

    @Test
    public void getItemAmountOfBalls() {
        basket = new Basket(5);
        Assert.assertEquals(0, basket.getItemAmountOfBalls());
        basket.addBall(new Ball(2, 2, "red"));
        basket.addBall(new Ball(1, 1, "blue"));
        Assert.assertEquals(2, basket.getItemAmountOfBalls());
    }

    @Test
    public void isFull() {
        basket = new Basket(5);
        Assert.assertFalse(basket.isFull());
        basket.addBall(new Ball(2, 2, "red"));
        basket.addBall(new Ball(1, 1, "blue"));
        basket.addBall(new Ball(2, 2, "red"));
        Assert.assertTrue(basket.isFull());
    }

    @Test
    public void findAmountOfBallsColoredBy() {
        basket = new Basket(5);
        basket.addBall(new Ball(2, 2, "red"));
        basket.addBall(new Ball(1, 1, "blue"));
        basket.addBall(new Ball(2, 2, "blue"));
        Assert.assertEquals(2,basket.findAmountOfBallsColoredBy("blue"));
    }
}