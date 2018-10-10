package by.bsuir.stephanovich.task8;

import by.bsuir.stephanovich.ConsoleReader.ConsoleReader;

import static by.bsuir.stephanovich.task8.TwoSequence.joinSequences;

public class ConsoleWriter {
    public static void main(String ... args){

        ConsoleReader.print("Input size of sequence A: ");
        int size = ConsoleReader.readIntNumber();
        int [] a = new int[size];
        for (int i = 0; i < size; i++) {
            ConsoleReader.print("Input element " + i + ": ");
            a[i] = ConsoleReader.readIntNumber();
        }

        ConsoleReader.print("Input size of sequence B: ");
        size = ConsoleReader.readIntNumber();
        int [] b = new int[size];
        for (int i = 0; i < size; i++) {
            ConsoleReader.print("Input element " + i + ": ");
            b[i] = ConsoleReader.readIntNumber();
        }

        System.out.println("Elements of B should be inserted at positions: " + joinSequences(a, b));
    }
}
