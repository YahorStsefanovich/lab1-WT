package by.bsuir.Stephanovich.tests;

import by.bsuir.Stephanovich.task1.SolveExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolveExampleTest {

    @Test
    public void solveEquation() {
        double excepted = 0.5;
        double actual = SolveExample.solveEquation(0,0);
        Assertions.assertEquals(excepted, actual);
    }
}