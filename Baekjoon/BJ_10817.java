package Baekjoon;
import java.util.*;

/*�� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 *ù° �ٿ� �� ���� A, B, C�� �������� ���еǾ� �־�����. (1 �� A, B, C �� 100)
 *�� ��°�� ū ������ ����Ѵ�.
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
