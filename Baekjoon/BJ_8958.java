package Baekjoon;
import java.util.*;

/*"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. 
 ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
 "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
 OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

public class BJ_8958 {
	public static void main(String args[]) {
		int array_num; 						//Test���̽� ����
		int score = 0;
		Scanner sc = new Scanner(System.in);
		array_num = sc.nextInt();
		
		String[] OX_array = new String[array_num];  //Test���̽� �迭�� ����
		int[] OX_score = new int[array_num];		//�� ���̽������� ���� ����
		for(int i = 0; i < array_num; i++) {  		//�� Test���̽� �迭�� OX�Է�
			OX_array[i] = sc.next();
		}
		for(int j = 0; j < array_num; j++) {
			for(int i = 0; i < OX_array[j].length(); i++) {
				//�� Test���̽��� OXã��
				if(OX_array[j].charAt(i) == 'O') {
					score++;
					OX_score[j] = OX_score[j] + score;
				} else if(OX_array[j].charAt(i) != 'O') {		//X�� ���ý� �޺� ���� �ʱ�ȭ
					score = 0;
				}
			}
			score = 0; 							//���̽� �ϳ� ����� �޺� �ʱ�ȭ
			System.out.println(OX_score[j]);
		}
	}
}
