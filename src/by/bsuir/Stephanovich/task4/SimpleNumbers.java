package by.bsuir.Stephanovich.task4;

import java.util.ArrayList;

public class SimpleNumbers {
    public SimpleNumbers(int N){
        this.size = N;
        arr = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = (int)(Math.random() * 100);
        }
    }

    private boolean isSimple(int index){
        int elem = arr[index];
        int ceil = (int)Math.round(Math.sqrt(elem));

        if (elem % 2 == 0){
            return false;
        }

        for (int delimeter = 3; delimeter <= ceil; delimeter+=2){
            if (elem % delimeter == 0){
                return false;
            }
        }

        return true;
    }

    public ArrayList<Integer> findIndexesOfSimpleNumbers(){
        ArrayList<Integer> resultArr;
        resultArr = new ArrayList<>();
        for (int i = 0; i < size; i++){
            if (isSimple(i)){
                resultArr.add(arr[i]);
            }
        }
        return resultArr;
    }

    private int [] arr;
    private int size;
}
