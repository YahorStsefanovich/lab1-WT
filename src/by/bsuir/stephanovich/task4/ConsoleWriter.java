package by.bsuir.stephanovich.task4;

import by.bsuir.stephanovich.ConsoleReader.ConsoleReader;

public class ConsoleWriter {
    public static void main(String[] args) {
        //task4
        ConsoleReader.print("Input size of array: ");
        int size = ConsoleReader.readIntNumber();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            ConsoleReader.print("Input element " + i + ": ");
            array[i] = ConsoleReader.readIntNumber();
        }

        SimpleNumbers task4 = new SimpleNumbers(array);
        ConsoleReader.println("Indexes of simple numbers: " + task4.findIndexesOfSimpleNumbers());
    }
}
