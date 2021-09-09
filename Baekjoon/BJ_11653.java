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
		ArrayList<Integer> temp_lst = new ArrayList<Integer>();		//배열의 크기 지정안하는 배열
		for(int i = 2; i < N/2; i++) {
			if(isPrime(i) && N%i == 0) {
				N = N/i;
				temp_lst.add(i);
				if(i != N)										//마지막에 남은 N을 추가하기 때문에 
					i--;
			}
		}
		temp_lst.add(N);										//소인수분해 끝나고 남은 N
		for(int i = 0; i < temp_lst.size(); i++) {				//length대신 size()
			if(N == 1) {
				//1일 땐 아무것도 출력하지 않는다
			}
			else 
				System.out.println(temp_lst.get(i));				//받을 때 get메소드 이용
		}
	}
 	
	public static boolean isPrime(int n) {			//소수 확인하는 함수
		for(int i = 2; i < n/2; i++) {
			if(n%i == 0) 
				return false;
		}
		return true;
	}
}
