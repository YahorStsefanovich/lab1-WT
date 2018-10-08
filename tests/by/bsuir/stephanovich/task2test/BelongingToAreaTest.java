package by.bsuir.stephanovich.task2test;

import by.bsuir.stephanovich.task2.BelongingToArea;
import org.junit.jupiter.api.Assertions;

public class BelongingToAreaTest {

    @org.junit.Test
    public void isPointInTheArea() {
        Assertions.assertTrue(BelongingToArea.isPointInTheArea(0,0));
        Assertions.assertTrue(BelongingToArea.isPointInTheArea(-5,0));
        Assertions.assertTrue(BelongingToArea.isPointInTheArea(6,-3));
        Assertions.assertFalse(BelongingToArea.isPointInTheArea(-6,1));
        Assertions.assertFalse(BelongingToArea.isPointInTheArea(0,-4));
    }
}