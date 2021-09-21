package Baekjoon;
import java.util.*;

/*세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. 
 *첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
 *두 번째로 큰 정수를 출력한다.
 */

public class BJ_10817 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		for(int i = 0; i < 3; i++) {
			num[i] = sc.nextInt();
		}
		sort(num);
		System.out.println(num[1]);
		
		
	}
	
	public static void sort(int[] a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
