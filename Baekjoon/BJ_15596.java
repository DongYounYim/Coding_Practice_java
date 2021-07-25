package Baekjoon;
import java.util.*;

public class BJ_15596 {
	long sum(int[] a) {
		long sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

}
