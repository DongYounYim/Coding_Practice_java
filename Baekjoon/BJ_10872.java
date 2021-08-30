package Baekjoon;
import java.util.*;

/*0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
 * 첫째 줄에 N!을 출력한다.
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
