package inflearn_java_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class p05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n+1][n+1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		int m = sc.nextInt();
		int[] moves = new int[m+1];
		for(int i = 1; i <= m; i++) {
			moves[i] = sc.nextInt();
		}
		
		Stack<Integer> stack = new Stack<>();
		int cnt = 0;
		for(int i = 1; i <= m; i++) { // *moves 배열 크기만큼 돌기
			int index = moves[i];
			int j = 1;
			
			// *해당 열이 전부 0이면 j가 계속 증가해서 배열 범위 벗어날 수 있음
			while(j <= n && board[j][index] == 0) j++; 
			if(j > n) continue; 
			
			stack.push(board[j][index]);
			board[j][index] = 0; // *뽑은 인형 0 처리 
			if(stack.size() >= 2 && stack.peek() == stack.get(stack.size()-2)) { 
				stack.pop();
				stack.pop();
				cnt += 2;
			}
		}
		
		System.out.print(cnt);
		
	}

}
