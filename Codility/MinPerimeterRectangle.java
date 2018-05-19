/*
    MaxDoubleSliceSum
    - Find the minimal perimeter of any rectangle whose area equals N.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(sqrt(N)))
*/

class Solution {
    public int solution(int N) {
        double sqrt = Math.sqrt(N);
        int minHalfPeri = 0;
        int i = 1;
        
        while (i <= sqrt) {
            if (N % i == 0) {
                minHalfPeri = i + (N / i);
            }
            i++;
        }
        
        return (minHalfPeri * 2);
    }
}