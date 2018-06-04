/*
    TieRopes
    - Tie adjacent ropes to achieve the maximum number of ropes of length >= K.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100%, O(N)
*/

class Solution {
    public int solution(int K, int[] A) {
        int length = A.length;
        if (K == 1) return length;
        
        int count = 0;
        int tempSum = 0;
        
        for (int i = 0; i < length; i++) {
            if (A[i] >= K) {
                count++;
                tempSum = 0;
                continue;
            }
            
            tempSum += A[i];
            if (tempSum >= K) {
                count++;
                tempSum = 0;
            }
        }
        
        return count;
    }
}