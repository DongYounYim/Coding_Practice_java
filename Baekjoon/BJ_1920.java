package Baekjoon;
import java.util.*;

public class BJ_1920 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] n_list = new int[N];
		for(int i = 0; i < N; i++) {
			n_list[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int[] m_list = new int[M];
		for(int j = 0; j < M; j++) {
			m_list[j] = sc.nextInt();
		}
		Arrays.sort(n_list);
		for(int j = 0; j < M; j++) {
			System.out.println(binarysearch(n_list, m_list[j]));
		}
		
	}
	
	public static int binarysearch(int[] my_list, int target) {
		int start = 0;
		int end = my_list.length - 1;
		
		while(start <= end) {
			int mid = (int) (start+end) / 2;
			
			if(my_list[mid] == target) {
				return 1;
			} else if(my_list[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return 0;
	}
}
