package Baekjoon;
import java.util.*;

/*위의 그림과 같이 육각형으로 이루어진 벌집이 있다. 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
 *숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오. 
 *예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
 *첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
 *입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
 */

public class BJ_2292 {
	public static void main(String args[]) {
		//6의 배수 갯수 만큼 줄에 방이 형성
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 1(1)결과1, 2~7(6)결과2, 8~19(12)결과3, 20~37(18)결과4, 38~61(24)결과5, ...
		//()안의 것 반복문 6 * i(i = 1)
		int num_of_room = 1;				//방 갯수 ==> 출력값
		int temp = 1;
		
		
		for(int i = 1; i < 1000000000; i++) {			//1000000000은 최대 값
			if(temp < N) {
				temp = temp + (6 * i);
				num_of_room++;
			} else
				break;
		}
		System.out.println(num_of_room);
		
	}

}
