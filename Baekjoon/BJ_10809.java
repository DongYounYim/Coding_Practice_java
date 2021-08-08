package Baekjoon;
import java.util.*;

/*���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. 
 * ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 * ������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ� ����Ѵ�.
 * ����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��° ��ġ�̴�.
 */

public class BJ_10809 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S;
		S = sc.next();
		char chr_S[] = new char[S.length()];
		char alpha[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
						'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
						'w', 'x', 'y', 'z'};		//���ĺ� 26�� (�ҹ���)
		
		int alpha_num[] = new int[alpha.length];	//���ĺ��� ó�������� ���� -1�� �ʱ�ȭ
		for(int i =0; i < alpha.length; i++) {
			alpha_num[i] = -1;
		}
		
		for(int i = 0; i < S.length(); i++) {
			chr_S[i] = S.charAt(i);
			for(int j = 0; j < alpha.length; j++) {
				if(alpha[j] == chr_S[i] && alpha_num[j] == -1) {		//ó�� �����ϴ� ��ġ�´��� Ȯ���ϱ� ���� -1�� ��
					alpha_num[j] = i;
				}
			}
		}
		for(int i = 0; i < alpha.length; i++) {
			System.out.print(alpha_num[i] + " ");
		}
	}
}
