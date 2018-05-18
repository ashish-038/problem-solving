/*
    CountDiv
    - Compute number of integers divisible by k in range [a..b].
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(1))
*/

class Solution {
    public int solution(int A, int B, int K) {
        if (B < K) {
            return (A == 0) ? 1 : 0;
        }
        
        int firstRemainder = A % K;
        int firstPossibleDivisible = A + (K - firstRemainder) % K;
        return (firstPossibleDivisible > B) ? 0 : ((B - firstPossibleDivisible) / K + 1);
    }
}