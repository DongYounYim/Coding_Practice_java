package Baekjoon;
import java.util.*;

/*�̿� ���� ������ �м����� 1/1 �� 1/2 �� 2/1 �� 3/1 �� 2/2 �� �� �� ���� ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
 *X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *ù° �ٿ� X(1 �� X �� 10,000,000)�� �־�����.
 *ù° �ٿ� �м��� ����Ѵ�.
 */

public class BJ_1193 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int get = sc.nextInt();
		int sum = 3;
		int upper = 1;
		int lower = 2;
		int count = 2;
		if(get ==  1) {
			upper = 1;
			lower = 1;
		} else {
			for(; count < get; count++) {
				if(sum == upper + lower) { 
					if(sum%2 == 0) {		//���� ¦ ���̸� �и� Ŀ��
						upper--;
						lower++;
					} else {				//Ȧ ���̸� ���ڰ� Ŀ�� 
						upper++;
						lower--;
					}
					if(upper == 0)   {		//�پ��� 0�̵Ǹ� 1�� �ʱ�ȭ
						upper = 1;
						count--;
					}
					if(lower == 0) {
						lower = 1;
						count--;
					}
				} else {
					sum++;					//sum���� Ŀ���� �ø�. upper, lower����
				}
			}
		}
		//��Ģ 1/1 | 1/2 2/1 | 3/1 2/2 1/3 | 1/4 2/3 3/2 4/1 | 
		//     2  |    3    |      4      |        5		//temp
		// �и� ������ ���� 1�� �þ��. ������ 1�� �þ��.
		// 1 / 2 3 / 4 5 6 / 7 8 9 10  						//(temp - 1)
		System.out.print(upper + "/" + lower);
	}

}
