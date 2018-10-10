package by.bsuir.stephanovich.task4;

import java.util.ArrayList;

public class SimpleNumbers {
    public SimpleNumbers(int N){
        this.size = N;
        arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = (int)(Math.random() * 100);
        }
    }

    public SimpleNumbers(int [] arr){
        this.size = arr.length;
        this.arr = new int[size];
        this.arr = arr;
    }

    private boolean isSimple(int index){
        int elem = arr[index];
        int ceil = (int)Math.round(Math.sqrt(elem));

        if (elem < 2)
            return false;

        if (elem % 2 == 0){
            return elem == 2;
        }

        for (int delimeter = 3; delimeter <= ceil; delimeter+=2){
            if (elem % delimeter == 0){
                return elem == delimeter;
            }
        }

        return true;
    }

    //return indexes of simple numbers in arr
    public ArrayList<Integer> findIndexesOfSimpleNumbers(){
        ArrayList<Integer> resultArr;
        resultArr = new ArrayList<>();
        for (int i = 0; i < size; i++){
            if (isSimple(i)){
                resultArr.add(i);
            }
        }
        return resultArr;
    }

    private int [] arr;
    private int size;
}
