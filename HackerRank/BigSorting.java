// HackerRank > Algorithms > Sorting
//
// BigSorting
// (https://www.hackerrank.com/challenges/big-sorting/problem)
//
// Result
// - Test Case #6 timeout

package io.plutoi;

public class BigSorting {

    public static void main(String[] args) {
        String[] unsorted = {"31415926535897932384626433832795", "1", "3", "10", "3", "5"};
        String[] sorted = sort(unsorted);

        StringBuilder output = new StringBuilder();
        for (String string : sorted) {
            output.append(string + "\n");
        }
        System.out.println(output);
    }

    private static String[] sort(String[] array) {
        quickSort(array, 0, array.length - 1);

        return array;
    }

    private static void quickSort(String[] array, int left, int right) {
        int index = partition(array, left, right);

        if (left < index - 1) {
            quickSort(array, left, index - 1);
        }

        if (index < right) {
            quickSort(array, index, right);
        }
    }

    private static int partition(String[] array, int left, int right) {
        String pivot = array[(left + right) / 2];

        while (left <= right) {
            while (compare(array[left], pivot) == -1) left++;
            while (compare(array[right], pivot) == 1) right--;

            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    private static int compare(String string1, String string2) {
        if (string1.length() < string2.length()) return -1;
        if (string1.length() > string2.length()) return 1;

        for (int i = 0; i < string1.length(); i++) {
            if ((int)string1.charAt(i) < (int)string2.charAt(i)) return -1;
            if ((int)string1.charAt(i) > (int)string2.charAt(i)) return 1;
        }

        return 0;
    }

    private static void swap(String[] array, int index1, int index2) {
        final String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
