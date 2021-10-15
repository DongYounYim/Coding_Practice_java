package Baekjoon;
import java.util.*;
/*ù° �ٿ� ������ ������ �ǹ��ϴ� N(3 �� N �� 200,000)�� �־�����.
 *�״��� �ٿ��� i��° ������ ���߸��� ���� ��� ���� �ǹ��ϴ� ���� Ai(1 �� Ai �� 1,000,000,000)�� ������� �־�����.
 *���������� ����� ��ġ�� ���� -1�� ǥ�õǸ�, ����� ����1 �Ǵ� N�� ��ġ�ϴ� ���� �������� �ʴ´�.
 *�����ڰ� ����� ����߸� �� �ִ� �ּ� ���� ��Ÿ���� ������ ����Ͻÿ�.
 */

public class BJ_18228 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> leftice = new ArrayList<Integer>();
		ArrayList<Integer> rightice = new ArrayList<Integer>();
		boolean peng = false;
		for(int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			if(temp == -1) {
				peng = true;
			} else if(peng) {
				rightice.add(temp);
			} else {
				leftice.add(temp);
			}
		}
		int min = findMin(leftice) + findMin(rightice);
		System.out.println(min);
	}
	
	public static int findMin(ArrayList<Integer> arr) {
		int min = arr.get(0);
		for(int i = 1; i < arr.size(); i++) {
			if(min > arr.get(i))
				min = arr.get(i);
		}
		return min;
	}
	
}
