package Baekjoon;
import java.util.*;

/*알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
 * 단, 대문자와 소문자를 구분하지 않는다.
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
 * 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */

public class BJ_1157 {
	public static void main(String args[]) {
		String S;					//받을 문자열
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		S = S.toUpperCase();		//대문자로 변경
		int[] count = new int[26];		//26은 알파벳 갯수 A~Z
		for(int i = 0; i < 26; i++) {
			count[i] = 0;				//초기화
		}
		for(int i = 0; i < S.length(); i++) {
			switch(S.charAt(i)) {
			case 'A':
				count[0]++;
				break;
			case 'B':
				count[1]++;
				break;
			case 'C':
				count[2]++;
				break;
			case 'D':
				count[3]++;
				break;
			case 'E':
				count[4]++;
				break;
			case 'F':
				count[5]++;
				break;
			case 'G':
				count[6]++;
				break;
			case 'H':
				count[7]++;
				break;
			case 'I':
				count[8]++;
				break;
			case 'J':
				count[9]++;
				break;
			case 'K':
				count[10]++;
				break;
			case 'L':
				count[11]++;
				break;
			case 'M':
				count[12]++;
				break;
			case 'N':
				count[13]++;
				break;
			case 'O':
				count[14]++;
				break;
			case 'P':
				count[15]++;
				break;
			case 'Q':
				count[16]++;
				break;
			case 'R':
				count[17]++;
				break;
			case 'S':
				count[18]++;
				break;
			case 'T':
				count[19]++;
				break;
			case 'U':
				count[20]++;
				break;
			case 'V':
				count[21]++;
				break;
			case 'W':
				count[22]++;
				break;
			case 'X':
				count[23]++;
				break;
			case 'Y':
				count[24]++;
				break;
			case 'Z':
				count[25]++;
				break;
			}
		}
		int max1 = 0;
		int max2 = 0;
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < 26; j++) {
				
			}
		}
		
	}
}
