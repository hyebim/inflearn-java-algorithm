package inflearn_java_algorithm;

import java.util.Scanner;

public class p09_02 {

	static int C, N = 0;
	static int answer = Integer.MIN_VALUE;
	
	public void DFS(int L, int sum, int[] arr) {
		if(sum > C) return;
		if(L==N) {
			if(sum > answer) {
				answer = sum;
			}
		} else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p09_02 T = new p09_02();
		
		Scanner sc = new Scanner(System.in);
		
		C = sc.nextInt(); // 전체 무게
		N = sc.nextInt(); // 몇 마리 갱얼지
		int arr[] = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		T.DFS(0, 0, arr);
		System.out.print(answer);

	}

}
