/*
    MaxNonoverlappingSegments
    - Find a maximal set of non-overlapping segments.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100%, O(N)
*/

class Solution {
    public int solution(int[] A, int[] B) {
        int length = A.length;
        if (length <= 1) return length;
        
        int count = 1;
        int currentEnd = B[0];
        
        for (int i = 1; i < length; i++) {
            if (currentEnd < A[i]) {
                count++;
                currentEnd = B[i];
            }
        }
        
        return count;
    }
}