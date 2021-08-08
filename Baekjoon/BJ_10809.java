package Baekjoon;
import java.util.*;

/*알파벳 소문자로만 이루어진 단어 S가 주어진다. 
 * 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 * 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
 * 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
 */

public class BJ_10809 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S;
		S = sc.next();
		char chr_S[] = new char[S.length()];
		char alpha[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
						'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
						'w', 'x', 'y', 'z'};		//알파벳 26자 (소문자)
		
		int alpha_num[] = new int[alpha.length];	//알파벳이 처음나오는 숫자 -1로 초기화
		for(int i =0; i < alpha.length; i++) {
			alpha_num[i] = -1;
		}
		
		for(int i = 0; i < S.length(); i++) {
			chr_S[i] = S.charAt(i);
			for(int j = 0; j < alpha.length; j++) {
				if(alpha[j] == chr_S[i] && alpha_num[j] == -1) {		//처음 등장하는 위치맞는지 확인하기 위해 -1과 비교
					alpha_num[j] = i;
				}
			}
		}
		for(int i = 0; i < alpha.length; i++) {
			System.out.print(alpha_num[i] + " ");
		}
	}
}
