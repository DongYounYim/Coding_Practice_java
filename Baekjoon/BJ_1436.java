package Baekjoon;
import java.util.*;

/*666�� ������ ��Ÿ���� ���ڶ�� �Ѵ�. ����, ���� ��Ϲ����� ��ȭ������ 666�� �� ������ ���� ����Ѵ�. ��ȭ���� ���� ������ ���� �̶�� �ø��� ��ȭ�� �����̴�. 
 *���� ��ī���� ��Ÿ��� ���� ��, ��Ÿ���� 1, ��Ÿ���� 2, ��Ÿ���� 3, ��Ÿ���� 4, ��Ÿ���� 5, ��Ÿ���� 6�� ���� �̸��� ������, ���� �轼�� ������ ������ ���� ��, ������ ���� 1, ������ ���� 2, ������ ���� 3�� ���� ��ȭ ������ ������.
 *������ ���� �ڽ��� ���� ��ī���� ���� �轼�� �پ�Ѵ´ٴ� ���� �����ֱ� ���ؼ� ��ȭ ������ �� �ٸ��� ������ �ߴ�.
 *������ ���ڶ� � ���� 6�� ��� 3���̻� �������� ���� ���� ���Ѵ�. ���� ���� ������ ���ڴ� 666�̰�, �� �������� ū ���� 1666, 2666, 3666, .... �� ����.
 *����, ���� ù ��° ��ȭ�� ������ ������ ���� 666, �� ��° ��ȭ�� ������ ������ ���� 1666 �̷��� �̸��� ���� ���̴�. �Ϲ�ȭ�ؼ� �����ϸ�, N��° ��ȭ�� ������ ������ ���� (N��°�� ���� ������ ����) �� ����.
 *���� ���� N��° ��ȭ�� ���� �� ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� �� �ø�� �׻� ���ʴ�� �����, �ٸ� ��ȭ�� ������ �ʴ´�.
 *ù° �ٿ� ���� N�� �־�����. N�� 10,000���� �۰ų� ���� �ڿ����̴�.
 *ù° �ٿ� N��° ��ȭ�� ���� �� ���� ����Ѵ�.
 */

public class BJ_1436 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		//int N = sc.nextInt();
		int result = 0;
		int count = 0;
		int i = 666;
		int temp = 1666;
		int j = 796;
		int k = 6661;
		int y = 6666;
		int max = 66661;
		//���Խ��� �̿��غ���
		String pattern = "^*\\w6{3}$";
		System.out.println(Integer.toString(i).matches(pattern));
		System.out.println(Integer.toString(temp).matches(pattern));
		System.out.println(Integer.toString(j).matches(pattern));
		System.out.println(Integer.toString(k).matches(pattern));
		System.out.println(Integer.toString(y).matches(pattern));
		System.out.println(Integer.toString(max).matches(pattern));
		
		
		/*while(true) {
			if(Integer.toString(i).matches(pattern)) {
				count++;
				result = i;
			}
			//if i�� ���ԽĿ� ������ count�� 1�ø��� result�� i���� �ִ´�.
			
			if(N == count) {
				System.out.println(result);
				break;
			}
			i++;		//���ԽĿ� �µ� �ȸµ� �ϴ� i�� �ϳ��� �ø� �θ�Ʈ���� �˰���
		}*/
	}
}
