package inflearn_java_algorithm;

import java.util.Scanner;

public class p09_06 {

	static int[][] memo = new int[100][100];// 메모이제이션 사용 
	static int n, r;
	
	public int func(int n, int r) {
		if(n==r) {
			return 1;
		} else if(r==1) {
			return n; 
		}
		if(memo[n][r] != 0) return memo[n][r]; 
		
		memo[n][r] = func(n-1, r-1) + func(n-1, r);
		return memo[n][r];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p09_06 T = new p09_06();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();
		System.out.print(T.func(n, r));
	}

}
