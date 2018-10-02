package by.bsuir.Stephanovich.task1;

public class SolveExample {
    public static double solveEquation(int x, int y){
        double numerator = 1 + Math.sqrt(Math.sin(x+y));
        double denomenutor = 2 + Math.abs(x - (2*x)/(1+x*x*y*y));
        return numerator/denomenutor;
    }
}

