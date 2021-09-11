package Baekjoon;
import java.util.*;

/*어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 
 *어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다.
 *물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
 *자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
 *첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
 *첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
 */

public class BJ_2231 {
	public static void main(String args[]) {		//6부터 제대로 나오는듯
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> digit = new ArrayList<Integer>();
		int result = 0;
		int N = sc.nextInt();
		for(int i = N-1; i > 0; i--) {		//가장 작은 생성자를 구하기 위해 큰 값부터 작은값까지
			int temp = i;
			digit = devide(temp);				
			for(int j = 0; j < digit.size(); j++) {			//자릿수를 원래 수 값에 더함
				temp += digit.get(j);
			}
			if(N == temp) {				//더해진 원본값과(분해값) N이 일치하면 i는 생성자
				result = i;
			}
		}
		System.out.println(result);
	}
	
	public static ArrayList<Integer> devide(int N) {			//자릿수 나눠서 자릿수 리스트 만들기
		ArrayList<Integer> digit = new ArrayList<Integer>();
		if(N/10 != 0) {						// N이 한자릿 수 일때 처리하기 위해
			while(N/10 != 0) {				
				digit.add(N%10);
				N = N/10;
				if(N/10 == 0) {
					digit.add(N);			// 마지막 한 자릿 수 남았을 때 추가
				}
			}
		} else
			digit.add(N);
		return digit;
	}

}
