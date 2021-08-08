package Baekjoon;
import java.util.*;

/*N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 *첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
  입력으로 주어진 숫자 N개의 합을 출력한다.
 */

public class BJ_11720 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N;
		String N_by_n;				//String형으로 숫자를 받음.
		int sum = 0;
		N = sc.nextInt();
		N_by_n = sc.next();
		char chr[] = new char[N];	//각 자릿수 숫자를 char형으로 저장하는 배열
		for(int i = 0; i < N; i++) {
			chr[i] = N_by_n.charAt(i);
			sum = sum + Character.getNumericValue(chr[i]);
				//Character.getNumvericValue(char) 캐릭터형의 숫자를 int형으로 변환
		}
		System.out.println(sum);
	}

}
