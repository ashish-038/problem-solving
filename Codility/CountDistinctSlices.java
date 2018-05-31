/*
    CountDistinctSlices
    - Count the number of distinct slices (containing only unique numbers).
    - Difficulty Level: PAINLESS
    
    특징
    - Caterpillar method
    - 어려웠다. 다시 풀어볼 것.

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100%, O(N)
 */

class Solution {
    static final int MAX = 1000000000;
    
    public int solution(int M, int[] A) {
        int length = A.length;
        if (length == 1) return 1;
        
        boolean[] isUsed = new boolean[M + 1];
        int rear = 0;
        int count = 0;
        
        for (int front = 0; front < length; front++) {
            while (isUsed[A[front]]) {
                isUsed[A[rear]] = false;
                rear++;
            }
            
            isUsed[A[front]] = true;
            count += front - rear + 1;
            if (count >= MAX) return MAX;
        }
        
        return count;
    }
}