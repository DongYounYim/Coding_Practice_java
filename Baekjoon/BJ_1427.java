package Baekjoon;
import java.util.*;

/*배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
 *첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.
 *첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 */

public class BJ_1427 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String N_str = String.valueOf(N);
		char[] N_char = new char[N_str.length()];
		int[] N_arr = new int[N_str.length()];
		for(int i = 0; i < N_str.length(); i++) {
			N_char[i] = N_str.charAt(i);
			N_arr[i] = N_char[i] - '0';
		}
		sort(N_arr);
		for(int i = 0; i < N_arr.length; i++) {
			System.out.print(N_arr[i]);
		}
		
	}
	
	public static void sort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
