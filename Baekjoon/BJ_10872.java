package Baekjoon;
import java.util.*;

/*0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.
 * ù° �ٿ� N!�� ����Ѵ�.
 */

public class BJ_10872 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result;
		result = facto(N);
		
		System.out.println(result);
	}
	
	public static int facto(int N) {
		if(N == 0) {
			return 1;
		} else if(N == 1) {
			return N * 1;
		}
		return N * facto(N-1);
	}
}
