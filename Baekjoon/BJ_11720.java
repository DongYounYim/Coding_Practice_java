package Baekjoon;
import java.util.*;

/*N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *ù° �ٿ� ������ ���� N (1 �� N �� 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����.
  �Է����� �־��� ���� N���� ���� ����Ѵ�.
 */

public class BJ_11720 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N;
		String N_by_n;				//String������ ���ڸ� ����.
		int sum = 0;
		N = sc.nextInt();
		N_by_n = sc.next();
		char chr[] = new char[N];	//�� �ڸ��� ���ڸ� char������ �����ϴ� �迭
		for(int i = 0; i < N; i++) {
			chr[i] = N_by_n.charAt(i);
			sum = sum + Character.getNumericValue(chr[i]);
				//Character.getNumvericValue(char) ĳ�������� ���ڸ� int������ ��ȯ
		}
		System.out.println(sum);
	}

}
