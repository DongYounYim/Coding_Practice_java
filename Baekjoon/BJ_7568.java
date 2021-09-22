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
			h[i] = new Human(sc.nextInt(), sc.nextInt(), rank, i);
		}
		sort(h);
		for (int i = 0; i < N-1; i++) {
			if (h[i].getHeight() > h[i+1].getHeight() && h[i].getWeight() > h[i+1].getWeight()) {
				if(hastemp) {	//���������� �ȴ�
					h[i].setRank(rank);
					rank += temp;
					temp = 0;
					hastemp = false;
				} else {
					h[i].setRank(rank);
					rank++;
				}
			} else		//���� ������ �ȵȴ�.
				h[i].setRank(rank);
				hastemp = true;
				temp++;

		}
		// ������ �ڸ��� ��
		if(h[h.length - 2].getHeight() > h[h.length - 1].getHeight() 
				&& h[h.length - 2].getWeight() > h[h.length - 1].getWeight()) {
			h[h.length-1].setRank(rank);
		} else {
			h[h.length-1].setRank(rank + temp);
		}
		//������� ���ĵǾ��ִ»�����
		pre_order(h);
		for (int i = 0; i < N; i++) {
			System.out.println(h[i].getRank());
		}

	}

	public static void sort(Human[] h) {		//����
		for (int i = 0; i < h.length; i++) {
			for (int j = i+1; j < h.length; j++) { // �켱 �ӽ� ����
				if (h[i].getHeight() < h[j].getHeight() && h[i].getWeight() < h[j].getWeight()) {
					Human h1 = h[i];
					h[i] = h[j];
					h[j] = h1;
				}
			}
		}
	}
	
	public static void pre_order(Human[] h) {	//�迭 ������� ������
		for(int i = 0; i < h.length; i++) {
			for(int j = i+1; j < h.length; j++) {
				if(h[i].getOrder() > h[j].getOrder()) {
					Human h1 = h[i];
					h[i] = h[j];
					h[j] = h1;
				}
			}
		}
	}
}

class Human {
	int height;
	int weight;
	int rank;
	int order; // ��������

	public Human(int height, int weight, int rank, int order) { // ������
		this.height = height;
		this.weight = weight;
		this.rank = rank;
		this.order = order;
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
	
	public int getOrder() {
		return order;
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
	
	public void setOrder(int order) {
		this.order = order;
	}

}
