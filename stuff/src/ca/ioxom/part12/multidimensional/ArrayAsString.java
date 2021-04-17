package ca.ioxom.part12.multidimensional;

public class ArrayAsString {
    public static String arrayAsString(int[][] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            int[] nestedArray = array[i];
            for (int k : nestedArray) {
                builder.append(k);
            }

            if (i != array.length - 1) {
                builder.append("\n");
            }
        }

        return builder.toString();
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 2, 7, 6},
                {2, 4, 1, 0},
                {3, 2, 1, 0}
        };

        System.out.println(arrayAsString(matrix));
    }
}
