/*
    PermCheck
    - Check whether array A is a permutation.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N) or O(N * log(N)))
*/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] - 1 != i) return 0;
        }
        
        return 1;
    }
}