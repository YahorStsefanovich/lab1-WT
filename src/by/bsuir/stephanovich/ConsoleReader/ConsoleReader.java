package by.bsuir.stephanovich.ConsoleReader;

import by.bsuir.stephanovich.task4.SimpleNumbers;
import by.bsuir.stephanovich.task1.SolveExample;
import by.bsuir.stephanovich.task2.BelongingToArea;
import by.bsuir.stephanovich.task6.Matrix;
import by.bsuir.stephanovich.task9.ConsoleWriter;

import java.util.Scanner;

public class ConsoleReader {
    public static Scanner scanner = new Scanner(System.in);

    public static double readDoubleNumber(){

        while (!scanner.hasNextDouble()){
            scanner.next();
        }

        return scanner.nextDouble();
    }

    public static int readIntNumber(){

        while (!scanner.hasNextInt()){
            scanner.next();
        }

        return scanner.nextInt();
    }


    public static void print(String message){
        System.out.print(message);
    }

    public static void println(String message){
        System.out.println(message);
    }
}

