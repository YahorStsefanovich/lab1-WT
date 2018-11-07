package by.bsuir.stephanovich.task4test;

import by.bsuir.stephanovich.task4.SimpleNumbers;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SimpleNumbersTest {

    private SimpleNumbers numbers;
    private ArrayList<Integer> exceptedArray;
    private ArrayList<Integer> actualArray;

    @Before
    public void initialization(){
        numbers = new SimpleNumbers(new int[]{2, 3, 5, 7, 11, 13, 9, 24});
    }

    @Test
    public void findIndexesOfSimpleNumbersTestList1() {
        exceptedArray = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        actualArray = numbers.findIndexesOfSimpleNumbers();
        assertArrayEquals( exceptedArray.toArray(), actualArray.toArray());
    }

    @Test
    public void findIndexesOfSimpleNumbersTestList2() {
        numbers = new SimpleNumbers(new int[]{4, 6, 9, 10, 100, 111});
        actualArray = numbers.findIndexesOfSimpleNumbers();
        exceptedArray = new ArrayList<>();
        assertArrayEquals( exceptedArray.toArray(), actualArray.toArray());
    }

}