package Baekjoon;
import java.util.*;

/*�� ���� �־����� ��, �࿡ ������ ���簢���� ����� ���ؼ� �ʿ��� �� ��° ���� ã�� ���α׷��� �ۼ��Ͻÿ�.
 *�� ���� ��ǥ�� �� �ٿ� �ϳ��� �־�����. ��ǥ�� 0���� ũ�ų� ����, 0000���� �۰ų� ���� �����̴�.
 *���簢���� �� ��° ���� ��ǥ�� ����Ѵ�.
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
