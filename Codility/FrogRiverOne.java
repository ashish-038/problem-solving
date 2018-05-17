/*
    FrogRiverOne
    - Find the earliest time when a frog can jump to the other side of a river.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N))
*/

class Solution {
    public int solution(int X, int[] A) {
        boolean isCovered[] = new boolean[X];
        int count = 0;
        int earliestSecond = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (isCovered[(A[i] - 1)] == false) {
                isCovered[(A[i] - 1)] = true;
                count++;
            }
            
            if (count == X) {
                earliestSecond = i;
                break;
            }
            
            if (i == A.length - 1) {
                return -1;
            }
        }
        
        return earliestSecond;
    }
}