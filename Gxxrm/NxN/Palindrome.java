/*
    펠린드롬 넘버 만들기

    결과
    - 테스트케이스: 20 / 20 개    
    - 점수: 150 / 150 점
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
