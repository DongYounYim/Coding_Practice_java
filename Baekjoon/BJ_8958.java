package Baekjoon;
import java.util.*;

/*"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
 "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 */

public class BJ_8958 {
	public static void main(String args[]) {
		int array_num; 						//Test케이스 갯수
		int score = 0;
		Scanner sc = new Scanner(System.in);
		array_num = sc.nextInt();
		
		String[] OX_array = new String[array_num];  //Test케이스 배열로 선언
		int[] OX_score = new int[array_num];		//각 케이스마다의 점수 선언
		for(int i = 0; i < array_num; i++) {  		//각 Test케이스 배열에 OX입력
			OX_array[i] = sc.next();
		}
		for(int j = 0; j < array_num; j++) {
			for(int i = 0; i < OX_array[j].length(); i++) {
				//각 Test케이스의 OX찾기
				if(OX_array[j].charAt(i) == 'O') {
					score++;
					OX_score[j] = OX_score[j] + score;
				} else if(OX_array[j].charAt(i) != 'O') {		//X가 나올시 콤보 점수 초기화
					score = 0;
				}
			}
			score = 0; 							//케이스 하나 종료시 콤보 초기화
			System.out.println(OX_score[j]);
		}
	}
}
