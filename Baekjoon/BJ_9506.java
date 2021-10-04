package Baekjoon;
import java.util.*;

/*� ���� n�� �ڽ��� ������ ��� ������� �հ� ������, �� ���� ��������� �Ѵ�. 
 *���� ��� 6�� 6 = 1 + 2 + 3 ���� �������̴�.
 *n�� ���������� �ƴ��� �Ǵ����ִ� ���α׷��� �ۼ��϶�.
 *�Է��� �׽�Ʈ ���̽����� �� �� �������� n�� �־�����. (2 < n < 100, 000)
 *�Է��� �������� -1�� �־�����.
 *�׽�Ʈ���̽� ���� ���ٿ� �ϳ��� ����ؾ� �Ѵ�.
 *n�� ���������, n�� n�� �ƴ� ������� ������ ��Ÿ���� ����Ѵ�(���� ��� ����).
 *�̶�, ������� ������������ �����ؾ� �Ѵ�.
 *n�� �������� �ƴ϶�� n is NOT perfect. �� ����Ѵ�.
 */
public class BJ_9506 {
	static ArrayList<Integer> tempnum = new ArrayList<Integer>();
	public static void main(String args[]) {
		Scanner sc = new  Scanner(System.in);
		int test;
		while(true) {
			test = sc.nextInt();
			if(test == -1) {
				break;
			}
			if(isPerfect(test)) {
				System.out.print(test + " = ");
				for(int i = 0; i < tempnum.size()-1; i++) {
					System.out.print(tempnum.get(i) + " + ");
				}
				System.out.println(tempnum.get(tempnum.size() - 1));
			} else {
				System.out.println(test + " is NOT perfect.");
			}
			//�ݺ����� ���� �� �������� arraylist�ʱ�ȭ
			tempnum.clear();
		}
	}
	
	public static boolean isPerfect(int t) {
		int sum = 0;
		for(int i = 1; i <= t/2; i++) {
			if(t%i == 0) {
				tempnum.add(i);
			}
		}
		for(int i = 0; i < tempnum.size(); i++) {
			sum += tempnum.get(i);
		}
		if(t == sum) {
			return true;
		} else
			return false;
	}
}
