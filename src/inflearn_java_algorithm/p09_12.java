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

public class p09_12 {

	static int w, h;
	static int[][] tomato, dis;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static Queue<Point> q = new LinkedList<>();
	
	public void BFS() {
		while(!q.isEmpty()) {
			Point tmp = q.poll(); // 하나 꺼내
			for(int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx >= 0 && nx < h && ny >= 0 && ny < w && tomato[nx][ny] == 0) {
					tomato[nx][ny] = 1;
					q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
				}
				
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		p09_12 T = new p09_12();
		
		w = sc.nextInt(); // 6
		h = sc.nextInt(); // 4
	
		dis = new int[h][w];
		tomato = new int[h][w];
		
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				tomato[i][j] = sc.nextInt(); 
				if(tomato[i][j]==1) q.offer(new Point(i, j)); 
				// 1인거 발견되면 큐에 바로 넣음, 여기서 출발점 던졌기 때문에 BFS의 매개변수는 없는 형태로 정의
			}
		}
		
		T.BFS();
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		// 저장될 때부터 모든 토마토가 익어있는 상태
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(tomato[i][j] == 0) flag = false;
			}
		}
		if(flag) {
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					answer = Math.max(answer, dis[i][j]);
				}
			}
			System.out.print(answer);
		}
		else System.out.print(-1);

		
	}

}
