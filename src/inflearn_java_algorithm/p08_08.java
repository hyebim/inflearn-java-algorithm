package inflearn_java_algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p08_08 {

	int[] dis = {1, -1, 5};
	int[] ch;
	Queue<Integer> Q = new LinkedList<>();
	
	public int BFS(int s, int e) {
		ch = new int[10001];
		ch[s] = 1; // 이미 방문한 수 
		int L = 0;
		Q.offer(s);
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i = 0; i < len; i++) {
				int cur = Q.poll();
//				if(cur == e) return L;
				for(int j = 0; j < 3; j++) {
					int next_cur = cur + dis[j];
					if(cur == e) return L + 1; // Q에 집어넣기 전에 확인하는 게 더 좋음 
					if(next_cur >= 1 && next_cur <= 10000 && ch[next_cur] == 0) {
						ch[next_cur] = 1;
						Q.offer(next_cur);
					}
				}
			}
			L++;
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p08_08 T = new p08_08();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(T.BFS(s, e));

	}

}
