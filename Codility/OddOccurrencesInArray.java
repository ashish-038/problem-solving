/*
    CyclicRotation
    : Find value that occurs in odd number of elements.

    - Difficulty Level: PAINLESS

    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N) or O(N*log(N)))
 */

import java.util.*;

class Solution {
    public int solution(int[] A) {
        int[] array = A;
        Arrays.sort(array);

        int candidate = array[0];

        for (int i = 1; i < array.length; i++) {
            if (candidate == -1) {
                candidate = array[i];
            } else if (array[i] == candidate) {
                candidate = -1;
            } else {
                break;
            }
        }

        return candidate;
    }
}