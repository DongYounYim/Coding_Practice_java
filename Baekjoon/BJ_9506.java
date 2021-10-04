package Baekjoon;
import java.util.*;

/*어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다. 
 *예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
 *n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
 *입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100, 000)
 *입력의 마지막엔 -1이 주어진다.
 *테스트케이스 마다 한줄에 하나씩 출력해야 한다.
 *n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).
 *이때, 약수들은 오름차순으로 나열해야 한다.
 *n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.
 */
public class BJ_9506 {
	static ArrayList<Integer> tempnum = new ArrayList<Integer>();
	public static void main(String args[]) {
		Scanner sc = new  Scanner(System.in);
		int test;
		while(true) {
			test = sc.nextInt();
			if(test == -1) {
				break;
			}
			if(isPerfect(test)) {
				System.out.print(test + " = ");
				for(int i = 0; i < tempnum.size()-1; i++) {
					System.out.print(tempnum.get(i) + " + ");
				}
				System.out.println(tempnum.get(tempnum.size() - 1));
			} else {
				System.out.println(test + " is NOT perfect.");
			}
			//반복문이 끝날 때 전역변수 arraylist초기화
			tempnum.clear();
		}
	}
	
	public static boolean isPerfect(int t) {
		int sum = 0;
		for(int i = 1; i <= t/2; i++) {
			if(t%i == 0) {
				tempnum.add(i);
			}
		}
		for(int i = 0; i < tempnum.size(); i++) {
			sum += tempnum.get(i);
		}
		if(t == sum) {
			return true;
		} else
			return false;
	}
}
