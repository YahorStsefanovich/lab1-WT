package by.bsuir.Stephanovich.tests.task7test;

import by.bsuir.Stephanovich.task7.ShellSort;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShellSortTest {

    @Test
    public void shellSort() {
        int [] excepted = new int[]{0, 1, 2, 5, 6};
        Assert.assertArrayEquals(excepted, ShellSort.shellSort(5, 2, 0, 1, 6));

        excepted = new int[]{1, 1, 1, 3, 5, 6};
        Assert.assertArrayEquals(excepted, ShellSort.shellSort(5, 1, 1, 1, 6, 3));
    }
}