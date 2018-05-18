/*
    PassingCars
    - Count the number of passing cars on the road.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N))
*/

class Solution {
    public int solution(int[] A) {
        int pairCount = 0;
        int zeroCount = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                zeroCount++;
            } else {
                pairCount += zeroCount;
                
                if (pairCount > 1000000000) return -1;
            }
        }
        
        return pairCount;
    }
}