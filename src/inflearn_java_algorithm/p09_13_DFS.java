package inflearn_java_algorithm;

import java.util.Scanner;

public class p09_13_DFS {

	static int[][] island;
	static int num;
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	static int answer = 0;
	
	public void DFS(int x, int y) { // 연결된 1을 전부 0으로 변경 
		island[x][y] = 0;

	    for(int i = 0; i < 8; i++) {
	        int nx = x + dx[i];
	        int ny = y + dy[i];

	        if(nx>=0 && nx<num && ny>=0 && ny<num && island[nx][ny] == 1) {
	            DFS(nx, ny);
	        }
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p09_13_DFS T = new p09_13_DFS();
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt(); //7
		island = new int[num][num];
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				island[i][j] = sc.nextInt();
			}
		}
		
//		T.DFS(0, 0); 
		for(int i = 0; i < num; i++) {
		    for(int j = 0; j < num; j++) {
		        if(island[i][j] == 1) {
		            answer++;
		            T.DFS(i, j); // 섬 전체 0으로 변경
		        }
		    }
		}
		
		System.out.print(answer);
		
	}

}
