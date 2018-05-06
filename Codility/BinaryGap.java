/*
    BinaryGap
    : Find longest sequence of zeros in binary representation of an integer.

    - Difficulty Level: PAINLESS

    - Task Score: 100%
    - Correctness: 100%
 */

import java.util.*;

class Solution {
    public int solution(int N) {
        ArrayList<Integer> binaryList = makeBinaryList(N);
        int maxGap = getMaximumGap(binaryList);

        return maxGap;
    }

    private static ArrayList<Integer> makeBinaryList(int N) {
        ArrayList<Integer> binaryList = new ArrayList<>();
        int currentN = N;

        while (currentN > 0) {
            binaryList.add(currentN % 2);
            currentN /= 2;
        }

        return binaryList;
    }

    private static int getMaximumGap(ArrayList<Integer> list) {
        int maxGap = 0;
        int tempGap = 0;

        for (int i = list.size() - 2; i >= 0; i--) {
            Integer binary = list.get(i);

            if (binary == 1) {
                maxGap = (tempGap > maxGap) ? tempGap : maxGap;
                tempGap = 0;
            } else {
                tempGap += 1;
            }
        }

        return maxGap;
    }
}