package by.bsuir.stephanovich.task5test;

import by.bsuir.stephanovich.task5.Sequence;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SequenceTest {

    private int actual;

    @Test
    public void getMaxSequenceLengthList1() {
        actual = Sequence.getMaxSequenceLength(new int []{1, 0, 3, 4, 7});
        Assert.assertEquals(1, actual);
    }

    @Test
    public void getMaxSequenceLengthList2() {
        actual = Sequence.getMaxSequenceLength(new int []{7, 6, 5, 4, 3});
        Assert.assertEquals(4, actual);
    }

    @Test
    public void getMaxSequenceLengthList3() {
        actual = Sequence.getMaxSequenceLength(new int []{1, 1, 1, 1, 1});
        Assert.assertEquals(4, actual);
    }

    @Test
    public void getMaxSequenceLengthList4() {
        actual = Sequence.getMaxSequenceLength(new int []{1, 2, 3, 4, 5});
        Assert.assertEquals(0, actual);
    }

    @Test
    public void getMaxSequenceLengthList5() {
        actual = Sequence.getMaxSequenceLength(new int []{1, 7, 2, 6, 5, 4, 8});
        Assert.assertEquals(3, actual);
    }
}