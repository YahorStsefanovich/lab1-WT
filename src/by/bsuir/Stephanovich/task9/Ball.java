package by.bsuir.Stephanovich.task9;

public class Ball {
    public Ball(int size, int weight, String color) {
        this.size = size;
        this.weight = weight;
        this.color = color;
    }

    private String color;
    private int size;
    private int weight;


    public int getWeight() {
        return weight;
    }

    public Ball(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
