package Baekjoon;

import java.util.*;

/*이 아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다” 는 계약 조항을 꼭 지키고 들어와야 한다.
 *아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라. 
 *단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.
 *첫 번째 줄에 Test case의 수 T가 주어진다. 그리고 각각의 케이스마다 입력으로 첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다
 *각각의 Test case에 대해서 해당 집에 거주민 수를 출력하라.
 *1 ≤ k, n ≤ 14
 */

public class BJ_2775 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int k, n;

		int[][] base = new int[16][16]; // 0호에는 아무도 안살아서 상관없어서 15
		for (int i = 0; i < 16; i++) {
			base[0][i] = i; // 0층 i호에는 i명만큼산다.
			base[i][0] = 0; // 각층 0호에는 0명
		}
		for (int i = 1; i < 15; i++) {
			for (int j = 1; j < 15; j++) { // 각 층수에 2차원 배열 완성
				base[i][j] = base[i][j - 1] + base[i - 1][j];
			}
		}
		for (int t = 0; t < T; t++) { // 테스트 케이스 만큼 반복
			k = sc.nextInt(); // k는 구하려는층수
			n = sc.nextInt(); // n는 구하려는호수
			System.out.println(base[k][n]);
		}
	}
}
