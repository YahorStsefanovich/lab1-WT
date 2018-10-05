package by.bsuir.Stephanovich.tests.task3test;

import by.bsuir.Stephanovich.task3.GeneratorOfValues;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Map;

public class GeneratorOfValuesTest {

    @Test
    public void findValueFromAToBWithStepH() {
        Map<Double, Double> map = GeneratorOfValues.findValueFromAToBWithStepH(0, 1,0.1);
        Assertions.assertEquals(11, map.size());

        double epsilan = 0.01;
        Assertions.assertTrue(map.containsValue(0.0));
        Assertions.assertTrue(Math.abs(map.get(0.5) - 0.546) < epsilan);

        map = GeneratorOfValues.findValueFromAToBWithStepH(-1, 2,0.1);
        Assertions.assertEquals(30, map.size());
        Assertions.assertTrue(Math.abs(map.get(-1.0) - (-1.557)) < epsilan);
    }
}