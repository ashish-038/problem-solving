/*
    선분 교차 검사하기
    - isCrossed()의 로직을 이해하기 까다로움
    - 좌표 대신 통째로 선분 Segment 클래스 정의

    결과
    - 테스트케이스: 5/5개
*/

import java.util.*;

class Main {

  public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < n; i++) {
			Segment s1 = new Segment(scanner.nextInt(), scanner.nextInt(),
																 scanner.nextInt(), scanner.nextInt());
			Segment s2 = new Segment(scanner.nextInt(), scanner.nextInt(),
																 scanner.nextInt(), scanner.nextInt());
			if (isCrossed(s1, s2)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
  }
	
	public static boolean isCrossed(Segment s1, Segment s2) {
		int top = Math.min(s1.top, s2.top);
		int bottom = Math.max(s1.bottom, s2.bottom);
		int left = Math.max(s1.left, s2.left);
		int right = Math.min(s1.right, s2.right);
		
		if (right - left >= 0 && top - bottom >= 0) {
			return true;
		} else {
			return false;
		}
	}
	
}

class Segment {
	int top;
	int bottom;
	int left;
	int right;
	
	Segment(int ax, int ay, int bx, int by) {
		this.top = Math.max(ay, by);
		this.bottom = Math.min(ay, by);
		this.left = Math.min(ax, bx);
		this.right = Math.max(ax, bx);
	}
}