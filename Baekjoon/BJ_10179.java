package Baekjoon;
import java.util.*;

/*당신은 어떤 물건이라도 20% 할인해주는 쿠폰을 가지고 있다.
 *원래 가격이 주어질 때, 쿠폰을 사용하면 얼마가 되는지 알려주는 프로그램을 작성하시오.
 *첫 번째 줄에 테스트케이스의 수가 주어진다.
 *각 줄에는 물건의 원래가격이 소수점 둘째자리까지 주어진다.
 *할인된 가격을 달러 단위로 출력한다.
 *나누어떨어지지 않을 때는 소수점 셋째 자리에서 반올림해서 둘째 자리까지 출력한다.
 */

public class BJ_10179 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		double[] db = new double[T];
		for(int i = 0; i < T; i++) {
			db[i] = sc.nextDouble();
			db[i] = db[i]/100 * 80;
		}
		for(int i = 0; i < T; i++) {
			System.out.printf("$%.2f\n", db[i]);
		}
	}
}
