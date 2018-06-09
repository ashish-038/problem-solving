/*
    MinAvgTwoSlice
    - Find the minimal average of any slice containing at least two elements.
    - Difficulty Level: RESPECTABLE

    Results
    - Task Score: 100%
    - Correctness: 100%
    - Performance: 100%, O(N)

    Memo
    - 이 풀이를 이해하려면 우선 수학적인 이해가 필요했다: https://codesays.com/2014/solution-to-min-avg-two-slice-by-codility/
    - 공간 복잡도: 최악의 경우 O(N)라고 안내되어 있는데 이 풀이는 해당하지 않는다.
*/

class Solution {
    public int solution(int[] A) {
        int N = A.length;
        if (N <= 2) return 0;
        
        double minAverage = (double)(A[0] + A[1]) / 2;
        int startIndex = 0;
        
        for (int i = 0; i < N - 1; i++) {
            if (i + 1 < N) {
                double tempAverage = (double)(A[i] + A[i + 1]) / 2;
                if (tempAverage < minAverage) {
                    minAverage = tempAverage;
                    startIndex = i;
                }
            }
            
            if (i + 2 < N) {
                double tempAverage = (double)(A[i] + A[i + 1] + A[i + 2]) / 3;
                if (tempAverage < minAverage) {
                    minAverage = tempAverage;
                    startIndex = i;
                }
            }
        }
        
        return startIndex;
    }
}