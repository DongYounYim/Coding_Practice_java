package Baekjoon;
import java.util.*;

/*�������� �ü������ ũ�ξ�Ƽ�� ���ĺ��� �Է��� ���� ������. ����, ������ ���� ũ�ξ�Ƽ�� ���ĺ��� �����ؼ� �Է��ߴ�.
 * ���� ���, ljes=njak�� ũ�ξ�Ƽ�� ���ĺ� 6��()�� �̷���� �ִ�. �ܾ �־����� ��, �� ���� ũ�ξ�Ƽ�� ���ĺ����� �̷���� �ִ��� ����Ѵ�.
 * ù° �ٿ� �ִ� 100������ �ܾ �־�����. ���ĺ� �ҹ��ڿ� '-', '='�θ� �̷���� �ִ�.
 *�ܾ�� ũ�ξ�Ƽ�� ���ĺ����� �̷���� �ִ�. ���� ������ ǥ�� �����ִ� ���ĺ��� ����� ���·� �Էµȴ�.
 *�Է����� �־��� �ܾ �� ���� ũ�ξ�Ƽ�� ���ĺ����� �̷���� �ִ��� ����Ѵ�.
 */

public class BJ_2941 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String getstr = sc.next() + "  ";
		int count = 0; 				//ũ�ξ�Ƽ�� ���� ����
		//�ִ�� ����� �ϴ� ���ڼ� 3���̹Ƿ� 3���� ������
		//3���� ���� 3�� ���� 2�� �� ��� Ȯ��
		for(int i = 0; i < getstr.length()-2; i++) {
			String temp = getstr.substring(i, i+3);
			if(temp.equals("dz=")) {
				count++;
				i = i + 2;
				continue;
			} 
			temp = getstr.substring(i, i+2);
			if(temp.equals("c=") || temp.equals("c-") || temp.equals("d-") || temp.equals("lj") 
				|| temp.equals("nj") || temp.equals("s=") || temp.equals("z=")) {
				count++;
				i = i + 1;
				continue;
			} else				//��Ͽ� ���� ���ĺ�
				count++;
		}
		System.out.println(count);
	}
}
