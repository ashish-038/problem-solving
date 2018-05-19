/*
    MaxSliceSum
    - Find a maximum sum of a compact subsequence of array elements.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N))
*/

class Solution {
    public int solution(int[] A) {
        if (A.length == 1) return A[0];
        
        int maxSlice = A[0];
        int maxEnding = A[0];
        
        for (int i = 1; i < A.length; i++) {
            maxEnding = Math.max(A[i], maxEnding + A[i]);
            maxSlice = Math.max(maxSlice, maxEnding);
        }
        
        return maxSlice;
    }
}