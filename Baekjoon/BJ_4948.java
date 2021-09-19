package Baekjoon;
import java.util.*;

/*����Ʈ�� ������ ������ �ڿ��� n�� ���Ͽ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ��� �ϳ� �����Ѵٴ� ������ ��� �ִ�.
 *�� ������ ������ ����Ʈ���� 1845�⿡ �����߰�, ������Ƽ ü������� 1850�⿡ �����ߴ�.
 *���� ���, 10���� ũ��, 20���� �۰ų� ���� �Ҽ��� 4���� �ִ�. (11, 13, 17, 19) ��, 14���� ũ��, 28���� �۰ų� ���� �Ҽ��� 3���� �ִ�. (17,19, 23)
 *�ڿ��� n�� �־����� ��, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 *�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� ���̽��� n�� �����ϴ� �� �ٷ� �̷���� �ִ�.
 *�Է��� ���������� 0�� �־�����.
 *�� �׽�Ʈ ���̽��� ���ؼ�, n���� ũ��, 2n���� �۰ų� ���� �Ҽ��� ������ ����Ѵ�.
 */

public class BJ_4948 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int T = sc.nextInt();
			if(T == 0) {
				break;
			}
			int count = 0;
			for(int i = T+1; i <= T*2; i++) {
				if(isPrime(i)) {
					count++;
				}
			}
			System.out.println(count);
			count = 0;
		}
	}
	
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		for(int i = 2; i*i <= n; i++) {
			if(n%i == 0)
				return false;
		}
		return true;
	}
}
