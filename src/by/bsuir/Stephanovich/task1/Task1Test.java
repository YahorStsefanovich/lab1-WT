package by.bsuir.Stephanovich.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    public void solveEquation() {
        double excepted = 0.5;
        double actual = Task1.solveEquation(0,0);
        double delta = 0.000001;
        Assertions.assertEquals(excepted, actual);
    }
}