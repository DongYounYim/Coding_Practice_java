package Baekjoon;
import java.util.*;

/*여러분이 작성할 프로그램은 초기에 모든 방이 비어있다고 가정하에 이 정책에 따라 N 번째로 도착한 손님에게 배정될 방 번호를 계산하는 프로그램이다. 첫 번째 손님은 101 호, 두 번째 손님은 201 호 등과 같이 배정한다. 
 * 그림 1 의 경우를 예로 들면, H = 6이므로 10 번째 손님은 402 호에 배정해야 한다.
 * 프로그램은 표준 입력에서 입력 데이터를 받는다. 프로그램의 입력은 T 개의 테스트 데이터로 이루어져 있는데 T 는 입력의 맨 첫 줄에 주어진다. 
 * 각 테스트 데이터는 한 행으로서 H, W, N, 세 정수를 포함하고 있으며 각각 호텔의 층 수, 각 층의 방 수, 몇 번째 손님인지를 나타낸다(1 ≤ H, W ≤ 99, 1 ≤ N ≤ H × W). 
 * 프로그램은 표준 출력에 출력한다. 각 테스트 데이터마다 정확히 한 행을 출력하는데, 내용은 N 번째 손님에게 배정되어야 하는 방 번호를 출력한다.
 */

public class BJ_10250 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt(); 				//Testcase의 갯수
		int[][] Hotel;
		for(int i = 0; i < T; i++) {
			int temp = 0;					//초기화
			int count = 0;
			int H = sc.nextInt();			//각 층의 방
			int W = sc.nextInt();			//호텔의 층수
			int N = sc.nextInt();			//몇번째 손님인지
			Hotel = mkroom(W, H);
			for(int j = 0; j < N; j++) {
				temp = j;
				if(temp%H == 0 && temp != 0) {
					count++;
				}
			}
			temp = temp - H * count; 
			System.out.println(Hotel[temp][count]);
			//Hotel[
		}
		
	}
	
	public static int[][] mkroom(int a, int b) {
		int[][] Hotel = new int[a][b];
		String temp;
		for(int j = 0; j < b; j++) {
			for(int i = 0; i < a; i++) {
				//천과 , 백의자리는 층수, 십,일의자리는 방 수에 맞춰 올라간다.
				if(j < 10) {		//index가 0부터 시작이라 +1씩 해줌
					temp = Integer.toString(i+1) + "0" + Integer.toString(j+1);
				} else
					temp = Integer.toString(i+1) + Integer.toString(j+1);
				Hotel[i][j] = Integer.parseInt(temp);
			}
		}
		return Hotel;
	}

}
