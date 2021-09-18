 package Baekjoon;
 import java.util.*;
 
 /*�ڿ��� M�� N�� �־��� �� M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ��� �̵� �Ҽ��� �հ� �ּڰ��� ã�� ���α׷��� �ۼ��Ͻÿ�.
  *���� ��� M=60, N=100�� ��� 60�̻� 100������ �ڿ��� �� �Ҽ��� 61, 67, 71, 73, 79, 83, 89, 97 �� 8���� �����Ƿ�, �̵� �Ҽ��� ���� 620�̰�, �ּڰ��� 61�� �ȴ�.
  *�Է��� ù° �ٿ� M��, ��° �ٿ� N�� �־�����.
  *M�� N�� 10,000������ �ڿ����̸�, M�� N���� �۰ų� ����.
  *M�̻� N������ �ڿ��� �� �Ҽ��� ���� ��� ã�� ù° �ٿ� �� ����, ��° �ٿ� �� �� �ּڰ��� ����Ѵ�. 
  *��, M�̻� N������ �ڿ��� �� �Ҽ��� ���� ���� ù° �ٿ� -1�� ����Ѵ�.
  */

public class BJ_2581 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		boolean have_min = false;
		int total = 0;
		int min = -1;
		for(int i = M; i <= N; i++) {
			if(isPrime(i)) {
				if(have_min == false) {
					have_min = true;
					min = i;
				}
				total += i;
			}
		}
		if(have_min == false) {
			System.out.println(min);
		} else {
			System.out.println(total);
			System.out.println(min);
		}
	}
	
	public static boolean isPrime(int num) {
		if(num == 1) {
			return false;
		}
		for(int i = 2; i*i <= num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
