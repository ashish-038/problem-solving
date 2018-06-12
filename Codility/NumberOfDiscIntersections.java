/*
    NumberOfDiscIntersections
    - Compute the number of intersections in a sequence of discs.
    - Difficulty Level: RESPECTABLE

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100%, O(N*log(N)) or O(N)

    Memo
    - 어렵다. 다시 풀어볼 것
    - Count 하는 부분에서 tempCount로 누적하는 방식
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        if (N <= 1) return 0;
        
        // Prepare sorted left ends and right ends
        long[] lefts = new long[N];
        long[] rights = new long[N];
        
        for (int i = 0; i < N; i++) {
            lefts[i] = (long)i - (long)A[i];
            rights[i] = (long)i + (long)A[i];
        }
        
        Arrays.sort(lefts);
        Arrays.sort(rights);
        
        // Count
        int count = 0;
        int tempCount = 0;
        int lIndex = 0;
        int rIndex = 0;
        
        for (int i = 0; i < N; i++) {
            while (lIndex < N && lefts[lIndex] <= rights[rIndex]) {
                tempCount++;
                lIndex++;
            }

            tempCount--;
            count += tempCount;
            rIndex++;
            
            if (count > 10000000) return -1;
        }
        
        return count;
    }
}