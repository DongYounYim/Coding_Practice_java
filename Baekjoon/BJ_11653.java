package Baekjoon;
import java.util.*;

/* ���� N�� �־����� ��, ���μ������ϴ� ���α׷��� �ۼ��Ͻÿ�.���� N�� �־����� ��, ���μ������ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� ���� N (1 �� N �� 10,000,000)�� �־�����.
 * N�� ���μ����� ����� �� �ٿ� �ϳ��� ������������ ����Ѵ�. N�� 1�� ��� �ƹ��͵� ������� �ʴ´�.
 */

public class BJ_11653 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N == 1) {
			//�ƹ��͵� ������� �ʴ´�.
		} else {
			while(true) {
				int prime = vid(N);			//�Ҽ��̸� N�� ���� �� �ִ� �� prime�� ����(N�� �Ҽ����� ����)
				System.out.println(prime);	
				if(isPrime(N)) {			//N�� �Ҽ��̸� ���� Ż��
					break;
				} else {
					N /= prime;				//�Ҽ��� �ƴϸ� ã�� �Ҽ��� ������ loop����
				}
			}
		}
	}
 	
	public static boolean isPrime(int n) {			//�Ҽ� Ȯ���ϴ� �Լ�
		for(int i = 2; i*i <= n; i++) {			//�Ҽ�Ȯ���ϴ� �ּҽð� �˰��� : �ð����⵵(��ƮN)
			if(n%i == 0) 
				return false;
		}
		return true;
	}
	
	public static int vid(int N) {				//���� ���� ������ ã��
		for(int i = 2; i <= N/2; i++) {			//N�� ���� �̻��� ���� ���� �� ����.
			if(isPrime(i) && N%i == 0) {
				return i;
			}
		}
		return N;
	}
}
