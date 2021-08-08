package Baekjoon;
import java.util.*;

/*� ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
 * ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. 
 * N�� �־����� ��, 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */

// �������� N�� 1000������ ����.
public class BJ_1065 {
	public static void main(String args[]) {
		int N;
		int count = 0;								//N���� ���� �Ѽ��� ���� ī��Ʈ
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			if(hansoo(i)) {							//�Ѽ��� ������ count ���
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static Boolean hansoo(int x) {				//1000������ �ڿ����� �̿��� �� �ִ� �Լ�
		String X = Integer.toString(x);
		if(X.length() == 3) {
			char a = X.charAt(0); 				//�����ڸ�
			char b = X.charAt(1);				//�����ڸ�
			char c = X.charAt(2);				//�����ڸ�
			int sum1 = (int) a - (int) b;		//�� �ڸ����� ��, �� ���
			int sum2 = (int) b - (int) c;
			if(sum1 == sum2) {		
				return true;
			} else
				return false;
		}
		if(X.length() == 4) {					//1000�� �Ѽ��� �ƴϴ�
			return false;
		}
		return true;
	}
}
