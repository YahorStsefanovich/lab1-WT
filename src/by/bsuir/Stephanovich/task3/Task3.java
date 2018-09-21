package by.bsuir.Stephanovich.task3;

import java.io.Console;

public class Task3 {
    public static void findValueFromAToBWithStepH(double a, double b, double h){
        while (a <= b){
            //System.out.print( Math.sin(a)/Math.cos(a));
            System.out.println( Math.sin(a)/Math.cos(a));
            a += h;
        }
    }
}
