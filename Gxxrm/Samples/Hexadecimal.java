/*
    16진수
    - 입력 받은 10진수를 16진수로 출력하는 프로그램을 작성하십시오.
    - e.g. 1000 -> 3e8
*/

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.Stack;

class Main {

  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		Stack<String> remainders = new Stack<>();
		StringJoiner joiner = new StringJoiner("");
		
		while (n > 0) {
			remainders.push(decToHex(n));
			n /= 16;
		}
		
		while (!remainders.isEmpty()) {
			joiner.add(remainders.pop());
		}
		
		System.out.println(joiner.toString());
  }
	
	public static String decToHex(int decimal) {
		int remainder = decimal % 16;
		
		switch (remainder) {
			case 10:
				return "a";
			case 11:
				return "b";
			case 12:
				return "c";
			case 13:
				return "d";
			case 14:
				return "e";
			case 15:
				return "f";
			default:
				return String.valueOf(remainder);
		}
	}
}
