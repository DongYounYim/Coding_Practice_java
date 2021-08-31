package Baekjoon;
import java.util.*;
import java.io.*;

/*땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
 *달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다.
 *또, 정상에 올라간 후에는 미끄러지지 않는다.
 *달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오. 
 *첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
 *첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
 */

public class BJ_2869 {
	public static void main(String args[]) {		//시간을 줄이기 위한 BufferedReader 사용
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] num = br.readLine().split(" ");
			double A = Double.parseDouble(num[0]);
			double B = Double.parseDouble(num[1]);
			double V = Double.parseDouble(num[2]);
			int day = (int) Math.ceil((V - A) / (A - B)) + 1;
			System.out.println(day);
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		/*Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();				//올라간다
		double B = sc.nextInt();				//내려간다
		double V = sc.nextInt();				//정상
		int day = (int) Math.ceil((V - A) / (A - B)) + 1;	//일 수
		System.out.println(day);
	*/}
}
