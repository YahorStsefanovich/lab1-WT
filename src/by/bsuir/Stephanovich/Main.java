package by.bsuir.Stephanovich;

import by.bsuir.Stephanovich.Task4.Task4;
import by.bsuir.Stephanovich.task1.Task1;
import by.bsuir.Stephanovich.task2.Task2;
import by.bsuir.Stephanovich.task3.Task3;
import by.bsuir.Stephanovich.task9.Task9;

public class Main {

    public static void main(String[] args) {
        //task1
        System.out.println("Result: " + Task1.solveEquation(1,2));
        //task2
        System.out.println("Is point int the area? " + Task2.isPointInTheArea(1, 2));
        //task3
        Task3.findValueFromAToBWithStepH(1.0,2.0, 0.5);
        //task4
        Task4 task4 = new Task4(10);
        System.out.println(task4.findIndexesOfSimpleNumbers().toString());
        //task9
        Task9 task9 = new Task9();
        task9.fillBasket();
        System.out.println("Balls colored with blue:" + task9.findAmountOfBallsColoredBy("blue"));
        System.out.println("Wheight of basket: " + task9.findWeightOfBasket());

    }
}

