package inflearn_java_algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p08_14_BFS_ShortestPath_Array {
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph; 
	static int[] ch, dis;
	
	// queue → 노드 번호 → graph에서 인접 리스트 조회 
	public void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		queue.offer(v);
		while(!queue.isEmpty()) {
			int cur = queue.poll();
			for(int next : graph.get(cur)) {
				if(ch[next] == 0) {
					ch[next] = 1;
					queue.offer(next);
					dis[next] = dis[cur] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		p08_14_BFS_ShortestPath_Array T = new p08_14_BFS_ShortestPath_Array();
		
		n = sc.nextInt(); // 노드 개수
		m = sc.nextInt(); // 간선 개수
		
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>()); 
			// add함수 사용하면 인덱스 0번부터 생김(객체 생성)
		}
		
		ch = new int[n+1];
		dis = new int[n+1];
		
		// 인접 리스트 생성 
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b); // 접근 가능한 인접리스트 추가 
		}
		
		T.BFS(1);
		for(int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
		

	}

}
