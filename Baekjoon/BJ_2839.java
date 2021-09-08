package Baekjoon;
import java.util.*;

/*����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. 
 *�������忡�� ����� ������ ������ ����� �ִ�. ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
 *����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�. 
 *���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
 *����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *ù° �ٿ� N�� �־�����. (3 �� N �� 5000)
 *����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�. ����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�.
 *����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.
 */

public class BJ_2839 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = 0;
		int temp = 0;
		boolean pass = false;
		//3*x + 5*y = N �� �����ϸ� ��°����ϰ�
		//�̶�, x + y�� �ּڰ��� �Ǿ���Ѵ�.
		if(isPossible(N)) {
			for(int x = 0; x < N; x++) {
				for(int y = 0; y < N; y++) {
					if(pass && 3*x + 5*y == N) {	//2��° �̻��� min���� ���� ��
						temp = x + y;
						if(temp < min) {
							min = temp;
						}
					}
					if(pass == false && 3*x + 5*y == N) {		//������ min���� ���� ��
						min = x + y;
						pass = true;
					}
				}
			}
			System.out.print(min);
		} else									//isPossible �� false�� �� ��, 3�� 5�� �й���� ���� ��
			System.out.println("-1");
	}
	
	public static boolean isPossible(int N) {
		for(int x = 0; x < N; x++) {
			for(int y =0; y < N; y++) {
				if(3*x + 5*y == N)
					return true;
			}
		}
		return false;
	}

}
