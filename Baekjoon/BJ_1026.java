package Baekjoon;
import java.util.*;

/*���� ������ ������ �׻� ū ��ĩ�Ÿ����� ���� �־���. �� ������ ���� �������� ������ ���� ������ ���� ū ����� �ɾ���.
 *���̰� N�� ���� �迭 A�� B�� �ִ�. ������ ���� �Լ� S�� ��������.
 *S = A[0]��B[0] + ... + A[N-1]��B[N-1]
 *S�� ���� ���� �۰� ����� ���� A�� ���� ��迭����. ��, B�� �ִ� ���� ��迭�ϸ� �� �ȴ�.
 *S�� �ּڰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *ù° �ٿ� N�� �־�����. ��° �ٿ��� A�� �ִ� N���� ���� ������� �־�����, ��° �ٿ��� B�� �ִ� ���� ������� �־�����. 
 *N�� 50���� �۰ų� ���� �ڿ����̰�, A�� B�� �� ���Ҵ� 100���� �۰ų� ���� ���� �ƴ� �����̴�.
 *ù° �ٿ� S�� �ּڰ��� ����Ѵ�.
 */

public class BJ_1026 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}
		Arrays.sort(A);
		
		my_sort(B);
		
		int S = 0;
		for(int i = 0; i < N; i++) {
			S += A[i] * B[i];
		}
		System.out.println(S);
		
	}
	
	public static void my_sort(int[] A) {
		for(int i = 0; i < A.length; i++) {
			for(int j = i+1; j < A.length; j++) {
				if(A[i] < A[j]) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
			}
		}
	}
	

}
