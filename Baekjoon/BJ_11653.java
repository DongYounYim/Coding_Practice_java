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
				if(N == 1) {					//���μ����� �Ϸ�� ���� Ż��
					break;
				}
				for(int i = 2; i <= N; i++) {	//������ �Ҽ��� �������� �Ҽ��� �ƴѰɷε� ������
					if(N%i == 0) {
						System.out.println(i);
						N /= i;
						break;					//�ٽ� 2���� ���� �� �ְ� ���� Ż��
					}
				}
			}
		}
	}
	
}
