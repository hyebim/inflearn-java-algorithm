package inflearn_java_algorithm;

import java.util.Scanner;

public class p09_04 {

	static int[] pm;
	static int M, N;
	
	public void DFS(int L) {
		if(L == M) {
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		} else {
			for(int i = 1; i <= N; i++) {
				pm[L] = i;
				DFS(L + 1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p09_04 T = new p09_04();
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 3
		M = sc.nextInt(); // 2
		pm = new int[M];
		T.DFS(0);
		

	}

}
