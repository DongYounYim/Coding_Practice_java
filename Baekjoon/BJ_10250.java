package Baekjoon;
import java.util.*;

/*�������� �ۼ��� ���α׷��� �ʱ⿡ ��� ���� ����ִٰ� �����Ͽ� �� ��å�� ���� N ��°�� ������ �մԿ��� ������ �� ��ȣ�� ����ϴ� ���α׷��̴�. ù ��° �մ��� 101 ȣ, �� ��° �մ��� 201 ȣ ��� ���� �����Ѵ�. 
 * �׸� 1 �� ��츦 ���� ���, H = 6�̹Ƿ� 10 ��° �մ��� 402 ȣ�� �����ؾ� �Ѵ�.
 * ���α׷��� ǥ�� �Է¿��� �Է� �����͸� �޴´�. ���α׷��� �Է��� T ���� �׽�Ʈ �����ͷ� �̷���� �ִµ� T �� �Է��� �� ù �ٿ� �־�����. 
 * �� �׽�Ʈ �����ʹ� �� �����μ� H, W, N, �� ������ �����ϰ� ������ ���� ȣ���� �� ��, �� ���� �� ��, �� ��° �մ������� ��Ÿ����(1 �� H, W �� 99, 1 �� N �� H �� W). 
 * ���α׷��� ǥ�� ��¿� ����Ѵ�. �� �׽�Ʈ �����͸��� ��Ȯ�� �� ���� ����ϴµ�, ������ N ��° �մԿ��� �����Ǿ�� �ϴ� �� ��ȣ�� ����Ѵ�.
 */

public class BJ_10250 {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int T = sc.nextInt(); 				//Testcase�� ����
		int[][] Hotel;
		for(int i = 0; i < T; i++) {
			int temp = 0;					//�ʱ�ȭ
			int count = 0;
			int H = sc.nextInt();			//�� ���� ��
			int W = sc.nextInt();			//ȣ���� ����
			int N = sc.nextInt();			//���° �մ�����
			Hotel = mkroom(W, H);
			for(int j = 0; j < N; j++) {
				temp = j;
				if(temp%H == 0 && temp != 0) {
					count++;
				}
			}
			temp = temp - H * count; 
			System.out.println(Hotel[temp][count]);
			//Hotel[
		}
		
	}
	
	public static int[][] mkroom(int a, int b) {
		int[][] Hotel = new int[a][b];
		String temp;
		for(int j = 0; j < b; j++) {
			for(int i = 0; i < a; i++) {
				//õ�� , �����ڸ��� ����, ��,�����ڸ��� �� ���� ���� �ö󰣴�.
				if(j < 10) {		//index�� 0���� �����̶� +1�� ����
					temp = Integer.toString(i+1) + "0" + Integer.toString(j+1);
				} else
					temp = Integer.toString(i+1) + Integer.toString(j+1);
				Hotel[i][j] = Integer.parseInt(temp);
			}
		}
		return Hotel;
	}

}
