package Baekjoon;
import java.util.*;
/*���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *1. ���̰� ª�� �ͺ���
 *2. ���̰� ������ ���� ������
 *ù° �ٿ� �ܾ��� ���� N�� �־�����. (1 �� N �� 20,000) ��° �ٺ��� N���� �ٿ� ���� ���ĺ� �ҹ��ڷ� �̷���� �ܾ �� �ٿ� �ϳ��� �־�����. �־����� ���ڿ��� ���̴� 50�� ���� �ʴ´�.
 *���ǿ� ���� �����Ͽ� �ܾ���� ����Ѵ�. ��, ���� �ܾ ���� �� �Էµ� ��쿡�� �� ������ ����Ѵ�.
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
		for(String val : word) {							//�ߺ������� my_word ArrayList����
			if(!my_word.contains(val)) {
				my_word.add(val);
			}
		}
		my_word.sort( (a, b) -> a.compareTo(b));
		
		for(int i = 0; i < my_word.size(); i++) {
			System.out.println(my_word.get(i));
		}		
		//input[i].compareTo(null) ������ ���Ŀ� ����. �ҹ��ڷ� �̷����� a.comparto(c) �� �񱳽� -2��ȯ ������ 0 
		
	}
	//Timeover..
	public static void my_sort(ArrayList<String> word) {
		for(int i = 0; i < word.size(); i++) {
			for(int j = i+1; j < word.size(); j++) {
				if(word.get(i).length() > word.get(j).length() || (( word.get(i).length() == word.get(j).length() )&& ( word.get(i).compareTo(word.get(j)) > 0))) {		//���� �� ������ ����
					String temp = word.get(i);
					word.set(i, word.get(j));
					word.set(j, temp);
				} 
			}
		}
	}
}
