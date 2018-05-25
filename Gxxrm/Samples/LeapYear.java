/*
    윤년
    - 연도를 입력받고 윤년인지 아닌지를 결정하는 프로그램을 작성하십시오.
    - 윤년일 경우 "Leap Year"
    - 평년일 경우 "Not Leap Year"
*/

import java.util.Scanner;

class Main {

  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		String result = (isLeapYear(n)) ? "Leap Year" : "Not Leap Year";
		
		System.out.println(result);
  }
	
	public static boolean isLeapYear(int year) {
		return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}
}
