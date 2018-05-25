/*
    클릭 이벤트 처리하기
    - px < qx, py < qy라서 Math.min과 max는 굳이 할 필요 없었으나 조건을 깜빡하고 그냥 했다.
    - 좌표 클래스를 작성해봤다.

    결과
    - 테스트 케이스: 10/10개
*/

/* package 구문을 넣으면 안됩니다 */
import java.util.*;
import java.io.*;

/* [Notice for Java]
 * - 기본 제공되는 뼈대 코드는 입출력의 이해를 돕기위해 제공되었습니다.
 * - 뼈대코드의 활용은 선택사항이며 코드를 직접 작성하여도 무관합니다.
 * 
 * - 별도의 병렬 처리나 시스템콜, 네트워크/파일접근 등을 하지 마세요 
 * - 입출력의 양이 많은 문제는 BufferedReader와 BufferedWriter를 사용하면 시간을 단축할 수 있습니다.
 * - 클래스 이름은 항상 Main이어야 합니다. 주의하세요.
 * - 모든 입력과 출력은 System.in과 System.out 스트림을 이용해야 합니다.
 */

public class Main{

	//표준입력을 수행할 Scanner를 선언한다 
	public static Scanner scanner = new Scanner(System.in);


	public static void main(String[] args) {
		// read input
		int n = scanner.nextInt();
		int px = scanner.nextInt();
		int qx = scanner.nextInt();
		int py = scanner.nextInt();
		int qy = scanner.nextInt();
		
		// make coordinates
		Coordinate p = new Coordinate(px, py);
		Coordinate q = new Coordinate(qx, qy);
		int count = 0;
		
		// check if touches are valid
		for (int i = 0; i < n; i++) {
			Coordinate c = new Coordinate(scanner.nextInt(), scanner.nextInt());
			if (isTouchValid(p, q, c)) count++;
		}
		
		// print output
		System.out.println(count);
	}

	public static boolean isTouchValid(Coordinate p, Coordinate q, Coordinate c) {
		int smallerX = Math.min(p.x, q.x);
		int biggerX = Math.max(p.x, q.x);
		int smallerY = Math.min(p.y, q.y);
		int biggerY = Math.max(p.y, q.y);
		
		if (c.x >= smallerX && c.x <= biggerX && c.y >= smallerY && c.y <= biggerY) {
			return true;
		} else {
			return false;
		}
	}
}

class Coordinate {
	int x;
	int y;
	
	Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
}