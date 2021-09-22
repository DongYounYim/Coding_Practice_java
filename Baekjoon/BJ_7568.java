package Baekjoon;

import java.util.*;

/*우리는 사람의 덩치를 키와 몸무게, 이 두 개의 값으로 표현하여 그 등수를 매겨보려고 한다. 어떤 사람의 몸무게가 x kg이고 키가 y cm라면 이 사람의 덩치는 (x, y)로 표시된다. 
 *두 사람 A 와 B의 덩치가 각각 (x, y), (p, q)라고 할 때 x > p 그리고 y > q 이라면 우리는 A의 덩치가 B의 덩치보다 "더 크다"고 말한다. 
 *예를 들어 어떤 A, B 두 사람의 덩치가 각각 (56, 177), (45, 165) 라고 한다면 A의 덩치가 B보다 큰 셈이 된다.
 *그런데 서로 다른 덩치끼리 크기를 정할 수 없는 경우도 있다. 
 *예를 들어 두 사람 C와 D의 덩치가 각각 (45, 181), (55, 173)이라면 몸무게는 D가 C보다 더 무겁고, 키는 C가 더 크므로, "덩치"로만 볼 때 C와 D는 누구도 상대방보다 더 크다고 말할 수 없다.
 *첫 줄에는 전체 사람의 수 N이 주어진다. 그리고 이어지는 N개의 줄에는 각 사람의 몸무게와 키를 나타내는 양의 정수 x와 y가 하나의 공백을 두고 각각 나타난다.
 *여러분은 입력에 나열된 사람의 덩치 등수를 구해서 그 순서대로 첫 줄에 출력해야 한다. 단, 각 덩치 등수는 공백문자로 분리되어야 한다.
 *2 ≤ N ≤ 50 / 10 ≤ x, y ≤ 200
 */

public class BJ_7568 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Human[] h = new Human[N];
		int rank = 1; // 순위는 1등부터
		int temp = 0;
		boolean hastemp = false;
		for (int i = 0; i < h.length; i++) { // 초기화
			h[i] = new Human(sc.nextInt(), sc.nextInt(), rank);
		}
		for (int i = 0; i < h.length; i++) {
			int plus_rank = 0;
			for (int j = 0; j < h.length; j++) {
				if (h[i].getHeight() < h[j].getHeight() && h[i].getWeight() < h[j].getWeight()) {
					plus_rank++;
				}
			}
			h[i].setRank(rank + plus_rank);
		}

		for (int i = 0; i < h.length; i++) {
			System.out.println(h[i].getRank());
		}
	}

}

class Human {
	int height;
	int weight;
	int rank;

	public Human(int height, int weight, int rank) { // 생성자
		this.height = height;
		this.weight = weight;
		this.rank = rank;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public int getRank() {
		return rank;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
