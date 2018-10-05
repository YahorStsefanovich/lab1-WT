package by.bsuir.Stephanovich.task5;

public class Sequence {
    public static int getMaxSequenceLength(int[] array){
        int[] maxSequences = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            maxSequences[i] = 1;
            for (int j = 0; j < i; j++)
                if (array[j] < array[i])
                    maxSequences[i] = (maxSequences[i] > 1 + maxSequences[j]) ? maxSequences[i] : 1 + maxSequences[j];
        }

        int maxLength = maxSequences[0];
        for (int i = 1; i < array.length; i++)
            maxLength = (maxLength > maxSequences[i]) ? maxLength : maxSequences[i];

        return array.length - maxLength;
    }

    public static void main(String ... args){
        int[] array = {2, 5, 7, 4, 3, 8, 1 ,9};
        int[] maxSequences = new int[array.length];

        int maxLength = Sequence.getMaxSequenceLength(array);

        System.out.print(array.length - maxLength);
    }
}
