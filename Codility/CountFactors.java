/*
    CountFactors
    - Count factors of given number n.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(sqrt(N)))
*/

class Solution {
    public int solution(int N) {
        int count = 0;
        double sqrt = Math.sqrt(N);
        int i = 1;
        
        while (i < sqrt) {
            if (N % i == 0) {
                count += 2;
            }
            i++;
        }
        
        return (sqrt == (int)sqrt) ? (count + 1) : count;
    }
}