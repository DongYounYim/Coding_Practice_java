package Baekjoon;
import java.util.*;

/*�������� �ۼ��� ���α׷��� �ʱ⿡ ��� ���� ����ִٰ� �����Ͽ� �� ��å�� ���� N ��°�� ������ �մԿ��� ������ �� ��ȣ�� ����ϴ� ���α׷��̴�. ù ��° �մ��� 101 ȣ, �� ��° �մ��� 201 ȣ ��� ���� �����Ѵ�. 
 * �׸� 1 �� ��츦 ���� ���, H = 6�̹Ƿ� 10 ��° �մ��� 402 ȣ�� �����ؾ� �Ѵ�.
 * ���α׷��� ǥ�� �Է¿��� �Է� �����͸� �޴´�. ���α׷��� �Է��� T ���� �׽�Ʈ �����ͷ� �̷���� �ִµ� T �� �Է��� �� ù �ٿ� �־�����. 
 * �� �׽�Ʈ �����ʹ� �� �����μ� H, W, N, �� ������ �����ϰ� ������ ���� ȣ���� �� ��, �� ���� �� ��, �� ��° �մ������� ��Ÿ����(1 �� H, W �� 99, 1 �� N �� H �� W). 
 * ���α׷��� ǥ�� ��¿� ����Ѵ�. �� �׽�Ʈ �����͸��� ��Ȯ�� �� ���� ����ϴµ�, ������ N ��° �մԿ��� �����Ǿ�� �ϴ� �� ��ȣ�� ����Ѵ�.
 */

public class BJ_10250 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt(); 				//Test case ����
		int H, W, N;
		for(int i = 0; i < T; i++) {
			H = sc.nextInt();
			W = sc.nextInt();
			N = sc.nextInt();
			int count = 0;
			boolean a = false;				//���� break�� ���� boolean����
			int j, k;
			for(j = 1; j <= W; j++) {		//j�� ȣ��
				for(k = 1; k <= H; k++) {	//k�� ����
					count++;
					if(N == count) {
						if(j < 10) {		//j�� 10���� ������ �տ� 0�� ���δ�
							System.out.printf("%d0%d\n", k, j);
							a = true;
							break;
						} else {
							System.out.printf("%d%d\n", k, j);
							a = true;
							break;
						}
					}
				}
				if(a == true) 
					break;
			}
		}
	}

}
