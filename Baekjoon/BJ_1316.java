package Baekjoon;
import java.util.*;

/*�׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�.
 *���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
 *�ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 *ù° �ٿ� �ܾ��� ���� N�� ���´�. N�� 100���� �۰ų� ���� �ڿ����̴�. ��° �ٺ��� N���� �ٿ� �ܾ ���´�. 
 *�ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�.
 */

public class BJ_1316 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str = new String[N];
		int count = 0;					//�׷�ܾ� ���� ī��Ʈ
		boolean bool = true;			//�׷�ܾ� ���� �ƴ��� üũ
		for(int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		char[]temp;
		
		for(int i = 0; i < N; i++) {
			temp = new char[str[i].length()];
			for(int j = 0; j < str[i].length(); j++) {
				temp[j] = str[i].charAt(j);			//temp�� str[i] �ܾ� �Է� �ݺ���
			} 
			for(int j = 0; j < str[i].length(); j++) { //temp Ž�� �ݺ���
				for(int k = j+1; k < str[i].length(); k++) {
					//���ϴ� ���ĺ��� ��ġ�ϸ� �� ���ĺ� ���� ���°Ͱ� ����ġ �ϸ� �׷� �ܾ� x
					if(temp[j] == temp[k] && temp[k-1] != temp[k]) {
						//�׷�ܾ �ƴϴ�
						bool = false;
					}
				}
			}
			if(bool) {
				count++;
			} else {
				bool = true; 
			}
		}
		System.out.println(count);
	}

}
