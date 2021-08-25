package Baekjoon;
import java.util.*;

/*그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
 *예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 *단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오. 
 *첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 
 *단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
 */

public class BJ_1316 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] str = new String[N];
		int count = 0;					//그룹단어 갯수 카운트
		boolean bool = true;			//그룹단어 인지 아닌지 체크
		for(int i = 0; i < N; i++) {
			str[i] = sc.next();
		}
		char[]temp;
		
		for(int i = 0; i < N; i++) {
			temp = new char[str[i].length()];
			for(int j = 0; j < str[i].length(); j++) {
				temp[j] = str[i].charAt(j);			//temp에 str[i] 단어 입력 반복문
			} 
			for(int j = 0; j < str[i].length(); j++) { //temp 탐색 반복문
				for(int k = j+1; k < str[i].length(); k++) {
					//비교하는 알파벳과 일치하며 그 알파벳 전에 나온것과 불일치 하면 그룹 단어 x
					if(temp[j] == temp[k] && temp[k-1] != temp[k]) {
						//그룹단어가 아니다
						bool = false;
					}
				}
			}
			if(bool) {
				count++;
			} else {
				bool = true; 
			}
		}
		System.out.println(count);
	}

}
