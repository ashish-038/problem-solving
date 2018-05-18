/*
    MaxProductOfThree
    - Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N * log(N)))
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int length = A.length;
        if (length == 3) {
            return A[0] * A[1] * A[2];
        }
        
        Arrays.sort(A);
        
        int positiveCount = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (positiveCount >= 3 || A[i] < 0) {
                break;
            } else {
                positiveCount++;
            }
        }
        
        switch (positiveCount) {
            case 0:
                return A[length- 3] * A[length- 2] * A[length- 1];
            case 1:
                return A[0] * A[1] * A[length- 1];
            case 2:
                return A[0] * A[1] * A[length- 1];    
            default:
                int threePositives = A[length- 3] * A[length- 2] * A[length- 1];
                int twoNegatives = A[0] * A[1] * A[length - 1];
                
                return (threePositives > twoNegatives) ? threePositives : twoNegatives;
        }
    }
}