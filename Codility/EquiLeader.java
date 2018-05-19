/*
    EquiLeader
    - Find the index S such that the leaders of the sequences A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N - 1] are the same.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N))
*/

class Solution {
    public int solution(int[] A) {
        int length = A.length;
        if (length <= 1) return 0;
        
        int candidate = 0;
        int count = 0;
        
        for (int value: A) {
            if (count == 0) {
                candidate = value;
                count++;
            } else {
                if (value == candidate) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        
        if (count <= 0) return 0;
        
        boolean[] isLeader = new boolean[length];
        count = 0;
        
        for (int i = 0; i < length; i++) {
            if (A[i] == candidate) {
                count++;
                isLeader[i] = true;
            }
        }
        
        int formerCount = 0;
        int latterCount = count;
        int equiCount = 0;
        
        for (int i = 0; i < length; i++) {
            if (isLeader[i]) {
                formerCount++;
                latterCount--;
            }
            
            if (((double)formerCount / (i + 1)) > 0.5 && ((double)latterCount / (length - 1 - i)) > 0.5) equiCount ++;
        }
        
        return equiCount;
    }
}