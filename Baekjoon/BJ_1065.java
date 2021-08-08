package Baekjoon;
import java.util.*;

/*어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
 * 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
 * N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. */

// 문제에서 N은 1000이하의 숫자.
public class BJ_1065 {
	public static void main(String args[]) {
		int N;
		int count = 0;								//N보다 작은 한수의 갯수 카운트
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			if(hansoo(i)) {							//한수가 맞으면 count 상승
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static Boolean hansoo(int x) {				//1000이하의 자연수라서 이용할 수 있는 함수
		String X = Integer.toString(x);
		if(X.length() == 3) {
			char a = X.charAt(0); 				//백의자리
			char b = X.charAt(1);				//십의자리
			char c = X.charAt(2);				//일의자리
			int sum1 = (int) a - (int) b;		//각 자릿수의 합, 차 계산
			int sum2 = (int) b - (int) c;
			if(sum1 == sum2) {		
				return true;
			} else
				return false;
		}
		if(X.length() == 4) {					//1000은 한수가 아니다
			return false;
		}
		return true;
	}
}
