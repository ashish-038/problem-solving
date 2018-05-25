/*
    약수 구하기
    - 양의 정수를 입력 받고 그 수의 약수를 모두 출력하는 프로그램을 작성하십시오.
    - 입력된 수의 약수를 공백으로 구분하여 출력 
*/

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.Stack;

class Main {

  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		StringJoiner joiner = new StringJoiner(" ");
		Stack<Integer> stack = new Stack<>();
		
		for (int divider = 1; divider <= (int)Math.sqrt(n); divider++) {
			int remainder = n % divider;
			if (remainder == 0) {
				joiner.add(String.valueOf(divider));
				
				int quotient = n / divider;
				if (quotient != divider) {
					stack.push(quotient);
				}
			}
		}
			
		while (!stack.isEmpty()) {
			joiner.add(String.valueOf(stack.pop()));
  	}
		
		System.out.println(joiner.toString());
	}
}
