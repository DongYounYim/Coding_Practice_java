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
		ArrayList<Integer> temp_lst = new ArrayList<Integer>();		//�迭�� ũ�� �������ϴ� �迭
		for(int i = 2; i < N/2; i++) {
			if(isPrime(i) && N%i == 0) {
				N = N/i;
				temp_lst.add(i);
				if(i != N)										//�������� ���� N�� �߰��ϱ� ������ 
					i--;
			}
		}
		temp_lst.add(N);										//���μ����� ������ ���� N
		for(int i = 0; i < temp_lst.size(); i++) {				//length��� size()
			if(N == 1) {
				//1�� �� �ƹ��͵� ������� �ʴ´�
			}
			else 
				System.out.println(temp_lst.get(i));				//���� �� get�޼ҵ� �̿�
		}
	}
 	
	public static boolean isPrime(int n) {			//�Ҽ� Ȯ���ϴ� �Լ�
		for(int i = 2; i < n/2; i++) {
			if(n%i == 0) 
				return false;
		}
		return true;
	}
}
