package inflearn_java_algorithm;

import java.util.Scanner;

public class p03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 14
		int k = sc.nextInt(); // 2
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		int lt = 0;
		int answer = Integer.MIN_VALUE;
		int j = 0;
		for(int rt = lt; rt < n; rt++) {
			if(arr[rt]==0) {
//				arr[rt] = 1; 이렇게 직접 바꿀 필요 없음
				cnt++;
			}
			while(cnt > k) { // lt 위치 조정 후 전체 길이 구해야함
				if(arr[lt]==0) {
					cnt--; 
				}
				lt++; // 1이면 lt가 계속 증가해야함(sliding window)
			}
			answer = Math.max(answer, rt-lt+1); // 갱신 위치
		}
		System.out.print(answer);
	}

}
