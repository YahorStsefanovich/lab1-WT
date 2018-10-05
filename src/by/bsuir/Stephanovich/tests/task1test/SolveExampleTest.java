package by.bsuir.Stephanovich.tests.task1test;

import by.bsuir.Stephanovich.task1.SolveExample;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolveExampleTest {

    @Test
    public void solveEquation() {
        Assertions.assertEquals(0.5, SolveExample.solveEquation(0,0));

        double epsilan = 0.001;
        Assertions.assertTrue(Math.abs(10.411 - SolveExample.solveEquation(10.3,100.3)) < epsilan);
        Assertions.assertTrue(Math.abs(1.562 - SolveExample.solveEquation(1,3)) < epsilan);
    }
}