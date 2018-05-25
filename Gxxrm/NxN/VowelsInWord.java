/*
    단어 찾아내기

    결과
    - 테스트케이스: 15 / 15 개
    - 점수: 150 / 150 점
*/

import java.util.Scanner;
import java.util.Arrays;

class Main {

  public static void main(String[] args) {
		// read input and prepare
		Scanner scanner = new Scanner(System.in);
		String[] words = scanner.nextLine().split(" ");
		
		// process
		int firstCount = 0;
		int secondCount = 0;
		
		for (String word: words) {
			// first
			int tempCount = 0;
			for (int i = 0; i < word.length(); i++) {
				if (isVowel(word.charAt(i))) {
					tempCount++;
				} else {
					tempCount = 0;
				}
				
				if (tempCount >= 2) {
					firstCount++;
					break;
				}
			}
			
			// second
			tempCount = 0;
			for (int j = 0; j < word.length(); j++) {
				if (!isVowel(word.charAt(j))) {
					tempCount++;
				} else {
					tempCount = 0;
				}
				
				if (tempCount >= 3) {
					secondCount++;
					break;
				}
			}
		}
		
		// print output
		System.out.println(firstCount);
		System.out.println(secondCount);
  }
	
	public static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		} else {
			return false;
		}
	}
}
