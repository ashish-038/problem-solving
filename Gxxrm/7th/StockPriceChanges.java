/*
    전략적인 투자
    - max slice 문제인데, maxEnding을 업데이트하는 방식이 조금 특이

    결과
    - 테스트 케이스: 9/10개
    - 뭘까?
*/

import java.util.*;
import java.io.*;

class Main {

  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] priceChanges = new int[n];
		for (int i = 0; i < n; i++) {
			priceChanges[i] = scanner.nextInt();
		}
		
		if (n == 1) {
			System.out.println(priceChanges[0]);
			return;
		}
		
		int maxEnding = priceChanges[0];
		int maxSlice = maxEnding;
		
		for (int i = 0; i < n; i++) {
			maxEnding = Math.max(maxEnding + priceChanges[i], priceChanges[i]);
			maxSlice = Math.max(maxEnding, maxSlice);	
		}
		
		System.out.println(maxSlice);
  }
	
}