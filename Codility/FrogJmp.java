/*
    FrogJmp
    - Count minimal number of jumps from position X to Y.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(1))
*/

class Solution {
    public int solution(int X, int Y, int D) {
        int count = (Y - X) / D;
        return ((Y - X) % D == 0) ? count : (count + 1);
    }
}