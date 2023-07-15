package aula02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {
    public static int[] sortAscendingOrder(int[] arrayNumbers) {
        int[] tempArray = arrayNumbers.clone();

        for (int i = 0; i < tempArray.length; i++) {
            for (int j = i + 1; j < tempArray.length; j++) {
                if (tempArray[j] < tempArray[i]) {
                    int tempInt = tempArray[i];

                    tempArray[i] = tempArray[j];
                    tempArray[j] = tempInt;
                }
            }
        }

        return tempArray;
    }

    public static int[] sortDescendingOrder(int[] arrayNumbers) {
        int[] tempArray = arrayNumbers.clone();

        for (int i = 0; i < tempArray.length; i++) {
            for (int j = i + 1; j < tempArray.length; j++) {
                if (tempArray[j] > tempArray[i]) {
                    int tempInt = tempArray[i];

                    tempArray[i] = tempArray[j];
                    tempArray[j] = tempInt;
                }
            }
        }

        return tempArray;
    }

    public static Integer[] pickUpOnlyMeanNumbers(int[] arrayNumbers) {
        int[] tempArray = arrayNumbers.clone();
        List<Integer> meanNumbers = new ArrayList<Integer>();

        for (int j : tempArray) {
            if (j % 2 == 0) {
                meanNumbers.add(j);
            }
        }

        return meanNumbers.toArray(new Integer[0]);
    }

    public static Integer[] pickUpOnlyOddNumbers(int[] arrayNumbers) {
        int[] tempArray = arrayNumbers.clone();
        List<Integer> meanNumbers = new ArrayList<Integer>();

        for (int j : tempArray) {
            if (j % 2 != 0) {
                meanNumbers.add(j);
            }
        }

        return meanNumbers.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        int[] numbers = {5, 4, 1, 2, 3};
        int[] ascendingOrder = sortAscendingOrder(numbers);
        int[] descendingOrder = sortDescendingOrder(numbers);
        Integer[] meanNumbers = pickUpOnlyMeanNumbers(sortAscendingOrder(numbers));
        Integer[] oddNumbers = pickUpOnlyOddNumbers(sortAscendingOrder(numbers));

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(ascendingOrder));
        System.out.println(Arrays.toString(descendingOrder));
        System.out.println(Arrays.toString(meanNumbers));
        System.out.println(Arrays.toString(oddNumbers));
    }
}
