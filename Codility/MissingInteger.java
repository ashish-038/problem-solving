/*
    MissingInteger
    - Find the smallest positive integer that does not occur in a given sequence.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100% (O(N) or O(N * log(N)))
*/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i: A) {
            set.add(i);
        }
        Integer[] newA = set.toArray(new Integer[set.size()]);
        Arrays.sort(newA);
        
        int firstPositiveIndex = -1;
        for (int i = 0; i < newA.length; i++) {
            if (newA[i] > 0) {
                firstPositiveIndex = i;
                break;
            }
        }
        
        if (firstPositiveIndex == -1) return 1;
        
        int smallest= 0;
        for (int i = firstPositiveIndex; i < newA.length; i++) {
            if (i == firstPositiveIndex && newA[i] > 1) {
                smallest = 1;
                break;
            }
            
            if (i == newA.length - 1 || newA[i] + 1 != newA[i + 1]) {
                smallest = newA[i] + 1;
                break;
            }
        }
        
        return smallest;
    }
}