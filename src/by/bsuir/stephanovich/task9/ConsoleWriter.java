package by.bsuir.stephanovich.task9;

import by.bsuir.stephanovich.ConsoleReader.ConsoleReader;

public class ConsoleWriter {

    private static String colors[] = {"blue", "green", "red"};

    private static Basket fillBasket(int capacity){
        Basket basket = new Basket(capacity);
        while (!basket.isFull())
        {
            ConsoleReader.print("Choose color of the ball(\"blue\" = 0, \"green\" = 1, \"red\" = 2): ");
            int index = ConsoleReader.readIntNumber();
            String color = colors[index];

            ConsoleReader.print("Choose ball size: ");
            int size = ConsoleReader.readIntNumber();

            ConsoleReader.print("Choose ball weight: ");
            int weight = ConsoleReader.readIntNumber();

            basket.addBall(new Ball(size, weight, color));
            ConsoleReader.println("Ball(size: " + size + ", weight: " + weight + "color: " + color  + " added"
                    + " Free place in basket: " + (basket.getCapacity() - basket.getItemSize()));
        }
        ConsoleReader.println("THE BASKET IS FULL");

        return basket;
    }

    public static void main(String [] args){
        ConsoleReader.print("Input the capacity of basket: ");
        int capacity = ConsoleReader.readIntNumber();
        Basket basket = fillBasket(capacity);
        System.out.println("Balls colored with blue:" + basket.findAmountOfBallsColoredBy("blue"));
        System.out.println("Wheight of basket: " + basket.getOveralWeight());
    }

}
