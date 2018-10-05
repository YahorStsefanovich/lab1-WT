package by.bsuir.Stephanovich.task9;

public class Task9 {

    private Basket basket = new Basket(10);
    private String colors[] = {"blue", "green", "red"};
    public void fillBasket(){
        while (!basket.isFull())
        {
            int index = (int)(Math.random()*10)%3;
            String color = colors[index];
            basket.addBall(new Ball(1, 1, color));
        }
    }

    public int findAmountOfBallsColoredBy(String color){
        return basket.findAmountOfBallsColoredBy(color);
    }

    public int findWeightOfBasket(){
        return basket.getOveralWeight();
    }
}
