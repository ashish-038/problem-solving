/*
    CountTriangles
    - Count the number of triangles that can be built from a given set of edges.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N**2))
 */

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int length = A.length;
        if (length < 3) return 0;
        
        Arrays.sort(A);
        
        int count = 0;
        for (int i = 0; i < length - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < length - 1; j++) {
                while (k < length && A[i] > A[k] - A[j]) {
                    k++;
                }
                
                count += k - j - 1;
            }
        }
        
        return count;
    }
}