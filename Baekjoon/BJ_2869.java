package Baekjoon;
import java.util.*;
import java.io.*;

/*�� ���� �����̰� �ִ�. �� �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.
 *�����̴� ���� A���� �ö� �� �ִ�. ������, �㿡 ���� �ڴ� ���� B���� �̲�������.
 *��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.
 *�����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 *ù° �ٿ� �� ���� A, B, V�� �������� ���еǾ �־�����. (1 �� B < A �� V �� 1,000,000,000)
 *ù° �ٿ� �����̰� ���� ���븦 ��� �ö󰡴µ� ��ĥ�� �ɸ����� ����Ѵ�.
 */

public class BJ_2869 {
	public static void main(String args[]) {		//�ð��� ���̱� ���� BufferedReader ���
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] num = br.readLine().split(" ");
			double A = Double.parseDouble(num[0]);
			double B = Double.parseDouble(num[1]);
			double V = Double.parseDouble(num[2]);
			int day = (int) Math.ceil((V - A) / (A - B)) + 1;
			System.out.println(day);
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		/*Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();				//�ö󰣴�
		double B = sc.nextInt();				//��������
		double V = sc.nextInt();				//����
		int day = (int) Math.ceil((V - A) / (A - B)) + 1;	//�� ��
		System.out.println(day);
	*/}
}
