package by.bsuir.stephanovich.task1test;

import by.bsuir.stephanovich.task1.SolveExample;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolveExampleTest {

    private double epsilan = 0.001;

    @Test
    void solveEquationTestZeroValues() {
        double actual = SolveExample.solveEquation(0,0);
        Assertions.assertEquals(0.5, actual);
    }

    @Test
    void solveEquationTest1() {
        Assertions.assertTrue(Math.abs(10.411 - SolveExample.solveEquation(10.3,100.3)) < epsilan);
    }

    @Test
    void solveEquationTest2() {
        Assertions.assertTrue(Math.abs(10.411 - SolveExample.solveEquation(10.3,100.3)) < epsilan);
    }
}