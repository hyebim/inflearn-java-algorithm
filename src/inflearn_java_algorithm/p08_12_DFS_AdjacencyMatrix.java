package inflearn_java_algorithm;

import java.util.Scanner;

public class p08_12_DFS_AdjacencyMatrix {
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;
	public void DFS(int v) {
		if(v == n) answer++;
		else {
			for(int i = 1; i <= n; i++) {
				if(graph[v][i] == 1 && ch[i] == 0) {
					ch[i] =1;
					DFS(i); // 백트래킹 시 이 부분으로 돌아와서 남은 코드 실행 
					ch[i] = 0;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		p08_12_DFS_AdjacencyMatrix T = new p08_12_DFS_AdjacencyMatrix();
		
		n = sc.nextInt(); // 노드 개수
		m = sc.nextInt(); // 간선 개수
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
		

	}

}
