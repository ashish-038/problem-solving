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
        ArrayList<Integer> negatives = new ArrayList<>();
        ArrayList<Integer> positives = new ArrayList<>();
        
        int currentNumber = A[0];
        if (currentNumber <= 0) {
            negatives.add(-currentNumber);
        } else {
            positives.add(currentNumber);
        }
        
        for (int i = 1; i < length; i++) {
            int number = A[i];
            if (number == currentNumber) continue;
            
            if (number <= 0) {
                negatives.add(0, -number);
            } else {
                positives.add(number);
            }
            currentNumber = number;
        }
        
        // count by comparing two lists
        if (negatives.size() == 0) {
            return positives.size();
        } else if (positives.size() == 0) {
            return negatives.size();
        }
        
        int count = negatives.size() + positives.size();
        
        ArrayList<Integer> shorterList;
        ArrayList<Integer> longerList;
        
        if (negatives.size() < positives.size()) {
            shorterList = negatives;
            longerList = positives;
        } else {
            shorterList = positives;
            longerList = negatives;
        }
        
        int longerIndex = 0;
        for (int i = 0; i < shorterList.size(); i++) {
            int shorterNumber = shorterList.get(i);
            while (shorterNumber > longerList.get(longerIndex) && longerIndex < longerList.size() - 1) {
                longerIndex++;
            }
            if (longerIndex == longerList.size()) break;
            
            if (shorterNumber == longerList.get(longerIndex)) {
                count--;
            }
        }
        
        return count;
    }
}