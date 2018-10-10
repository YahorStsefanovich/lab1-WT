package by.bsuir.stephanovich.task2;

import by.bsuir.stephanovich.ConsoleReader.ConsoleReader;

public class ConsoleWriter {
    public static void main(String[] args) {
        //task2
        ConsoleReader.print("Input x-coordinate: ");
        int x = ConsoleReader.readIntNumber();

        ConsoleReader.print("Input y-coordinate: ");
        int y = ConsoleReader.readIntNumber();

        boolean result = BelongingToArea.isPointInTheArea(x, y);
        ConsoleReader.print("Is point int the area? ");

        if (result){
            ConsoleReader.println("Yes, it is.");
        }
        else{
            ConsoleReader.println("No");
        }
    }
}
