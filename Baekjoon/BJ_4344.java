package Baekjoon;
import java.util.*;

public class BJ_4344 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int C; 					//Test 케이스 갯수
		C = sc.nextInt();
		int sum = 0;				//점수의 합
		double value = 0;				//평균값
		int value_over = 0;				//평균값 넘는 학생 수
		double value_over_stu = 0;		//평균값 넘는 학생 비율
		
		int Stu_num[] = new int[C];		//학생의 수(점수)
		for(int i = 0; i < C; i++) {
			Stu_num[i] = sc.nextInt();	//각 케이스 별 학생 수 입력
			int Stu_score[] = new int[Stu_num[i]];	//각 케이스 별 학생 수 만큼 점수 입력 가능한 배열 선언
			for(int j = 0; j < Stu_num[i]; j++) {	//각 케이스 별 점수 입력
				Stu_score[j] = sc.nextInt();
			}
			for(int j = 0; j < Stu_num[i]; j++) {	//각 케이스 별 점수 합산
				sum = sum + Stu_score[j];
			}
			value = sum / Stu_num[i];				//평균 값 계산
			for(int j = 0; j < Stu_num[i]; j++) {
				if(Stu_score[j] > value) {
					value_over++;
				}
			}
			value_over_stu = (double) value_over / Stu_num[i] * 100;
			System.out.printf("%.3f" ,value_over_stu);
			System.out.println("%");
			sum = 0; value = 0; value_over = 0; value_over_stu = 0;		//초기화
		}
	}
}
