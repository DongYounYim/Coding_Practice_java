package Baekjoon;
import java.util.*;

/*� �ڿ��� N�� ���� ��, �� �ڿ��� N�� �������� N�� N�� �̷�� �� �ڸ����� ���� �ǹ��Ѵ�. 
 *� �ڿ��� M�� �������� N�� ���, M�� N�� �����ڶ� �Ѵ�. ���� ���, 245�� �������� 256(=245+2+4+5)�� �ȴ�. ���� 245�� 256�� �����ڰ� �ȴ�.
 *����, � �ڿ����� ��쿡�� �����ڰ� ���� ���� �ִ�. �ݴ��, �����ڰ� ���� ���� �ڿ����� ���� �� �ִ�.
 *�ڿ��� N�� �־����� ��, N�� ���� ���� �����ڸ� ���س��� ���α׷��� �ۼ��Ͻÿ�.
 *ù° �ٿ� �ڿ��� N(1 �� N �� 1,000,000)�� �־�����.
 *ù° �ٿ� ���� ����Ѵ�. �����ڰ� ���� ��쿡�� 0�� ����Ѵ�.
 */

public class BJ_2231 {
	public static void main(String args[]) {		//6���� ����� �����µ�
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> digit = new ArrayList<Integer>();
		int result = 0;
		int N = sc.nextInt();
		for(int i = N-1; i > 0; i--) {		//���� ���� �����ڸ� ���ϱ� ���� ū ������ ����������
			int temp = i;
			digit = devide(temp);				
			for(int j = 0; j < digit.size(); j++) {			//�ڸ����� ���� �� ���� ����
				temp += digit.get(j);
			}
			if(N == temp) {				//������ ��������(���ذ�) N�� ��ġ�ϸ� i�� ������
				result = i;
			}
		}
		System.out.println(result);
	}
	
	public static ArrayList<Integer> devide(int N) {			//�ڸ��� ������ �ڸ��� ����Ʈ �����
		ArrayList<Integer> digit = new ArrayList<Integer>();
		if(N/10 != 0) {						// N�� ���ڸ� �� �϶� ó���ϱ� ����
			while(N/10 != 0) {				
				digit.add(N%10);
				N = N/10;
				if(N/10 == 0) {
					digit.add(N);			// ������ �� �ڸ� �� ������ �� �߰�
				}
			}
		} else
			digit.add(N);
		return digit;
	}

}
