package by.bsuir.stephanovich.task1;

import by.bsuir.stephanovich.ConsoleReader.ConsoleReader;

public class ConsoleWriter {
    //task1

    public static void main(String[] args) {
        ConsoleReader.print("Input number x: ");
        double x = ConsoleReader.readDoubleNumber();

        ConsoleReader.print("Input number y: ");
        double y = ConsoleReader.readDoubleNumber();

        ConsoleReader.println("Result: " + SolveExample.solveEquation(x, y));
    }
}
