package by.bsuir.Stephanovich.task9;

import java.util.ArrayList;

public class Basket {
    public Basket(int capacity) {
        this.capacity = capacity;
        this.itemAmount = 0;
        balls = new ArrayList<Ball>();
    }

    private ArrayList<Ball> balls;

    public int getCapacity() {
        return capacity;
    }

    private int capacity;

    public int getOveralWeight() {
        int result = 0;
        for (Ball ball:balls){
            result += ball.getWeight();
        }
        return result;
    }


    public int getItemAmount() {
        return itemAmount;
    }

    private int itemAmount;

    public boolean isFull(){
        return itemAmount >= capacity;
    }

    public boolean addBall(Ball ball){
        if (!isFull()){
            balls.add(ball);
            itemAmount++;
            return true;
        } else
            return false;
    }

    public int findAmountOfBallsCloredBy(String color){
        int result = 0;
        for (Ball ball:balls){
            if ( ball.getColor().equals(color))
                result++;
        }
        return result;
    }
}
