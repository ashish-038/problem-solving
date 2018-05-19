/*
    Nesting
    - Determine whether a given string of parentheses (single type) is properly nested.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N))
*/

class Solution {
    public int solution(String S) {
        int openedCount = 0;
        
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                openedCount++;
            } else {
                openedCount--;
                if (openedCount < 0) return 0;
            }
        }
        
        return (openedCount == 0) ? 1 : 0;
    }
}