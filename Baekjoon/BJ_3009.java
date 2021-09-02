package Baekjoon;
import java.util.*;

/*세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
 *세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 0보다 크거나 같고, 0000보다 작거나 같은 정수이다.
 *직사각형의 네 번째 점의 좌표를 출력한다.
 */

public class BJ_3009 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[2];
		int[] b = new int[2];
		int[] c = new int[2];
		int[] d = new int[2];
		
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		b[0] = sc.nextInt();
		b[1] = sc.nextInt();
		c[0] = sc.nextInt();
		c[1] = sc.nextInt();
		
		if(a[0] == b[0]) {
			d[0] = c[0];
		} else if (a[0] == c[0]) {
			d[0] = b[0];
		} else 
			d[0] = a[0];
		
		if(b[1] == a[1]) {
			d[1] = c[1];
		} else if(a[1] == c[1]) {
			d[1] = b[1];
		} else
			d[1] = a[1];
		
		
		System.out.print(d[0] + " " + d[1]);
	}

}
