package inflearn_java_algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p09_05 {

	static int N, M;
	static int[] ch;
	// BFS 여러 번 호출하면 Queue가 초기화 안 돼서 이전 값이 남아 있을 수 있음.
	// 따라서 BFS 안에서 선언.
//	Queue<Integer> Q = new LinkedList<>(); 
	
	public int BFS(int s, int e, int[] dis) { // s=3, e=15
		Queue<Integer> Q = new LinkedList<>();
		ch = new int[10001];
		ch[s] = 1; // 이미 방문한 수 
		int L = 0;
		Q.offer(0); // 시작은 0원
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i = 0; i < len; i++) {
				int cur = Q.poll();
//				if(cur == e) return L;
				for(int j = 0; j < dis.length; j++) {
					int next_cur = cur + dis[j];
					if(next_cur == e) return L + 1; // Q에 집어넣기 전에 확인하는 게 더 좋음 
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
		p09_05 T = new p09_05();
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); // 3
		
		int dis[] = new int[N];
		for(int i = 0; i < N; i++) {
			dis[i] = sc.nextInt();
		}
		
		M = sc.nextInt();
		
		System.out.println(T.BFS(N, M, dis));
	}

}
