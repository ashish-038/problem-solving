/*
    가장 가까운 두 점
    - 1차원 직선상에 존재하는 여러 개의 점의 좌표가 주어진다. 주어지는 점들 중 가장 가까운 거리에 있는 두 점 쌍을 하나 출력하시오.
    - 첫 줄에는 1차원 직선상에 존재하는 점들의 수를 나타내는 2이상 10이하의 자연수 N이 주어진다.
    - 두 번째 줄에는 N개의  점의 좌표가 공백으로 구분되어 주어진다.
    - 두 좌표 중 작은 값을 앞에 출력하고 더 큰 값을 뒤에 출력한다.
    - 거리가 같은 쌍이 여러개가 존재할 경우 두 좌표의 합이 최소가 되는 쌍만을 출력한다.
    - 함정: 모든 좌표는 최대 10자리의 자연수다.
        - 10자리 정도면 int로 감당 못한다. 대신 long을 사용한다.

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
