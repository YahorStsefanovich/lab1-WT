package by.bsuir.stephanovich.task6;

import by.bsuir.stephanovich.ConsoleReader.ConsoleReader;

public class ConsoleWriter {
    public static void main(String[] args) {
        //task6
        ConsoleReader.print("Input size of sequence: ");
        int size = ConsoleReader.readIntNumber();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            ConsoleReader.print("Input element " + i + ": ");
            array[i] = ConsoleReader.readIntNumber();
        }

        Matrix matrix = new Matrix(array);
        matrix.getMatrix();
        System.out.println("Matrix: \n" + matrix.toString());
    }
}
