package inflearn_java_algorithm;

import java.util.Scanner;

public class p09_10 {

	static int[][] input = new int[8][8];
	static int cnt = 0;
	
	public void DFS(int i, int j) {

		if(i==7 && j==7) {
			cnt++; // 탈출 도착점
		}
		else {
			if(i-1 >= 1 && input[i-1][j] == 0) { // 자바는 왼쪽부터 평가하기 때문에 경계 체크 먼저 해야 함
				input[i-1][j] = 1;
				DFS(i-1, j);
				input[i-1][j] = 0;
			} 
			if(j+1 <= 7 && input[i][j+1] == 0) {
				input[i][j+1] = 1;
				DFS(i, j+1);
				input[i][j+1] = 0;
			} 
			if(j-1 >= 1 && input[i][j-1] == 0) {
				input[i][j-1] = 1;
				DFS(i, j-1);
				input[i][j-1] = 0;
			} 
			if(i+1 <= 7 && input[i+1][j] == 0) {
				input[i+1][j] = 1;
				DFS(i+1, j);
				input[i+1][j] = 0;
			}
		}					
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p09_10 T = new p09_10();
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= 7; j++) {
				input[i][j] = sc.nextInt();
			}
		}
		
		input[1][1] = 1;
		T.DFS(1, 1);
		System.out.println(cnt);
		

	}

}
