package by.bsuir.stephanovich.task3;

import java.util.Map;
import java.util.TreeMap;

public class GeneratorOfValues {
    public static Map<Double, Double> findValueFromAToBWithStepH(double a, double b, double h){
        Map<Double, Double> map = new TreeMap<>();
        while (a <= b){
            map.put(a, Math.sin(a)/Math.cos(a));
            a += h;
        }
        return map;
    }
}
