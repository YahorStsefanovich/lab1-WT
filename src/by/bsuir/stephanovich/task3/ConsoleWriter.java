package by.bsuir.stephanovich.task3;

import by.bsuir.stephanovich.ConsoleReader.ConsoleReader;

import java.util.Map;

public class ConsoleWriter {
    public static void main(String[] args) {
        //task3
        ConsoleReader.print("Input start of interval: ");
        double a = ConsoleReader.readDoubleNumber();

        ConsoleReader.print("Input end of interval: ");
        double b = ConsoleReader.readDoubleNumber();

        ConsoleReader.print("Input step: ");
        double h = ConsoleReader.readDoubleNumber();

        Map<Double, Double> map = GeneratorOfValues.findValueFromAToBWithStepH(a, b, h);
        System.out.println("Result(x : tg(x)): " + map);
    }
}
