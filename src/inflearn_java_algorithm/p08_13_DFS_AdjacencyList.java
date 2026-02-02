package inflearn_java_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class p08_13_DFS_AdjacencyList {
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph; 
	// Integer를 원소로 가질 수 있는 ArrayList 객체를 저장하는 ArrayList  
	// 선언만 한 상태이고 실제로 객체는 생성되지 않은 상태 
	static int[] ch;
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int next : graph.get(v)) { // 각 노드의 인접 리스트들 의미 
				if(ch[next] == 0) {
					ch[next] = 1;
					DFS(next);
					ch[next] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		p08_13_DFS_AdjacencyList T = new p08_13_DFS_AdjacencyList();
		
		n = sc.nextInt(); // 노드 개수
		m = sc.nextInt(); // 간선 개수
		
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>()); 
			// add함수 사용하면 인덱스 0번부터 생김(객체 생성)
		}
		
		ch = new int[n+1];
		
		// 인접 리스트 생성 
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b); // 접근 가능한 인접리스트 추가 
		}
		
		ch[1] = 1;
		T.DFS(1);
		
		System.out.println(answer);
	}

}
