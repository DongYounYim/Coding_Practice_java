package Baekjoon;
import java.util.*;

/*두 양의 정수가 주어졌을 때, 첫 번째 수가 두 번째 수보다 큰지 구하는 프로그램을 작성하시오.
 *입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 두 정수가 주어진다. 
 *두 수는 백만보다 작거나 같은 양의 정수이다. 입력의 마지막 줄에는 0이 두 개 주어진다.
 *각 테스트 케이스마다, 첫 번째 수가 두 번째 수보다 크면 Yes를, 아니면 No를 한 줄에 하나씩 출력한다.
 */
public class BJ_4101 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int N1 = sc.nextInt();
			int N2 = sc.nextInt();
			if(N1 == 0 && N2 == 0) {
				break;
			} else {
				if(N1 > N2) {
					System.out.println("Yes");
				} else
					System.out.println("No");
			}
		}
		
	}
}
