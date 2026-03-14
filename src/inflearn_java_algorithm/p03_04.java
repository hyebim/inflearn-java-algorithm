package inflearn_java_algorithm;

import java.util.Scanner;

public class p03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt = 0;
		int lt = 0;
		int sum = 0;
		
		for(int rt = 0; rt < N; rt++) {
			sum += arr[rt]; 
			if(sum == M) {
				cnt++;
//				lt++;
			} 
			while(sum >= M) {
				sum -= arr[lt]; 
				lt++;
				if(sum == M) cnt++;
			}
			
		}
		
		System.out.print(cnt);

	}

}
