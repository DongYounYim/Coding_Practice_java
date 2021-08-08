package Baekjoon;
import java.util.*;

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
