package Baekjoon;
import java.util.*;

/* ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�. S���� QR Code "alphanumeric" ���ڸ� ����ִ�.
QR Code "alphanumeric" ���ڴ� 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: �̴�.
 * ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. 
 * �� �׽�Ʈ ���̽��� �ݺ� Ƚ�� R(1 �� R �� 8), ���ڿ� S�� �������� ���еǾ� �־�����. 
 * S�� ���̴� ��� 1�̸�, 20���ڸ� ���� �ʴ´�. 
 * �� �׽�Ʈ ���̽��� ���� P�� ����Ѵ�.
 */
public class BJ_2675 {
	public static void main(String args[]) {
		int T, R;							//T�� �׽�Ʈ ���̽� ����, R�� �ݺ�Ƚ��
		Scanner sc = new Scanner(System.in);
		String S;							//���ڿ�
		T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			R = sc.nextInt();
			S = sc.next();
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println("");
		}
	}
}
