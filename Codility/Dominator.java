/*
    Dominator
    - Find an index of an array such that its value occurs at more than half of indices in the array.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N*log(N)) or O(N))
*/

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        int length = A.length;
        if (length == 0) return -1;
        if (length == 1) return 0;
        
        int candidate = 0;
        int count = 0;
        for (int value: A) {
            if (count == 0) {
                candidate = value;
                count++;
            } else {
                if (value == candidate) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        
        if (count <= 0) return -1;
        
        count = 0;
        int index = -1;
        int halfLength = length / 2;
        for (int i = 0; i < length; i++) {
            if (A[i] == candidate) {
                count++;
                if (count > halfLength) {
                    index = i;
                    break;
                }
            }
        }
        
        return index;
    }
}