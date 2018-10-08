package by.bsuir.stephanovich.task1;

public class SolveExample {
    public static double solveEquation(double x, double y){
        double sinXandY = Math.sin(x + y);
        double numerator = 1 + Math.pow(sinXandY, 2);
        double denomenutor = 2 + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)));
        return x + numerator / denomenutor;
    }

    public static void main(String ... args){
        System.out.println( SolveExample.solveEquation(1,3));
        System.out.println(Math.abs(1.562 - SolveExample.solveEquation(1,3)));
    }
}

