package com.tsguild.foundations.basics.arrays;

public class SimpleSort {
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 55, 67, 88, 99};
        int[] secondHalf = {1, 4, 8, 11, 15, 18, 21, 44, 54, 79, 89, 100};

        int[] wholeNumbers = new int[24];

        // Sorting code should go here!
        int i = 0, j = 0, k = 0;
        while ((i < firstHalf.length) && (j < secondHalf.length)) {
            if (firstHalf[i] < secondHalf[j]) {
                wholeNumbers[k] = firstHalf[i];
                i++;
            } else {
                wholeNumbers[k] = secondHalf[j];
                j++;
            }
            k++;

        }while (i < firstHalf.length){
            wholeNumbers[k] = firstHalf[i];
            i++;
            k++;
        }while (j< secondHalf.length){
            wholeNumbers[k] = secondHalf[j];
            j++;
            k++;
        }
        System.out.println("Here ya go - all nice and ordered: " );

        for (int l = 0; l < wholeNumbers.length; l++) {
            System.out.print(wholeNumbers[l] + " ");


        }


    }

}
