package Baekjoon;
import java.util.*;

/*이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 *X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 *첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
 *첫째 줄에 분수를 출력한다.
 */

public class BJ_1193 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int get = sc.nextInt();
		int sum = 3;
		int upper = 1;
		int lower = 2;
		int count = 2;
		if(get ==  1) {
			upper = 1;
			lower = 1;
		} else {
			for(; count < get; count++) {
				if(sum == upper + lower) { 
					if(sum%2 == 0) {		//합이 짝 수이면 분모가 커짐
						upper--;
						lower++;
					} else {				//홀 수이면 분자가 커짐 
						upper++;
						lower--;
					}
					if(upper == 0)   {		//줄어들다 0이되면 1로 초기화
						upper = 1;
						count--;
					}
					if(lower == 0) {
						lower = 1;
						count--;
					}
				} else {
					sum++;					//sum보다 커지면 늘림. upper, lower합이
				}
			}
		}
		//규칙 1/1 | 1/2 2/1 | 3/1 2/2 1/3 | 1/4 2/3 3/2 4/1 | 
		//     2  |    3    |      4      |        5		//temp
		// 분모 분자의 합이 1씩 늘어난다. 갯수가 1씩 늘어난다.
		// 1 / 2 3 / 4 5 6 / 7 8 9 10  						//(temp - 1)
		System.out.print(upper + "/" + lower);
	}

}
