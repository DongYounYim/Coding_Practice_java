package Baekjoon;
import java.util.*;

/*���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
 * ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.
 * ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. 
 * ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
 */

public class BJ_1157 {
	public static void main(String args[]) {
		String S;					//���� ���ڿ�
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		S = S.toUpperCase();		//�빮�ڷ� ����
		int[] count = new int[26];		//26�� ���ĺ� ���� A~Z
		for(int i = 0; i < 26; i++) {
			count[i] = 0;				//�ʱ�ȭ
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
