/*
    GenomicRangeQuery
    - Find the minimal nucleotide from a range of sequence DNA.
    - Difficulty Level: RESPECTABLE

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100%, O(N + M)

    Memo
    - 공간 복잡도: O(N * 4)도 결국 O(N)이다.
    - 시간 복잡도: O(N + M)을 달성하고자 한다면 N만큼의 반복들과 M만큼의 반복들을 떠올리자. N * M만큼의 반복만 아니면 된다.
*/

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        int N = S.length();
        int M = P.length;
        
        // Prepare prefix sums
        // Count occurences
        int[][] prefixCountSums = new int[N + 1][4];
        
        for (int i = 0; i < N; i++) {
            switch (S.charAt(i)) {
                case 'A':
                    prefixCountSums[i + 1][0]++;
                    break;
                case 'C':
                    prefixCountSums[i + 1][1]++;
                    break;
                case 'G':
                    prefixCountSums[i + 1][2]++;
                    break;
                case 'T':
                    prefixCountSums[i + 1][3]++;
                    break;
            }
        }
        
        // Accrue occurences
        for (int i = 1; i < N + 1; i++) {
            for (int j = 0; j < 4; j++) {
                prefixCountSums[i][j] += prefixCountSums[i - 1][j];
            }
        }
        
        // Calculate minimal impact factors of each range
        int[] factors = new int[M];
        
        for (int i = 0; i < M; i++) {
            int start = P[i];
            int end = Q[i] + 1;
            
            for (int j = 0; j < 4; j++) {
                if (prefixCountSums[end][j] - prefixCountSums[start][j] > 0) {
                    factors[i] = j + 1;
                    break;
                }
            }
        }
        
        return factors;
    }
}