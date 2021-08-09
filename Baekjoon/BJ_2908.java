package Baekjoon;
import java.util.*;

/*������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. 
 * �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. 
 * ����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
 * ����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. 
 * ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. ����, 
 * ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
 * �� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. 
 * �� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�.
 * ù° �ٿ� ����� ����� ����Ѵ�.
 */
public class BJ_2908 {
	public static void main(String args[]) {
		String A, B;				//����̰� ���� �� ��
		String answer;				//����� ���
		Scanner sc = new Scanner(System.in);
		A = sc.next();
		B = sc.next();
		char[] temp_A = new char[3];				//�� �ڸ��� �̱⶧���� �迭 ũ�� 3
		char[] temp_B = new char[3];
		
		for(int i = 0; i < 3; i++) {
			temp_A[i] = A.charAt(i);
			temp_B[i] = B.charAt(i);
		}
		char temp;
		
		change(temp_A);								//����� ���� �Լ� ���
		change(temp_B);	
		
		A = String.valueOf(temp_A);					//char�� �迭�� String���� �̾���̱�
		B = String.valueOf(temp_B);		
		
		if(Integer.parseInt(A) > Integer.parseInt(B)) {			//Integer.parseInt�� String���� int������ ��ȯ
			answer = A; 
		} else
			answer = B;
		
		System.out.println(answer);
	}
	
	public static int change(char[] A) { 			//�����ڸ��� �����ڸ��� �ٲٴ� �Լ�
		char temp;
		temp = A[0];
		A[0] = A[2];
		A[2] = temp;
		return 0;
	}

}
