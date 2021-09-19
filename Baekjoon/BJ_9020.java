package Baekjoon;

import java.util.*;
import java.math.*;

/*1���� ū �ڿ��� �߿���  1�� �ڱ� �ڽ��� ������ ����� ���� �ڿ����� �Ҽ���� �Ѵ�. ���� ���, 5�� 1�� 5�� ������ ����� ���� ������ �Ҽ��̴�. 
 *������, 6�� 6 = 2 �� 3 �̱� ������ �Ҽ��� �ƴϴ�.
 *�������� ������ ������ �������� ���ذ� ������, 2���� ū ��� ¦���� �� �Ҽ��� ������ ��Ÿ�� �� �ִٴ� ���̴�. �̷��� ���� ������ ����� �Ѵ�. ��, ¦���� �� �Ҽ��� ������ ��Ÿ���� ǥ���� �� ���� ������ ��Ƽ���̶�� �Ѵ�. 
 *���� ���, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7�̴�. 10000���� �۰ų� ���� ��� ¦�� n�� ���� ������ ��Ƽ���� �����Ѵ�.
 *2���� ū ¦�� n�� �־����� ��, n�� ������ ��Ƽ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 *���� ������ n�� ������ ��Ƽ���� ���� ������ ��쿡�� �� �Ҽ��� ���̰� ���� ���� ���� ����Ѵ�.
 *ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ� ¦�� n�� �־�����.
 *�� �׽�Ʈ ���̽��� ���ؼ� �־��� n�� ������ ��Ƽ���� ����Ѵ�. ����ϴ� �Ҽ��� ���� �ͺ��� ���� ����ϸ�, �������� �����Ѵ�.
 */

public class BJ_9020 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // T�� �׽�Ʈ ���̽�
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt(); // ¦�� n
			// n = prime + prime;
			int prime_1 = 0;
			int prime_2 = 0;
			int minus_1 = 0;
			int minus_2 = 0;
			boolean egit = false;
			for (int j = 2; j < n; j++) {
				if (isPrime(j) && isPrime(n - j)) {
					if(minus_1 != 0) {
						egit = true;
					}
					if(egit) {
						minus_2 = Math.abs(2*j - n);
						if(minus_2 < minus_1) {
							prime_1 = j;
							prime_2 = n - j;
							minus_1 = minus_2;		//�ּҰ��� �ɷ� ����
						}
					} else {	//��찡 1���϶��� �̰͸� �����
						prime_1 = j;
						prime_2 = n - j;
						minus_1 = Math.abs(2*j - n);
					}
				}
			}
			System.out.println(prime_1 + " " + prime_2);
		}
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
