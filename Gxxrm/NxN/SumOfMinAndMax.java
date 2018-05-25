/*
    큰 수와 작은 수의 합
    
    특징
    - Comparator
    - Long

    결과
    - 테스트케이스: 25 / 25 개
    - 점수: 200 / 200 점
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

class Main {

  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine().trim());
		String[] numbers = scanner.nextLine().split(" ");
		
		Arrays.sort(numbers, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == 1) {
					o1 = o1 + o1;
				}
				
				if (o2.length() == 1) {
					o2 = o2 + o2;
				}
				
				return o1.compareTo(o2);
			}
		});
		
		String min = "";
		String max = "";
		
		for (int i = 0; i < n; i++) {
			min += numbers[i];
			max += numbers[n - 1 - i];
		}
		
		System.out.println(Long.parseLong(min) + Long.parseLong(max));
  }
}
