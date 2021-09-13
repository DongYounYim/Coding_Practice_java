package Baekjoon;
import java.util.*;

/*���� ����Ʈ�ε��� �� ������ ���̰� 3, 4, 5�� �ﰢ���� ���� �ﰢ���ΰ��� �˾Ƴ´�. �־��� ������ ���̷� �ﰢ���� �������� �ƴ��� �����Ͻÿ�.
 *�Է��� �������� �׽�Ʈ���̽��� �־����� �������ٿ��� 0 0 0�� �Էµȴ�. �� �׽�Ʈ���̽��� ��� 30,000���� ���� ���� ������ �־�����, �� �Է��� ���� ���̸� �ǹ��Ѵ�.
 *�� �Է¿� ���� ���� �ﰢ���� �´ٸ� "right", �ƴ϶�� "wrong"�� ����Ѵ�.
 */

public class BJ_4153 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long a, b, c;
		a = 1;
		b = 1;
		c = 1;
		while(true) {
			a = sc.nextLong();
			b = sc.nextLong();
			c = sc.nextLong();
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			if(c*c == a*a + b*b || b*b == a*a + c*c || a*a == b*b + c*c) {
				System.out.println("right");
			} else
				System.out.println("wrong");
		}
	}
}
