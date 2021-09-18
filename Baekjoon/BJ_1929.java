package Baekjoon;
import java.util.*;

/*M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *ù° �ٿ� �ڿ��� M�� N�� �� ĭ�� ���̿� �ΰ� �־�����. 
 *(1 �� M �� N �� 1,000,000) M�̻� N������ �Ҽ��� �ϳ� �̻� �ִ� �Է¸� �־�����.
 *�� �ٿ� �ϳ���, �����ϴ� ������� �Ҽ��� ����Ѵ�.
 */

public class BJ_1929 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		for(int i = M; i <= N; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		for(int i = 2; i*i <= n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
}
