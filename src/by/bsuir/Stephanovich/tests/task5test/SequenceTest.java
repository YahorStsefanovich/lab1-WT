package by.bsuir.Stephanovich.tests.task5test;

import by.bsuir.Stephanovich.task5.Sequence;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceTest {

    @Test
    public void getMaxSequenceLength() {
        int actual = Sequence.getMaxSequenceLength(new int []{1, 0, 3, 4, 7});
        Assert.assertEquals(1, actual);

        actual = Sequence.getMaxSequenceLength(new int []{7, 6, 5, 4, 3});
        Assert.assertEquals(4, actual);

        actual = Sequence.getMaxSequenceLength(new int []{1, 1, 1, 1, 1});
        Assert.assertEquals(4, actual);

        actual = Sequence.getMaxSequenceLength(new int []{1, 2, 3, 4, 5});
        Assert.assertEquals(0, actual);

        actual = Sequence.getMaxSequenceLength(new int []{1, 7, 2, 6, 5, 4, 8});
        Assert.assertEquals(3, actual);
    }
}