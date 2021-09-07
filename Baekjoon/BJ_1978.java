package Baekjoon;
import java.util.*;
/*주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 *첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 *주어진 수들 중 소수의 개수를 출력한다.
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
