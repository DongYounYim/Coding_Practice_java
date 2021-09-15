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
				if(N == 1) {					//소인수분해 완료시 루프 탈출
					break;
				}
				for(int i = 2; i <= N; i++) {	//어차피 소수로 못나누면 소수가 아닌걸로도 못나눔
					if(N%i == 0) {
						System.out.println(i);
						N /= i;
						break;					//다시 2부터 돌릴 수 있게 루프 탈출
					}
				}
			}
		}
	}
	
}
