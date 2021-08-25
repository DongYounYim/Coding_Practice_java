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
		for(int i = 0; i < S.length(); i++) {	//���ĺ� ���� ���� �ݺ���
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
		int max = 0;						//���� ���� �ľ� max
		int max_int = 26;					//case���� ���� ����
		boolean bool = true;				//���� ���� ���ĺ��� 2�� ���� �� false
		for(int i = 0; i < 26; i++) { 		//���̻��� ���ĺ� �˾ƺ��� �ݺ���
			if(count[i] != 0 && count[i] >= max) {
				if(max == count[i]) {
					bool = false; 		//�ߺ��� ��.
				} else {
					max = count[i];
					max_int = i;
					bool = true;
				}
			}
		}
		if(bool) {
			switch(max_int) {
			case 0:
				System.out.println("A");
				break;
			case 1:
				System.out.println("B");
				break;
			case 2:
				System.out.println("C");
				break;
			case 3:
				System.out.println("D");
				break;
			case 4:
				System.out.println("E");
				break;
			case 5:
				System.out.println("F");
				break;
			case 6:
				System.out.println("G");
				break;
			case 7:
				System.out.println("H");
				break;
			case 8:
				System.out.println("I");
				break;
			case 9:
				System.out.println("J");
				break;
			case 10:
				System.out.println("K");
				break;
			case 11:
				System.out.println("L");
				break;
			case 12:
				System.out.println("M");
				break;
			case 13:
				System.out.println("N");
				break;
			case 14:
				System.out.println("O");
				break;
			case 15:
				System.out.println("P");
				break;
			case 16:
				System.out.println("Q");
				break;
			case 17:
				System.out.println("R");
				break;
			case 18:
				System.out.println("S");
				break;
			case 19:
				System.out.println("T");
				break;
			case 20:
				System.out.println("U");
				break;
			case 21:
				System.out.println("V");
				break;
			case 22:
				System.out.println("W");
				break;
			case 23:
				System.out.println("X");
				break;
			case 24:
				System.out.println("Y");
				break;
			case 25:
				System.out.println("Z");
				break;
			}
		} else
			System.out.println("?");
		
	}
}
