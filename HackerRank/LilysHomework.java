package io.plutoi;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LilysHomework {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int result = lilysHomework(arr);
        System.out.println(result);

        in.close();
    }

    public static int lilysHomework(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int swapCount = 0;

        int[] finalArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(finalArray);

        for (int i = 0; i < arr.length; i++) {
            int integer = finalArray[i];
            if (arr[i] == integer) continue;

            int index = getIndex(arr, i, integer);
            System.out.println(index);
            swap(arr, i, index);
            swapCount++;
        }

        System.out.println(Arrays.toString(arr));
        return swapCount;
    }

    public static void swap(int[] array, int index1, int index2) {
        final int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static int getIndex(int[] array, int startIndex, int target) {
        int[] subArray = Arrays.copyOfRange(array, startIndex, array.length);

        for (int i = 0; i < subArray.length; i++) {
            if (subArray[i] == target)
                return (i + startIndex);
        }

        return -1;
    }

}