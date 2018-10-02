package by.bsuir.Stephanovich.task7;

public class ShellSort {

   /* public static int[] shellSort2(int ... args){
        int i = 0;
        if ()
    }*/

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
