package inflearn_java_algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point { // Queue에 넣을 좌표를 Point 클래스로 정의
	public int x, y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class p09_11 {

	static int[][] input, dis;
	static int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	
	public void BFS(int i, int j) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(i, j));
		input[i][j] = 1;
		int L = 0; 
		
		while(!q.isEmpty()) {
			Point tmp = q.poll();
			for(int k = 0; k < 4; k++) { // 4방향
				int nx = tmp.x + dx[k];
				int ny = tmp.y + dy[k];
				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && input[nx][ny] == 0) {
					input[nx][ny] = 1;
					q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
				}
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p09_11 T = new p09_11();
		Scanner sc = new Scanner(System.in);
		input = new int[8][8];
		dis = new int[8][8];
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= 7; j++) {
				input[i][j] = sc.nextInt();
			}
		}

		T.BFS(1, 1);
		if(dis[7][7] == 0) System.out.println(-1);
		else System.out.print(dis[7][7]);
	}

}
