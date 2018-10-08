package by.bsuir.stephanovich.ConsoleReader;

import by.bsuir.stephanovich.task4.SimpleNumbers;
import by.bsuir.stephanovich.task1.SolveExample;
import by.bsuir.stephanovich.task2.BelongingToArea;
import by.bsuir.stephanovich.task6.Matrix;
import by.bsuir.stephanovich.task9.ConsoleWriter;

public class Main {

    public static void main(String[] args) {
        //task1
        System.out.println("Result: " + SolveExample.solveEquation(1,2));
        //task2
        System.out.println("Is point int the area? " + BelongingToArea.isPointInTheArea(1, 2));
        //task3
       // GeneratorOfValues.findValueFromAToBWithStepH(1.0,2.0, 0.5);
        //task4
        SimpleNumbers task4 = new SimpleNumbers(10);
        System.out.println(task4.findIndexesOfSimpleNumbers().toString());
        //task6
        Matrix matrix = new Matrix(1,2,3,4);
        System.out.println(matrix.toString());
        //task9
        ConsoleWriter task9 = new ConsoleWriter();
        task9.fillBasket();
        System.out.println("Balls colored with blue:" + task9.findAmountOfBallsColoredBy("blue"));
        System.out.println("Wheight of basket: " + task9.findWeightOfBasket());

    }
}
