package by.bsuir.stephanovich.task5;

public class ConsoleWriter {
    public static void main(String ... args){
        int[] array = {2, 5, 7, 4, 3, 8, 1 ,9};
        int[] maxSequences = new int[array.length];

        int maxLength = Sequence.getMaxSequenceLength(array);

        System.out.print(array.length - maxLength);
    }
}
