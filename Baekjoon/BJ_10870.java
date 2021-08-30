package Baekjoon;
import java.util.*;

/*피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다.
 *그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
 *n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 *첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다
 *첫째 줄에 n번째 피보나치 수를 출력한다.
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
