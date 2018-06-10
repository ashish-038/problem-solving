/*
    NumberOfDiscIntersections
    - Compute the number of intersections in a sequence of discs.
    - Difficulty Level: RESPECTABLE

    Results
    - Task Score: 56%
    - Correctness: 87%
    - Performance: 25%, O(N)
*/

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        if (N <= 1) return 0;
        
        int count = 0;
        
        for (int i = 0; i < N - 1; i++) {
            int iRight = i + A[i];
            
            for (int j = i + 1; j < N; j++) {
                int jLeft = j - A[j];
                
                if (jLeft <= iRight) {
                    count++;
                    if (count > 10000000) return -1;
                }
            }
        }
        
        return count;
    }
}