package Baekjoon;
import java.util.*;

/*���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? 
 * �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�.
 * ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ���ڿ��� �־�����. �� ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�. �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����.
 * ���� ���ڿ��� �հ� �ڿ��� ������ ���� ���� �ִ�.
 * ù° �ٿ� �ܾ��� ������ ����Ѵ�.
 */

public class BJ_1152 {
	public static void main (String args[]) throws StringIndexOutOfBoundsException {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		S = S.trim();						//���ڿ� ���� ��������
		S = S.strip();						//���ڿ� ���� ��������
		int count = 1;						//�⺻������ �ܾ �ִٰ� ����.
		Boolean kk = false;					//�ܾ ������ �Ǵ��ϴ� ����
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == ' ') {
				count++;
				kk = true;
			}
			if(S.charAt(i) != ' ')
				kk = true;
		}
		if(kk == false) {
			count = 0;
		}
		System.out.println(count);
	}
}
