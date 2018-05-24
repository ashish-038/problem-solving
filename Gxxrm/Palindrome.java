/*
    펠린드롬 넘버 만들기
    - 펠린드롬 넘버란 앞뒤 어느 쪽에서 읽어도 동일한 값을 가지는 숫자를 말한다.
    - 입력으로 자연수가 하나 주어질 때, 해당 자연수에 연산 F를 한 번 이상 적용하여 4자리 이내의 펠린드롬 넘버를 만들 수 있다면 펠린드롬을 출력한다.
    - 단, 아래와 같은 조건 중 하나 이상을 만족하면 불가능하다고 판단한다. -1을 출력한다.
        - 3번 이내의 연산으로 펠린드롬 넘버를 만들 수 없는 경우
        - 연산 과정에서 결과가 10,000 이상이 되 버리는 경우
        - 만들 수 있는 경우가 여러가지라면 가장 적은 연산을 적용한 값을 선택한다.

    결과
    - 150/150 점
    - 테스트케이스 통과: 20/20 개
*/

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int current = n;
		for (int i = 0; i < 3; i++) {
			n = operate(n);
			
			if (n >= 10000) {
				System.out.println(-1);
				return;
			}
			
			if (isPalindrome(n)) {
				System.out.println(n);
				return;
			}
		}
		
		System.out.println(-1);
  }
	
	public static int operate(int original) {
		int temp = original;
		int reversed = 0;
		
		while (temp > 0) {
			reversed  = reversed * 10 + (temp % 10);
			temp /= 10;
		}
		
		return (original + reversed);
	}
	
	public static boolean isPalindrome(int number) {
		String temp = Integer.toString(number);
		int length = temp.length();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = temp.charAt(i) - '0';
		}
		
		int start = 0;
		int end = length - 1;
		int mid = (start + end) / 2;
		
		for (int i = 0; i <= mid; i++) {
			if (array[start] == array[end]) {
				start++;
				end--;
			} else {
				return false;
			}
		}
		
		return true;
	}
}
