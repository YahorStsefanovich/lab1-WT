package by.bsuir.Stephanovich.task3;

import java.io.Console;

public class GeneratorOfValues {
    public static void findValueFromAToBWithStepH(double a, double b, double h){
        while (a <= b){
            System.out.println(a + " : " + Math.sin(a)/Math.cos(a));
            a += h;
        }
    }
}