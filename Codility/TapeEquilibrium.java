/*
    TapeEquilibrium
    - Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N))
*/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        int length = A.length;
        if (length == 2) return Math.abs(A[0] - A[1]);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += A[i];
            map.put(i, sum);
        }
        
        int minDiff = Math.abs(map.get(0) * 2 - sum);
        for (int i = 1; i < length - 1; i++) {
            int possibleDiff = Math.abs(map.get(i) * 2 - sum);
            if (possibleDiff < minDiff) minDiff = possibleDiff;
        }
        
        return minDiff;
    }
}