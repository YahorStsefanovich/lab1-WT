package by.bsuir.stephanovich.task7;

public class ShellSort {


    public static int[] shellSort(int ... args){
        int j, h;
        int halfItem = args.length /2;
        while (halfItem > 0){
            for (int i = 0; i < args.length-halfItem; i++){
                j = i;
                while ((j >= 0) && (args[j] > args[j + halfItem])){
                    h = args[j];
                    args[j] = args[j + halfItem];
                    args[j + halfItem] = h;
                    j--;
                }
            }
            halfItem = halfItem / 2;
        }
        return args;
    }
}
