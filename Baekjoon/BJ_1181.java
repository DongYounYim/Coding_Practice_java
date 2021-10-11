package Baekjoon;
import java.util.*;
/*알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
 *1. 길이가 짧은 것부터
 *2. 길이가 같으면 사전 순으로
 *첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.
 *조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
 */

public class BJ_1181 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<String> word = new ArrayList<String>();
		for(int i = 0; i < N; i++) {
			word.add(sc.next());
		}
		ArrayList<String> my_word = new ArrayList<String>();
		for(String val : word) {							//중복제거한 my_word ArrayList만듦
			if(!my_word.contains(val)) {
				my_word.add(val);
			}
		}
		my_word.sort( (a, b) -> a.compareTo(b));
		
		for(int i = 0; i < my_word.size(); i++) {
			System.out.println(my_word.get(i));
		}		
		//input[i].compareTo(null) 사전순 정렬에 유용. 소문자로 이뤄져서 a.comparto(c) 와 비교시 -2반환 같으면 0 
		
	}
	//Timeover..
	public static void my_sort(ArrayList<String> word) {
		for(int i = 0; i < word.size(); i++) {
			for(int j = i+1; j < word.size(); j++) {
				if(word.get(i).length() > word.get(j).length() || (( word.get(i).length() == word.get(j).length() )&& ( word.get(i).compareTo(word.get(j)) > 0))) {		//길이 및 사전순 정렬
					String temp = word.get(i);
					word.set(i, word.get(j));
					word.set(j, temp);
				} 
			}
		}
	}
}
