package ca.ioxom.part12.multidimensional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicSquare {
    private final int[][] square;

    public MagicSquare(int[][] square) {
        this.square = square;
    }

    public List<Integer> sumsOfRows() {
        List<Integer> sums = new ArrayList<>();

        for (int[] ints : square) {
            sums.add(Arrays.stream(ints)
                    .reduce(0, Integer::sum)
            );
        }

        return sums;
    }

    public List<Integer> sumsOfColumns() {
        List<Integer> sums = new ArrayList<>();

        for (int[] array : square) {
            for (int j = 0; j < array.length; j++) {
                int currentSum;
                if (sums.size() > j) {
                    currentSum = sums.get(j);
                } else {
                    currentSum = 0;
                }

                updateIndex(sums, j, array[j] + currentSum);
            }
        }

        return sums;
    }

    public List<Integer> sumsOfDiagonals() {
        List<Integer> sums = new ArrayList<>();

        //don't ask me why I felt the need to use three lines just to avoid copying one line once
        for (int i = 0; i < 2; i ++) {
            sums.add(0);
        }

        //funky mess, don't ask me how this works
        int j = square.length - 1;
        for (int i = 0; i < square.length; i++) {
            updateIndex(sums, 0, square[i][i] + sums.get(0));
            updateIndex(sums, 1, square[i][j] + sums.get(1));
            j--;
        }

        return sums;
    }

    public static void updateIndex(List<Integer> list, int index, int newValue) {
        if (list.size() > index) {
            list.remove(index);
        }

        list.add(index, newValue);
    }

    public static MagicSquare createMagicSquare() {

        //guide:

        //primary index: vertical
        //removing from primary index: up
        //adding to primary index: down

        //secondary index: horizontal
        //removing from secondary index: left
        //adding to secondary index: right

        int[][] square = new int[3][3];

        int primaryIndex = 0;
        int secondaryIndex = 1;

        int oldPrimaryIndex = primaryIndex;
        int oldSecondaryIndex = secondaryIndex;

        for (int i = 1; i < 9 + 1; i++) {

            if (square[primaryIndex][secondaryIndex] != 0) {
                //revert changes
                primaryIndex = oldPrimaryIndex;
                secondaryIndex = oldSecondaryIndex;

                //move down
                primaryIndex++;

            }

            //set square position
            square[primaryIndex][secondaryIndex] = i;

            //save old indexes
            oldPrimaryIndex = primaryIndex;
            oldSecondaryIndex = secondaryIndex;

            //move diagonally, ensuring we don't go over our limits
            primaryIndex--;
            if (primaryIndex < 0) {
                primaryIndex = square.length - 1;
            }

            secondaryIndex ++;
            if (secondaryIndex > square.length - 1) {
                secondaryIndex = 0;
            }

            //expected final result
            //[8, 1, 6]
            //[3, 5, 7]
            //[4, 9, 2]
        }

        return new MagicSquare(square);
    }

    public static void printSquare(MagicSquare square) {
        System.out.println(Arrays.toString(square.square[0]));
        System.out.println(Arrays.toString(square.square[1]));
        System.out.println(Arrays.toString(square.square[2]));
    }

    public static void main(String[] args) {
        final MagicSquare square = new MagicSquare(new int[][]{
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        });

        System.out.println(square.sumsOfRows());
        System.out.println(square.sumsOfColumns());
        System.out.println(square.sumsOfDiagonals());

        final MagicSquare square2 = new MagicSquare(new int[][]{
                {65, 2, 3},
                {1, 435, 3},
                {1, 2, 456}
        });

        System.out.println(square2.sumsOfDiagonals());
        printSquare(createMagicSquare());
    }
}
