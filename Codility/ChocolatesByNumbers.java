/*
    ChocolatesByNumbers
    - There are N chocolates in a circle. Count the number of chocolates you will eat.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(log(N + M)))
*/

class Solution {
    public int solution(int N, int M) {
        if (N == 1) return 1;
        
        int m = M % N;
        if (m == 0) return 1;
        if (m == 1) return N;
        
        return (N / gcd(N, m));
    }
    
    public int gcd(int a, int b) {
        while (a % b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        
        return b;
    }
}