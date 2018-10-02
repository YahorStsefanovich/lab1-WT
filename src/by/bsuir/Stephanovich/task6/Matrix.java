package by.bsuir.Stephanovich.task6;

public class Matrix {
    public Matrix(int ... args){
        length = args.length;
        dimensionalArray = new int[length];
        System.arraycopy(args, 0, dimensionalArray, 0, length);
        twoDimensionalArray = new int[length][length];
    }

    public int[][] getMatrix(){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++){
                twoDimensionalArray[i][j] = dimensionalArray[(j + i) % length];
            }
        }
        return twoDimensionalArray;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                result.append(twoDimensionalArray[i][j]).append("    ");
            }
            result.append("\n");
        }
        return result.toString();
    }

    private int length;
    private int [] dimensionalArray;
    private int [][] twoDimensionalArray;

    public static void main(String[] args){
        Matrix matrix = new Matrix(1,2,3,4);
        matrix.getMatrix();
        System.out.println(matrix.toString());
    }
}
