/*
	암호 해독하기

	특징
	- 별도의 클래스로 자료구조를 만들어내는 skill..
	- Comparable<T>
	- @Override compareTo()

	결과
	- 정답 보고나서 따라하면서 이해함
	- 어렵다
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
		// read inputs and prepare data
		String encoded = scanner.next();
		
		Frequency[] encodedFrequencies = new Frequency[26];
		Frequency[] statisticFrequencies = new Frequency[26];
		
		// initialize frequencies
		for (int i = 0; i < 26; i++) {
			char letter = (char)('A' + i);
			encodedFrequencies[i] = new Frequency(letter, 0);
			statisticFrequencies[i] = new Frequency(letter, 0);
		}
		
		// fill encodedFrequencies
		for (int i = 0; i < encoded.length(); i++) {
			int index = encoded.charAt(i) - 'A';
			encodedFrequencies[index].count++;
		}
		
		// fill statisticFrequencies
		for (int i = 0; i < 26; i++) {
			statisticFrequencies[i].count = scanner.nextInt();
		}
		
		// sort frequencies
		Arrays.sort(encodedFrequencies);
		Arrays.sort(statisticFrequencies);
		
		// compose map
		HashMap<Character, Character> map = new HashMap<>();
		for (int i = 0; i < 26; i++) {
			map.put(encodedFrequencies[i].letter, statisticFrequencies[i].letter);
		}
		
		// decode
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < encoded.length(); i++) {
			char decoded = map.get(encoded.charAt(i));
			builder.append(decoded);
		}
		
		// print output
		System.out.println(builder.toString());
	}
}

class Frequency implements Comparable<Frequency> {
		char letter;
		int count;
		
		Frequency(char letter, int count) {
			this.letter = letter;
			this.count = count;
		}
		
		@Override
		public int compareTo(Frequency o) {
			if (this.count == o.count) {
				return (int)this.letter - (int)o.letter;
			}
			
			return o.count - this.count;
		}
	}