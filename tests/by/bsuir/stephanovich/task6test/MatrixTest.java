package by.bsuir.stephanovich.task6test;

import by.bsuir.stephanovich.task6.Matrix;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatrixTest {

    private Matrix matrix;
    private int [][] excepted;

    @Before
    public void initialization(){
        matrix = new Matrix(1, 2, 3);
    }

    @Test
    public void getMatrixList1() {
        excepted = new int[][] {{1,2,3}, {2,3,1}, {3,1,2}};
        Assert.assertArrayEquals(excepted, matrix.getMatrix());
    }

    @Test
    public void getMatrixList2() {
        matrix = new Matrix(1, 1, 1, 1);
        excepted = new int[][] {{1,1,1,1}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}};
        Assert.assertArrayEquals(excepted, matrix.getMatrix());
    }
}