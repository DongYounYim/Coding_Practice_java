package Baekjoon;
import java.util.*;

/* 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
 * 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 */

public class BJ_11654 {
	public static void main(String args[]) {
		//형 변환을 이용한 아스키 코드값 받기.
		Scanner sc = new Scanner(System.in);
		int ascii;
		char input;
		
		input = sc.next().charAt(0);
		ascii = (int) input;
		
		System.out.println(ascii);
	}
}
