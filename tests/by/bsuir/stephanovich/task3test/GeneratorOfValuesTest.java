package by.bsuir.stephanovich.task3test;

import by.bsuir.stephanovich.task3.GeneratorOfValues;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Map;

public class GeneratorOfValuesTest {

    private double epsilan = 0.01;
    private Map<Double, Double> map;

    @Before
    public void initialization(){
        map = GeneratorOfValues.findValueFromAToBWithStepH(0, 1,0.1);
    }

    @Test
    public void findValueFrom0To1WithH1Per10() {
        Assertions.assertEquals(11, map.size());
    }

    @Test
    public void findValueFrom0To1With1Per10Contains0() {
        Assertions.assertTrue(map.containsValue(0.0));


        map = GeneratorOfValues.findValueFromAToBWithStepH(-1, 2,0.1);
        Assertions.assertEquals(30, map.size());
        Assertions.assertTrue(Math.abs(map.get(-1.0) - (-1.557)) < epsilan);
    }

    @Test
    public void findValueFrom0To1With1Per10Contains546Per10() {
        Assertions.assertTrue(Math.abs(map.get(0.5) - 0.546) < epsilan);
    }

    @Test
    public void findValueFromMinus1To2With1Per10Contains546Per10CheckSize() {
        map = GeneratorOfValues.findValueFromAToBWithStepH(-1, 2,0.1);
        Assertions.assertEquals(30, map.size());
    }

    @Test
    public void findValueFromMinus1To2With1Per10Contains546Per10Contains1dot557() {
        map = GeneratorOfValues.findValueFromAToBWithStepH(-1, 2,0.1);
        Assertions.assertTrue(Math.abs(map.get(-1.0) - (-1.557)) < epsilan);
    }
}