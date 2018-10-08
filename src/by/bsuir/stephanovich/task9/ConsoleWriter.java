package by.bsuir.stephanovich.task9;

public class ConsoleWriter {

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

    public static void main(String [] args){
        ConsoleWriter task9 = new ConsoleWriter();
        task9.fillBasket();
        System.out.println("Balls colored with blue:" + task9.findAmountOfBallsColoredBy("blue"));
        System.out.println("Wheight of basket: " + task9.findWeightOfBasket());
    }

    public int findAmountOfBallsColoredBy(String color){
        return basket.findAmountOfBallsColoredBy(color);
    }

    public int findWeightOfBasket(){
        return basket.getOveralWeight();
    }
}
