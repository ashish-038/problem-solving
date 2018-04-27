package io.plutoi;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheFullCountingSort {

    public static void main(String[] args) {
        // input and setup original
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Pair[] originalPairs = new Pair[n];
        int maxNumber = 0;

        for (int a0 = 0; a0 < n; a0++) {
            int x = in.nextInt();
            String s = in.next();
            s = (a0 <= ((n / 2) - 1)) ?  "-" : s;

            originalPairs[a0] = new Pair(x, s);
            if(x > maxNumber) maxNumber = x;
        }

        in.close();

        // setup counter
        int[] counter = new int[maxNumber + 1];

        for (int i = 0; i < n; i++ ) {
            int integer = originalPairs[i].integer;
            counter[integer]++;
        }

        for (int i = 1; i < counter.length; i++) {
            counter[i] += counter[i - 1];
        }

        // sort
        String[] sortedPairs = new String[n];

        for (int i = originalPairs.length - 1; i >= 0; i--) {
            int integer = originalPairs[i].integer;
            int targetIndex = counter[integer] - 1;
            sortedPairs[targetIndex] = originalPairs[i].string;
            counter[integer]--;
        }

        // output
        System.out.println(String.join(" ", sortedPairs));
    }

    public static class Pair {
        public final int integer;
        public final String string;

        public Pair(int integer, String string) {
            this.integer = integer;
            this.string = string;
        }
    }

}
