/*
    StoneWall
    - Cover "Manhattan skyline" using the minimum number of rectangles.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N))
*/

import java.util.Stack;

class Solution {
    public int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        int blocks = 0;
        
        for (int i: H) {
            while (!stack.isEmpty() && stack.peek() > i) {
                stack.pop();
            }
            
            if (!stack.isEmpty() && stack.peek() == i) {
                continue;
            } else {
                blocks++;
                stack.push(i);
            }
        }
        
        return blocks;
    }
}