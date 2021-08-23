package Baekjoon;
import java.util.*;

/*예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
 * 예를 들어, ljes=njak은 크로아티아 알파벳 6개()로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 * 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
 *단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
 *입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 */

public class BJ_2941 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String getstr = sc.next() + "  ";
		int count = 0; 				//크로아티아 글자 세기
		//최대로 끊어야 하는 글자수 3개이므로 3개씩 끊겠음
		//3개씩 끊고 3개 보고 2개 씩 끊어서 확인
		for(int i = 0; i < getstr.length()-2; i++) {
			String temp = getstr.substring(i, i+3);
			if(temp.equals("dz=")) {
				count++;
				i = i + 2;
				continue;
			} 
			temp = getstr.substring(i, i+2);
			if(temp.equals("c=") || temp.equals("c-") || temp.equals("d-") || temp.equals("lj") 
				|| temp.equals("nj") || temp.equals("s=") || temp.equals("z=")) {
				count++;
				i = i + 1;
				continue;
			} else				//목록에 없는 알파벳
				count++;
		}
		System.out.println(count);
	}
}
