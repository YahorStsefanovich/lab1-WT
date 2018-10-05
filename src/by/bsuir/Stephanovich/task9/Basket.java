package by.bsuir.Stephanovich.task9;

import java.util.ArrayList;

public class Basket {

    public Basket() {
        this.capacity = 10;
        this.itemAmountOfBalls = 0;
        this.itemSize = 0;
        balls = new ArrayList<>();
    }

    public Basket(int capacity) {
        this.capacity = capacity;
        this.itemAmountOfBalls = 0;
        this.itemSize = 0;
        balls = new ArrayList<>();
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


    public int getItemAmountOfBalls() {
        return itemAmountOfBalls;
    }

    private int itemAmountOfBalls;
    private int itemSize;

    public boolean isFull(){
        return itemSize == capacity;
    }

    public boolean addBall(Ball ball){
        if ((!isFull()) && (capacity - itemSize >= ball.getSize())){
            balls.add(ball);
            itemAmountOfBalls++;
            itemSize += ball.getSize();
            return true;
        }
        return false;
    }

    public int findAmountOfBallsColoredBy(String color){
        int result = 0;
        for (Ball ball:balls){
            if ( ball.getColor().equals(color))
                result++;
        }
        return result;
    }

    public int getItemSize() {
        return itemSize;
    }
}
