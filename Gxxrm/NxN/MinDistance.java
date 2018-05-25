/*
    가장 가까운 두 점

    특징
    - 모든 좌표는 최대 10자리의 자연수: 10자리 정도면 int로는 감당 못한다. long을 사용한다.

    결과
    - 테스트케이스: 22 / 22 개
    - 점수: 100 / 100 점
*/

import java.util.Scanner;
import java.util.Arrays;

class Main {

  public static void main(String[] args) {
		// read input and prepare
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine().trim());
		String[] tempArray = scanner.nextLine().split(" ");
		long[] numbers = new long[n];
		
		for (int i = 0; i < n; i++) {
			numbers[i] = Long.parseLong(tempArray[i]);
		}
		
		// process
		// boundary case
		if (n == 2) {
			long smaller = Math.min(numbers[0], numbers[1]);
			long bigger = Math.max(numbers[0], numbers[1]);
			
			System.out.println(String.format("%d %d", smaller, bigger));
			return;
		}
		
		// general case
		Arrays.sort(numbers);

		int startIndex = 0;
		long minDistance = numbers[1] - numbers[0];

		for (int i = 1; i < (n - 1); i++) {
			long distance = numbers[i + 1] - numbers[i];

			if (distance < minDistance) {
				startIndex = i;
				minDistance = distance;
			}
		}

	// print output
		System.out.println(String.format("%d %d", numbers[startIndex], numbers[startIndex + 1]));
  }
}
