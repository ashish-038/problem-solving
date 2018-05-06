/*
    CyclicRotation
    : Rotate an array to the right by a given number of steps.

    - Difficulty Level: PAINLESS

    - Task Score: 100%
    - Correctness: 100%
 */

import java.util.*;

class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length == 0) { return A; }

        int length = A.length;
        int rotations = K % length;

        if (rotations == 0) {
            return A;
        } else {
            int[] rotated = new int[length];

            int[] latter = Arrays.copyOfRange(A, (length - rotations), length);
            int[] former = Arrays.copyOfRange(A, 0, (length - rotations));

            for (int i = 0; i < latter.length; i++) {
                rotated[i] = latter[i];
            }

            for (int i = 0; i < former.length; i++) {
                rotated[i + latter.length] = former[i];
            }

            return rotated;
        }
    }
}