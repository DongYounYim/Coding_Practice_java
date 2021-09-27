package Baekjoon;
import java.util.*;
import java.io.*;

/*2���� ��� ���� �� N���� �־�����. ��ǥ�� x��ǥ�� �����ϴ� ������, x��ǥ�� ������ y��ǥ�� �����ϴ� ������ ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *ù° �ٿ� ���� ���� N (1 �� N �� 100,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� i������ ��ġ xi�� yi�� �־�����. (-100,000 �� xi, yi �� 100,000) ��ǥ�� �׻� �����̰�, ��ġ�� ���� �� ���� ����.
 *ù° �ٺ��� N���� �ٿ� ���� ������ ����� ����Ѵ�.
 */

public class BJ_11650 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[][] xy = new int[N][2];
		for(int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");
			for(int j = 0; j < 2; j++) {
				xy[i][j] = Integer.parseInt(str[j]);
			}
		}
		br.close();
		sort(xy, N);
		for(int i = 0; i < N; i++) {		//���ĵ� ��ǥ ���
			bw.write(xy[i][0] + " " + xy[i][1]);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		
	}
	
	public static void sort(int[][] a, int N) {
		for(int i = 0; i < N; i++) {
			for(int j = i+1; j < N; j++) {
				if(a[i][0] > a[j][0] || (a[i][0] == a[j][0] && a[i][1] > a[j][1])) {			//x ��ǥ ��
					int temp_x = a[i][0];
					int temp_y = a[i][1];
					a[i][0] = a[j][0];
					a[i][1] = a[j][1];
					a[j][0] = temp_x;
					a[j][1] = temp_y;
				} 
			}
		}
	}
}

