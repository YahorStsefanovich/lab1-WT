package tests.tests.task6test;

import by.bsuir.Stephanovich.task6.Matrix;
import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {

    @Test
    public void getMatrix() {
        Matrix matrix = new Matrix(1, 2, 3);
        int [][] excepted = new int[][] {{1,2,3}, {2,3,1}, {3,1,2}};
        Assert.assertArrayEquals(excepted, matrix.getMatrix());

        matrix = new Matrix(1, 1, 1, 1);
        excepted = new int[][] {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
        Assert.assertArrayEquals(excepted, matrix.getMatrix());
    }
}