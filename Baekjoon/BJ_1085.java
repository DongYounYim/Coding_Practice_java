package Baekjoon;
import java.util.*;

/*�Ѽ��� ���� (x, y)�� �ִ�. ���簢���� �� ���� ��ǥ�࿡ �����ϰ�, ���� �Ʒ� �������� (0, 0), ������ �� �������� (w, h)�� �ִ�. 
 *���簢���� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *ù° �ٿ� x, y, w, h�� �־�����.
 *ù° �ٿ� ������ ������ ����Ѵ�.
 */

public class BJ_1085 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		int len_x;					//��ġ�� x �ּҰŸ�
		int len_y;					//��ġ�� y �ּҰŸ�
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
