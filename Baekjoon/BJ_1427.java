package Baekjoon;
import java.util.*;

/*�迭�� �����ϴ� ���� ����. ���� �־�����, �� ���� �� �ڸ����� ������������ �����غ���.
 *ù° �ٿ� �����ϰ����ϴ� �� N�� �־�����. N�� 1,000,000,000���� �۰ų� ���� �ڿ����̴�.
 *ù° �ٿ� �ڸ����� ������������ ������ ���� ����Ѵ�.
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
