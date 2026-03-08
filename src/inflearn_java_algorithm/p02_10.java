package inflearn_java_algorithm;

import java.util.Scanner;

public class p02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[][] = new int[num+2][num+2];
		int dx[] = {-1, 0, 1, 0};
		int dy[] = {0, 1, 0, -1};
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int nx = 0; // 인덱스 의미
		int ny = 0;
		int answer = 0;
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				int max = arr[i][j];
				boolean flag = true;
				for(int k = 0; k < 4; k++) {
					nx = i + dx[k];
					ny = j + dy[k];
					if(arr[nx][ny] >= arr[i][j]) {
						flag = false;
						break;
					}
				}
				if(flag) answer++;
			}
		}

		System.out.print(answer);
	}

}
