package Baekjoon;
import java.util.*;
import java.math.*;

/*�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *ù° �ٿ� A�� B�� �־�����. (0 < A,B < 1010000)
 *ù° �ٿ� A+B�� ����Ѵ�.
 */

public class BJ_10757 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String A, B;
		A = sc.next();
		B = sc.next();
		BigInteger big1 = new BigInteger(A);		//Math�Լ��� �ִ� BigInteger���
		BigInteger big2 = new BigInteger(B);		
		
		//���ϴ� add / ���� multiply / divide ��������� / pow�������
		System.out.println(big1.add(big2));
	}
}
