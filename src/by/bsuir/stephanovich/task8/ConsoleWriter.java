package by.bsuir.stephanovich.task8;

import static by.bsuir.stephanovich.task8.TwoSequence.joinSequences;

public class ConsoleWriter {
    public static void main(String ... args){
        int [] A = {1,1,3,5,5,7};
        int [] B = {2,3,4,6,6,7};
        System.out.println(joinSequences(A, B));
    }
}
