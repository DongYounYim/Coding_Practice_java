package Baekjoon;
import java.util.*;

/*우현이는 어린 시절, 지구 외의 다른 행성에서도 인류들이 살아갈 수 있는 미래가 오리라 믿었다.
 *그리고 그가 지구라는 세상에 발을 내려 놓은 지 23년이 지난 지금, 세계 최연소 ASNA 우주 비행사가 되어 새로운 세계에 발을 내려 놓는 영광의 순간을 기다리고 있다.
 *그가 탑승하게 될 우주선은 Alpha Centauri라는 새로운 인류의 보금자리를 개척하기 위한 대규모 생활 유지 시스템을 탑재하고 있기 때문에, 그 크기와 질량이 엄청난 이유로 최신기술력을 총 동원하여 개발한 공간이동 장치를 탑재하였다.
 *하지만 이 공간이동 장치는 이동 거리를 급격하게 늘릴 경우 기계에 심각한 결함이 발생하는 단점이 있어서, 이전 작동시기에 k광년을 이동하였을 때는 k-1 , k 혹은 k+1 광년만을 다시 이동할 수 있다. 
 *예를 들어, 이 장치를 처음 작동시킬 경우 -1 , 0 , 1 광년을 이론상 이동할 수 있으나 사실상 음수 혹은 0 거리만큼의 이동은 의미가 없으므로 1 광년을 이동할 수 있으며, 
 *그 다음에는 0 , 1 , 2 광년을 이동할 수 있는 것이다. ( 여기서 다시 2광년을 이동한다면 다음 시기엔 1, 2, 3 광년을 이동할 수 있다. )
 *김우현은 공간이동 장치 작동시의 에너지 소모가 크다는 점을 잘 알고 있기 때문에 x지점에서 y지점을 향해 최소한의 작동 횟수로 이동하려 한다. 
 *하지만 y지점에 도착해서도 공간 이동장치의 안전성을 위하여 y지점에 도착하기 바로 직전의 이동거리는 반드시 1광년으로 하려 한다.
 *김우현을 위해 x지점부터 정확히 y지점으로 이동하는데 필요한 공간 이동 장치 작동 횟수의 최솟값을 구하는 프로그램을 작성하라.
 *입력의 첫 줄에는 테스트케이스의 개수 T가 주어진다. 각각의 테스트 케이스에 대해 현재 위치 x 와 목표 위치 y 가 정수로 주어지며, x는 항상 y보다 작은 값을 갖는다. (0 ≤ x < y < 231)
 *각 테스트 케이스에 대해 x지점으로부터 y지점까지 정확히 도달하는데 필요한 최소한의 공간이동 장치 작동 횟수를 출력한다.
 */

public class BJ_1011 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] go = { 0, 1, 2 }; // 처음에 무조건 1을 이동한다고 가정
		int x;
		int y;
		int count = 1;
		for (int i = 0; i < T; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			int distan = y - x - 1; // 1을 이동하고 남은거리
			while (true) {
				if (distan == 0) { // 거리 1만 이동할 때.
					break;
				} else if (distan == 1) { // 거리 2 이동할 때.
					count++;
					break;
				} else if (distan == 2) { // 거리가 3 이동할 때, 무조건 1만큼 두 번 이동하고 끝나야함
					count = count + 2;
					break;
				} else { // 거리 4이상 이동할 때 적용
					if(distan > add(go[2])) {	//현재 이동 최대값부터 1까지 더할때 까지보다 distan이 크면 무조건 최대값 이동.
						distan -= go[2];
						count++;
						arr_(go, 1);
					} else if(distan == add(go[2])) {	//최대 값 부터 1까지 더할때까지와 딱 맞아떨어지면? 최대값이 5다 그럼 5 4 3 2 1로 딱 떨어질꺼 아냐 그럼 count가 딱 5네
						count = count + go[2];
						break;
					} else if(distan > add(go[1])) {
						distan -= go[1];
						count++;
					} else if(distan == add(go[1])) {
						count = count + go[1];
						break;
					} else if(distan > add(go[0])) {
						distan -= go[0];
						count++;
						arr_(go, -1);
					} else if(distan == add(go[0])) {
						count = count + go[0];
						break;
					} 
				}

			}
			System.out.println(count);
			count = 1; // 테스트 한개 후 초기화
		}

	}
	// 남은 거리는 배열의 마지막의 N부터 1까지 더한다.
	// 처음에 1을 이동하면 {0, 1, 2}
	// 그 다음 2를 이동하면 {1, 2, 3}
	// 남은거리 계산해서 6이상이면 3이동 5이면 2이동 2이동 1이동
	// 만약 3을 이동했다 {2, 3, 4} 남은 이상이면 4+3+2+1 = 10
	// 만약 4를 이동했따 {3, 4, 5} 5+4+3+2+1 = 15
	// 시간초과 났다요

	public static int add(int n) { // n부터 1까지의 합
		int s = 0;
		for (int i = 1; i <= n; i++) {
			s += i;
		}
		return s;
	}

	public static void arr_(int[] a, int nu) { // 배열변동
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] + nu;
		}
	}

}
