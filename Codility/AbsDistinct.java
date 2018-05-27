/*
    AbsDistinct
    - Compute number of distinct absolute values of sorted array elements.
    - Difficulty Level: PAINLESS

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100%
 */

import java.util.*;

class Solution {
    public int solution(int[] A) {
        // boundary case
        int length = A.length;
        if (length == 1) return 1;
        
        // regular case
        // prepare two lists
        ArrayList<Integer> firstPart = new ArrayList<>();
        ArrayList<Integer> secondPart = new ArrayList<>();
        
        int currentNumber = A[0];
        if (currentNumber <= 0) {
            firstPart.add(-currentNumber);
        } else {
            secondPart.add(currentNumber);
        }
        
        for (int i = 1; i < length; i++) {
            int number = A[i];
            if (number == currentNumber) continue;
            
            if (number <= 0) {
                firstPart.add(0, -number);
            } else {
                secondPart.add(number);
            }
            currentNumber = number;
        }
        
        // count by comparing two lists
        if (firstPart.size() == 0) {
            return secondPart.size();
        } else if (secondPart.size() == 0) {
            return firstPart.size();
        }
        
        int count = firstPart.size() + secondPart.size();
        
        ArrayList<Integer> shortList;
        ArrayList<Integer> longList;
        
        if (firstPart.size() < secondPart.size()) {
            shortList = firstPart;
            longList = secondPart;
        } else {
            shortList = secondPart;
            longList = firstPart;
        }
        
        int longIndex = 0;
        for (int i = 0; i < shortList.size(); i++) {
            int shortNumber = shortList.get(i);
            while (shortNumber > longList.get(longIndex) && longIndex < longList.size() - 1) {
                longIndex++;
            }
            if (longIndex == longList.size()) break;
            
            if (shortNumber == longList.get(longIndex)) {
                count--;
            }
        }
        
        return count;
    }
}