/*
    MaxProfit
    - Given a log of stock prices compute the maximum possible earning.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N))
*/

class Solution {
    public int solution(int[] A) {
        if (A.length <= 1) return 0;
        
        int maxProfit = 0;
        int tempProfit = 0;
        int minPrice = A[0];
        
        for (int i = 1; i < A.length; i++) {
            tempProfit = Math.max(0, A[i] - minPrice);
            minPrice = Math.min(A[i], minPrice);
            maxProfit = Math.max(tempProfit, maxProfit);
        }
        
        return maxProfit;
    }
}