package by.bsuir.stephanovich.task2;

public class BelongingToArea {
    public static boolean isPointInTheArea(int x, int y){
        return ((Math.abs(x) <= 4 && y <=5 && y >=0) || (Math.abs(x) <= 6 && y <=0 && y >=-3));
    }
}
