package Baekjoon;
import java.util.*;

/*�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�.
 *�� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
 *n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *ù° �ٿ� n�� �־�����. n�� 20���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�
 *ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.
 */

public class BJ_10870 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = fibo(N);
		
		System.out.println(result);
	}
	
	public static int fibo(int N) {
		if(N == 0) {
			return 0;
		}
		if(N == 1) {
			return 1;
		}
		return fibo(N-1) + fibo(N-2);
		
	}

}
