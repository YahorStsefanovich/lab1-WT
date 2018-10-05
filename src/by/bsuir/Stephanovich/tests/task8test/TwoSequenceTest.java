package by.bsuir.Stephanovich.tests.task8test;

import by.bsuir.Stephanovich.task8.TwoSequence;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoSequenceTest {

    @Test
    public void joinSequences() {
        int [] A = {1,1,3,5,5,7};
        int [] B = {2,3,4,6,6,7};
        var actual = TwoSequence.joinSequences(A, B);
        var excepted = new ArrayList<>(Arrays.asList(2, 4, 5, 8, 9, 11));
        Assert.assertArrayEquals(excepted.toArray(), actual.toArray());

        int [] C = {10, 10, 12};
        int [] D = {9 ,11};
        actual = TwoSequence.joinSequences(C, D);
        excepted = new ArrayList<>(Arrays.asList(0, 3));
        Assert.assertArrayEquals(excepted.toArray(), actual.toArray());
    }
}