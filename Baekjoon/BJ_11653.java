package Baekjoon;
import java.util.*;

/* 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
 * 첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.
 * N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
 */

public class BJ_11653 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N == 1) {
			//아무것도 출력하지 않는다.
		} else {
			while(true) {
				int prime = vid(N);			//소수이며 N을 나눌 수 있는 값 prime에 저장(N이 소수여도 포함)
				System.out.println(prime);	
				if(isPrime(N)) {			//N이 소수이면 루프 탈출
					break;
				} else {
					N /= prime;				//소수가 아니면 찾은 소수로 나누고 loop진행
				}
			}
		}
	}
 	
	public static boolean isPrime(int n) {			//소수 확인하는 함수
		for(int i = 2; i*i <= n; i++) {			//소수확인하는 최소시간 알고리즘 : 시간복잡도(루트N)
			if(n%i == 0) 
				return false;
		}
		return true;
	}
	
	public static int vid(int N) {				//가장 작은 수부터 찾음
		for(int i = 2; i <= N/2; i++) {			//N의 절반 이상의 값은 나눌 수 없다.
			if(isPrime(i) && N%i == 0) {
				return i;
			}
		}
		return N;
	}
}
