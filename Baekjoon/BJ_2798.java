package Baekjoon;
import java.util.*;

public class BJ_2798 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();			//깔리는 카드 장 수
		int M = sc.nextInt();			//limit 카드 합
		int max_num, middle_num, min_num; //뽑을 3장의 카드
		int max_sum;
		int result = 0;
		
		int[] n = new int[N];
		sort(n);
		for(int i = 0; i < N; i++) {
			n[i] = sc.nextInt();
		}
		for(int i = N-1; i >= 0; i--) {
			max_num = n[i];
			for(int j = N-2; j >= 0; j--) {
				middle_num = n[j];
				for(int k = N-3; k >= 0; k--) {
					min_num = n[k];
					max_sum = max_num + middle_num + min_num;
					if(max_sum <= M && result < max_sum &&
						max_num != middle_num && middle_num != min_num
						&& max_num != min_num) {
						result = max_sum;
					}
				}
			}
		}
		System.out.println(result);
	}
	
	public static void sort(int[] n) {
		for(int i = 0; i < n.length; i++) {
			for(int j = i+1; j < n.length; j++) {
				if(n[i] > n[j]) {
					int temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}
	}
}
