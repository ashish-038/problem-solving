/*
    Brackets
    - Determine whether a given string of parentheses (multiple types) is properly nested.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N))
*/

import java.util.Stack;

class Solution {
    public int solution(String S) {
        if (S.isEmpty()) return 1;
        
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < S.length(); i++) {
            char bracket = S.charAt(i);
            
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) return 0;
                
                switch (bracket) {
                    case ')':
                        if (stack.peek() != '(') {
                            return 0;
                        } else {
                            stack.pop();
                            break;
                        }
                    case '}':
                        if (stack.peek() != '{') {
                            return 0;
                        } else {
                            stack.pop();
                            break;
                        }
                    case ']':
                        if (stack.peek() != '[') {
                            return 0;
                        } else {
                            stack.pop();
                            break;
                        }
                }
            }
        }
        
        return (stack.isEmpty() ? 1 : 0);
    }
}