/*
    Distinct
    - Compute number of distinct values in an array.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N*log(N)) or O(N))
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int length = A.length;
        if (length <= 1) return length;
        
        Arrays.sort(A);
        
        int count = 1;
        int previous = A[0];
        for (int i = 1; i < length; i++) {
            if (previous != A[i]) {
                count++;
                previous = A[i];
            }
        }
        
        return count;
    }
}