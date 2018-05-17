/*
    PermMissingElem
    - Find the missing element in a given permutation.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N) or O(N*log(N)))
*/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        int length = A.length;
        
        if (length == 0) return 1;
        if (length == 1) {
            return (A[0] == 1) ? 2 : 1; 
        }
        
        Arrays.sort(A);
        if (A[0] != 1) return 1;
        if (A[length - 1] != (length + 1)) return (length + 1);
        
        int missed = 0;
        for (int i = 1; i < length; i++) {
            if (A[i - 1] + 1 != A[i]) {
                missed = A[i - 1] + 1;
            }
        }
        
        return missed;
    }
}
