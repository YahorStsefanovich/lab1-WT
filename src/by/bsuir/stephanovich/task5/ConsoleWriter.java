package by.bsuir.stephanovich.task5;

import by.bsuir.stephanovich.ConsoleReader.ConsoleReader;

public class ConsoleWriter {
    public static void main(String ... args){
        ConsoleReader.print("Input size of sequence: ");
        int size = ConsoleReader.readIntNumber();
        int [] array = new int[size];
        for (int i = 0; i < size; i++) {
            ConsoleReader.print("Input element " + i + ": ");
            array[i] = ConsoleReader.readIntNumber();
        }

        int maxLength = Sequence.getMaxSequenceLength(array);

        ConsoleReader.print("Maximum length of icreasing sequence: " + (array.length - maxLength));
    }
}
