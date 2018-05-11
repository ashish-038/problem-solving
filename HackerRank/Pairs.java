import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int pairs(int k, int[] arr) {
        Arrays.sort(arr);

        int i = 0;
        int j = 1;
        int count = 0;

        while(j <= arr.length - 1) {
            int diff = arr[j] - arr[i];

            if(diff == k) {
                count++;
                j++;
            } else if(diff > k) {
                i++;
            } else {
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = pairs(k, arr);
        System.out.println(result);
        in.close();
    }
}