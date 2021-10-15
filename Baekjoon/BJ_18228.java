package Baekjoon;
import java.util.*;
/*첫째 줄에 얼음의 개수를 의미하는 N(3 ≤ N ≤ 200,000)이 주어진다.
 *그다음 줄에는 i번째 얼음을 깨뜨리는 데에 드는 힘을 의미하는 정수 Ai(1 ≤ Ai ≤ 1,000,000,000)가 순서대로 주어진다.
 *예외적으로 펭귄이 위치한 곳은 -1로 표시되며, 펭귄이 얼음1 또는 N에 위치하는 경우는 존재하지 않는다.
 *참가자가 펭귄을 떨어뜨릴 수 있는 최소 힘을 나타내는 정수를 출력하시오.
 */

public class BJ_18228 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> leftice = new ArrayList<Integer>();
		ArrayList<Integer> rightice = new ArrayList<Integer>();
		boolean peng = false;
		for(int i = 0; i < N; i++) {
			int temp = sc.nextInt();
			if(temp == -1) {
				peng = true;
			} else if(peng) {
				rightice.add(temp);
			} else {
				leftice.add(temp);
			}
		}
		int min = findMin(leftice) + findMin(rightice);
		System.out.println(min);
	}
	
	public static int findMin(ArrayList<Integer> arr) {
		int min = arr.get(0);
		for(int i = 1; i < arr.size(); i++) {
			if(min > arr.get(i))
				min = arr.get(i);
		}
		return min;
	}
	
}
