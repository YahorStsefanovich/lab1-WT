package by.bsuir.stephanovich.task7;

import static by.bsuir.stephanovich.task7.ShellSort.shellSort;

public class ConsoleWriter {
    public static void main(String ... args){
        int [] arr = {5,1,4,6,7,2,0};
        for (int x : arr){
            System.out.print(x + "    ");
        }
        System.out.println();
        for (int x : shellSort(arr)){
            System.out.print(x + "    ");
        }

    }
}
