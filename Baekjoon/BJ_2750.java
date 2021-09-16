package Baekjoon;
import java.util.*;

/* N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� ���� ���� N(1 �� N �� 1,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� �� �־�����.
 * �� ���� ������ 1,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
 * ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
 */

public class BJ_2750 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		sort(num);
		for(int i = 0; i < N; i++) {
			System.out.println(num[i]);
		}
	}
	
	public static void sort(int[] n) {
		for(int i = 0; i < n.length; i++) {
			for(int j = i+1; j < n.length; j++) {
				if(n[i] > n[j]) {
					int temp = n[j];
					n[j] = n[i];
					n[i] = temp;
				}
			}
		}
	}
}
