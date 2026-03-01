package inflearn_java_algorithm;

import java.util.Scanner;

public class p09_07 {
	static int N, F;
	static int[][] memo = new int[35][35];
	static int[] b, p, ch;
	boolean flag = false;
	
	// 이항계수
	public int comb(int n, int r) {
		if(r==0 || n==r) return 1;
		else if(r==1) return n;
		if(memo[n][r] != 0) return memo[n][r]; 
		
		memo[n][r] = comb(n-1, r-1) + comb(n-1, r);
		return memo[n][r];
	}
	
	public void DFS(int L, int sum) {
		if(flag) return; // DFS로 더 탐색하지 못하도록 return 
		if(L==N) {
			if(sum == F) {
				for(int i = 0; i < N; i++) {
					System.out.print(p[i] + " ");
					flag = true; // 정답이면 flag를 true로 바꾸고
				}
			} 
		}
		else { // 여기서 순열 만들어야함 
			for(int i = 1; i <= N; i++) {
				if(ch[i] == 0) { 
					ch[i] = 1;
					p[L] = i;
					DFS(L+1, sum+(p[L] * b[L]));
					ch[i] = 0;
				}
			}
		}
	}
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p09_07 T = new p09_07();
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 4
		F = sc.nextInt(); // 16
		
		b = new int[N]; // 이항계수
		p = new int[N]; // 정답값
		ch = new int[N+1]; // 순열이니까 체크배열? 그리고 1부터(인덱스가 아니라 실제 값) 돌아야함
		
		
		for(int i = 0; i < N; i++) {
			b[i] = T.comb(N-1, i);
		}
		
		T.DFS(0, 0);

	}

}
