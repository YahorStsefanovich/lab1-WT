package by.bsuir.stephanovich.task7;

import by.bsuir.stephanovich.ConsoleReader.ConsoleReader;

import static by.bsuir.stephanovich.task7.ShellSort.shellSort;

public class ConsoleWriter {
    public static void main(String ... args){
        ConsoleReader.print("Input size of sequence: ");
        int size = ConsoleReader.readIntNumber();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            ConsoleReader.print("Input element " + i + ": ");
            array[i] = ConsoleReader.readIntNumber();
        }

        ConsoleReader.println("Sorted Array: ");
        for (int x : shellSort(array)){
            ConsoleReader.print(x + "    ");
        }

    }
}
