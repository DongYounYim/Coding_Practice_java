package Baekjoon;
import java.util.*;

/*�� ���� ������ �־����� ��, ù ��° ���� �� ��° ������ ū�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *�Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� �ִ�. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� ������ �־�����. 
 *�� ���� �鸸���� �۰ų� ���� ���� �����̴�. �Է��� ������ �ٿ��� 0�� �� �� �־�����.
 *�� �׽�Ʈ ���̽�����, ù ��° ���� �� ��° ������ ũ�� Yes��, �ƴϸ� No�� �� �ٿ� �ϳ��� ����Ѵ�.
 */
public class BJ_4101 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int N1 = sc.nextInt();
			int N2 = sc.nextInt();
			if(N1 == 0 && N2 == 0) {
				break;
			} else {
				if(N1 > N2) {
					System.out.println("Yes");
				} else
					System.out.println("No");
			}
		}
		
	}
}
