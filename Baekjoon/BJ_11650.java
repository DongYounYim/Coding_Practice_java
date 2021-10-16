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
		Arrays.sort(xy, new Comparator<int[]>() {	//Comparator�� �̿��� 2���� �迭 ����
			@Override
			public int compare(int[] t1, int[] t2) {
				if(t1[0] == t2[0])					//���� ���� ������ �ڿ� ���� ��
					return t1[1] - t2[1];			//�������� (���������̸� t2[1] - t1[1];
				else
					return t1[0] - t2[0];
			}
		});
		for(int i = 0; i < N; i++) {		//���ĵ� ��ǥ ���
			bw.write(xy[i][0] + " " + xy[i][1]);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		
	}
}

