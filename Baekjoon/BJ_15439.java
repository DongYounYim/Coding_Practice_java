package Baekjoon;
import java.util.*;

/*Vera owns N tops and N pants. The i-th top and i-th pants have colour i, for 1 ¡Â i ¡Â N, where all N colours are different from each other.
 *An outfit consists of one top and one pants. Vera likes outfits where the top and pants are not the same colour.
 *How many different outfits does she like? 
 */

public class BJ_15439 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(N * (N-1));
	}
}
