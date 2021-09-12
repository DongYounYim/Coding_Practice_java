package Baekjoon;
import java.util.*;

/*한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 
 *직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
 *첫째 줄에 x, y, w, h가 주어진다.
 *첫째 줄에 문제의 정답을 출력한다.
 */

public class BJ_1085 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int len_x;					//위치와 x 최소거리
		int len_y;					//위치나 y 최소거리
		int min;
		if(w/2 < x) {
			len_x = w - x; 
		} else 
			len_x = x;
		
		
		if(h/2 < y) {
			len_y = h - y;
		} else
			len_y = y;
		
		if(len_x <= len_y) {
			min = len_x;
		} else
			min = len_y;
		
		System.out.println(min);
	}

}
