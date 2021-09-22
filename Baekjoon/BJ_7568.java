package Baekjoon;

import java.util.*;

/*�츮�� ����� ��ġ�� Ű�� ������, �� �� ���� ������ ǥ���Ͽ� �� ����� �Űܺ����� �Ѵ�. � ����� �����԰� x kg�̰� Ű�� y cm��� �� ����� ��ġ�� (x, y)�� ǥ�õȴ�. 
 *�� ��� A �� B�� ��ġ�� ���� (x, y), (p, q)��� �� �� x > p �׸��� y > q �̶�� �츮�� A�� ��ġ�� B�� ��ġ���� "�� ũ��"�� ���Ѵ�. 
 *���� ��� � A, B �� ����� ��ġ�� ���� (56, 177), (45, 165) ��� �Ѵٸ� A�� ��ġ�� B���� ū ���� �ȴ�.
 *�׷��� ���� �ٸ� ��ġ���� ũ�⸦ ���� �� ���� ��쵵 �ִ�. 
 *���� ��� �� ��� C�� D�� ��ġ�� ���� (45, 181), (55, 173)�̶�� �����Դ� D�� C���� �� ���̰�, Ű�� C�� �� ũ�Ƿ�, "��ġ"�θ� �� �� C�� D�� ������ ���溸�� �� ũ�ٰ� ���� �� ����.
 *ù �ٿ��� ��ü ����� �� N�� �־�����. �׸��� �̾����� N���� �ٿ��� �� ����� �����Կ� Ű�� ��Ÿ���� ���� ���� x�� y�� �ϳ��� ������ �ΰ� ���� ��Ÿ����.
 *�������� �Է¿� ������ ����� ��ġ ����� ���ؼ� �� ������� ù �ٿ� ����ؾ� �Ѵ�. ��, �� ��ġ ����� ���鹮�ڷ� �и��Ǿ�� �Ѵ�.
 *2 �� N �� 50 / 10 �� x, y �� 200
 */

public class BJ_7568 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Human[] h = new Human[N];
		int rank = 1; // ������ 1�����
		int temp = 0;
		boolean hastemp = false;
		for (int i = 0; i < h.length; i++) { // �ʱ�ȭ
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

	public Human(int height, int weight, int rank) { // ������
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
