package Baekjoon;
import java.util.*;
import java.math.*;

/*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)
 *첫째 줄에 A+B를 출력한다.
 */

public class BJ_10757 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String A, B;
		A = sc.next();
		B = sc.next();
		BigInteger big1 = new BigInteger(A);		//Math함수에 있는 BigInteger사용
		BigInteger big2 = new BigInteger(B);		
		
		//더하는 add / 곱셈 multiply / divide 나눗셈계산 / pow제곱계산
		System.out.println(big1.add(big2));
	}
}
