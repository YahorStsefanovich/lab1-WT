package by.bsuir.Stephanovich.task8;

import java.util.ArrayList;

public class TwoSequence {

    public static ArrayList joinSequences(int [] A, int [] B){
        ArrayList<Integer> indexes = new ArrayList<>();
        int j = 0;
        for (int i = 0; i < B.length; i++){
            while (j < A.length){
                if (A[j] <= B[i]){
                    j++;
                }
                else break;
            }
            indexes.add(i+j);
        }
        return indexes;
    }

    public static void main(String ... args){
        int [] A = {1,1,3,5,5,7};
        int [] B = {2,3,4,6,6,7};
        System.out.println(joinSequences(A, B));
    }
}
