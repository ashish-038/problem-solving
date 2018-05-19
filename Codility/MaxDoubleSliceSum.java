/*
    MaxDoubleSliceSum
    - Find the maximal sum of any double slice.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N))
*/

class Solution {
    public int solution(int[] A) {
        int length = A.length;
        if (length == 3) return 0;
        
        int[] sumFromLeft = new int[length];
        int[] sumFromRight = new int[length];
        
        for (int i = 1; i < length - 1; i++) {
            sumFromLeft[i] = Math.max(sumFromLeft[i - 1] + A[i], 0);
        }
        
        for (int i = length - 2; i > 0; i--) {
            sumFromRight[i] = Math.max(sumFromRight[i + 1] + A[i], 0);
        }
        
        int maxSum = 0;
        for (int i = 1; i < length - 1; i++) {
            maxSum = Math.max(maxSum, sumFromLeft[i - 1] + sumFromRight[i + 1]);
        }
        
        return maxSum;
    }
}