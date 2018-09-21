package by.bsuir.Stephanovich;

import by.bsuir.Stephanovich.task1.Task1;
import by.bsuir.Stephanovich.task2.Task2;
import by.bsuir.Stephanovich.task3.Task3;
import by.bsuir.Stephanovich.task9.Task9;

public class Main {

    public static void main(String[] args) {
        System.out.println(Task1.solveEquation(1,2));
        System.out.println(Task2.isPointInTheArea(1, 2));
        Task3.findValueFromAToBWithStepH(1.0,2.0, 0.5);
        Task9 task9 = new Task9();
        task9.fillBasket();
        System.out.println(task9.findAmountOfBallsColoredBy("blue"));
        System.out.println(task9.findWeightOfBasket());
    }
}

