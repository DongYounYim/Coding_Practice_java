package Baekjoon;
import java.util.*;

public class BJ_4344 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int C; 					//Test ���̽� ����
		C = sc.nextInt();
		int sum = 0;				//������ ��
		double value = 0;				//��հ�
		int value_over = 0;				//��հ� �Ѵ� �л� ��
		double value_over_stu = 0;		//��հ� �Ѵ� �л� ����
		
		int Stu_num[] = new int[C];		//�л��� ��(����)
		for(int i = 0; i < C; i++) {
			Stu_num[i] = sc.nextInt();	//�� ���̽� �� �л� �� �Է�
			int Stu_score[] = new int[Stu_num[i]];	//�� ���̽� �� �л� �� ��ŭ ���� �Է� ������ �迭 ����
			for(int j = 0; j < Stu_num[i]; j++) {	//�� ���̽� �� ���� �Է�
				Stu_score[j] = sc.nextInt();
			}
			for(int j = 0; j < Stu_num[i]; j++) {	//�� ���̽� �� ���� �ջ�
				sum = sum + Stu_score[j];
			}
			value = sum / Stu_num[i];				//��� �� ���
			for(int j = 0; j < Stu_num[i]; j++) {
				if(Stu_score[j] > value) {
					value_over++;
				}
			}
			value_over_stu = (double) value_over / Stu_num[i] * 100;
			System.out.printf("%.3f" ,value_over_stu);
			System.out.println("%");
			sum = 0; value = 0; value_over = 0; value_over_stu = 0;		//�ʱ�ȭ
		}
	}
}
