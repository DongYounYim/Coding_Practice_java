package Baekjoon;
import java.util.*;

public class BJ_10179 {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		double[] db = new double[T];
		for(int i = 0; i < T; i++) {
			db[i] = sc.nextDouble();
			db[i] = db[i]/100 * 80;
		}
		for(int i = 0; i < T; i++) {
			System.out.printf("$%.2f\n", db[i]);
		}
	}
}
