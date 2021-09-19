package Baekjoon;
import java.util.*;
import java.math.*;

/*19세기 독일 수학자 헤르만 민코프스키는 비유클리드 기하학 중 택시 기하학을 고안했다.
 *택시 기하학에서 두 점 T1(x1,y1), T2(x2,y2) 사이의 거리는 다음과 같이 구할 수 있다.
 *D(T1,T2) = |x1-x2| + |y1-y2|
 *두 점 사이의 거리를 제외한 나머지 정의는 유클리드 기하학에서의 정의와 같다.
 *따라서 택시 기하학에서 원의 정의는 유클리드 기하학에서 원의 정의와 같다.
 *원: 평면 상의 어떤 점에서 거리가 일정한 점들의 집합
 *반지름 R이 주어졌을 때, 유클리드 기하학에서 원의 넓이와, 택시 기하학에서 원의 넓이를 구하는 프로그램을 작성하시오.
 *첫째 줄에 반지름 R이 주어진다. R은 10,000보다 작거나 같은 자연수이다.
 *첫째 줄에는 유클리드 기하학에서 반지름이 R인 원의 넓이를, 둘째 줄에는 택시 기하학에서 반지름이 R인 원의 넓이를 출력한다. 
 *정답과의 오차는 0.0001까지 허용한다.
 */

public class BJ_3053 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		double ucli = uclid_geo(R);
		double taxi = taxi_geo(R);
		System.out.printf("%.6f\n", ucli);
		System.out.printf("%.6f", taxi);
	}
	
	public static double uclid_geo(int n) {
		return n * n * Math.PI;
	}
	
	public static double taxi_geo(int n) {
		return n * n * 2;
	}
}
