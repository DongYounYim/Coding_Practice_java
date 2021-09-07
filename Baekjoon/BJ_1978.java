package Baekjoon;
import java.util.*;
/*�־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *ù �ٿ� ���� ���� N�� �־�����. N�� 100�����̴�. �������� N���� ���� �־����µ� ���� 1,000 ������ �ڿ����̴�.
 *�־��� ���� �� �Ҽ��� ������ ����Ѵ�.
 */

public class BJ_1978 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int[] num = new int[N];
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			if(isPrime(num[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean isPrime(int num) {
		if(num == 1)
			return false;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
