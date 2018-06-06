/*
    MaxCounters
    - Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100%, O(N + M)
*/

class Solution {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int currentMax = 0;
        int allSet = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                allSet = currentMax;
            } else {
                if (counters[A[i] - 1] < allSet) {
                    counters[A[i] - 1] = allSet;
                }
                
                int counter = ++counters[A[i] - 1];
                currentMax = (counter > currentMax) ? counter : currentMax;
            }
        }
        
        for (int i = 0; i < N; i++) {
            if (counters[i] < allSet) {
                counters[i] = allSet;
            }
        }
        
        return counters;
    }
}