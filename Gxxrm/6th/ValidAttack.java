/*
    캐릭터 피격 판정하기

    결과
    - 테스트케이스: 20/20개
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
		int cx, cy;//스킬을 사용하는 캐릭터의 좌표 
		int r;			//스킬의 사정거리를 나타내는 최대 반지름 
		int[] ex = new int[5]; //적 들의 x 좌표 
		int[] ey = new int[5]; //적 들의 y 좌표

		cx = scanner.nextInt();
		cy = scanner.nextInt();
		r = scanner.nextInt();
		for (int i = 0 ; i < 5; i++) {
			ex[i] = scanner.nextInt();
			ey[i] = scanner.nextInt();
		}

		int minDistance = (cx - ex[0]) * (cx - ex[0]) + (cy - ey[0]) * (cy - ey[0]);
		int target = (minDistance <= r * r) ? 1 : -1;

		for (int i = 1; i < 5; i++) {
			int distance = (cx - ex[i]) * (cx - ex[i]) + (cy - ey[i]) * (cy - ey[i]);

			if (distance < minDistance && distance <= r * r) {
				minDistance = distance;
				target = i + 1;
			}
		}

		System.out.println(target);
	}
}

