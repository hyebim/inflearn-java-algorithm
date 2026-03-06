package inflearn_java_algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//class Point { 
//	public int x, y;
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}

public class p09_13 {

	static int[][] island;
	static Queue<Point> q = new LinkedList<>();
	static int num;
	static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
	static int answer = 0;
	
	public void BFS(int x, int y) {
		q.offer(new Point(x, y));
		island[x][y] = 0;
		
		while(!q.isEmpty()) {
			Point tmp = q.poll(); // 2. 꺼내야함 
			for(int i = 0; i < 8; i++) { // 대각선 포함 8방향
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx>=0 && nx<num && ny>=0 && ny<num && island[nx][ny]==1) {
					island[nx][ny] = 0; // 다시 방문하지 못하도록 0으로 변경
					q.offer(new Point(nx, ny));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p09_13 T = new p09_13();
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt(); //7
		island = new int[num][num];
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				island[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				if(island[i][j] == 1) {
					answer++;
					q.offer(new Point(i, j));
				    island[i][j] = 0;
					T.BFS(i, j); // 1. 여기서 일단 넣었으니까 
				}
			}
		}
		
		System.out.print(answer);
	}

}
