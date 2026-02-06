package inflearn_java_algorithm;

import java.util.Scanner;

public class p09_03 {

	static int N, M;
	static int answer = Integer.MIN_VALUE;
	
	public void DFS(int L, int timeSum, int scoreSum, int[] scores, int[] times) {
		if(timeSum > M) return;
		if(L == N) {
			answer = Math.max(scoreSum, answer);
		} else {
			DFS(L+1, timeSum+times[L], scoreSum+scores[L], scores, times);
			DFS(L+1, timeSum, scoreSum, scores, times);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		p09_03 T = new p09_03();
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); // 5
		M = sc.nextInt(); // 20
		
		int[] scores = new int[N];
		int[] times = new int[N];
		
		for(int i = 0; i < N; i++) {
			scores[i] = sc.nextInt();
			times[i] = sc.nextInt();
		}
		
		T.DFS(0, 0, 0, scores, times);
		System.out.print(answer);
	}

}
