/*
    Triangle
    - Determine whether a triangle can be built from a given set of edges.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N*log(N))
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int length = A.length;
        if (length < 3) return 0;
        
        Arrays.sort(A);
        
        for (int i = 0; i < length - 2; i++) {
            if (A[i] <= 0) continue;
            if (A[i] > (A[i + 2] - A[i + 1])) return 1; // had to substract due to the range of int.
        }
        
        return 0;
    }
}