/*
    Fish
    - N voracious fish are moving along a river. Calculate how many fish are alive.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N))
*/

import java.util.Stack;

class Solution {
    public int solution(int[] A, int[] B) {
        int length = A.length;
        if (length == 1) return 1;
        
        int fishCount = length;
        Stack<Integer> downStreamers = new Stack<>();
        
        for (int i = 0; i < length; i++) {
            if (B[i] == 0) {
                if (downStreamers.isEmpty()) continue;
                
                if (downStreamers.peek() > A[i]) {
                    fishCount--;
                } else {
                    while (!downStreamers.isEmpty() && downStreamers.peek() < A[i]) {
                        fishCount--;
                        downStreamers.pop();
                    }
                    if (!downStreamers.isEmpty()) fishCount--;
                }
            } else {
                downStreamers.push(A[i]);
            }
        }
        
        return fishCount;
    }
}