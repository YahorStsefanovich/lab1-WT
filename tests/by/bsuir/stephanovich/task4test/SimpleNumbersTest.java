package by.bsuir.stephanovich.task4test;

import by.bsuir.stephanovich.task4.SimpleNumbers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SimpleNumbersTest {

    @Test
    public void findIndexesOfSimpleNumbers() {
        SimpleNumbers numbers = new SimpleNumbers(new int[]{2, 3, 5, 7, 11, 13, 9, 24});
        ArrayList<Integer> exceptedArray = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        ArrayList<Integer> actualArray = numbers.findIndexesOfSimpleNumbers();
        assertArrayEquals( exceptedArray.toArray(), actualArray.toArray());

        numbers = new SimpleNumbers(new int[]{4, 6, 9, 10, 100, 111});
        actualArray = numbers.findIndexesOfSimpleNumbers();
        exceptedArray = new ArrayList<>();
        assertArrayEquals( exceptedArray.toArray(), actualArray.toArray());
    }
}