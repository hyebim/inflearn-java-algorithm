package inflearn_java_algorithm;

import java.util.Scanner;

public class p03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] arr = new int[N];
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
//		for(int i = 0; i < N-2; i++) { 
//			for(int j = 0; j < K; j++) { //3
//				sum[i] += arr[j+i];
//			}
//			max = Math.max(max, sum[i]);
//		}
		
		for(int i = 0; i < K; i++) {
			sum += arr[i];
		}
		max = sum;
		
		// Sliding window
		for(int i = K; i < N; i++) {
			sum += (arr[i] - arr[i-K]);
			max = Math.max(max, sum);
		}

		System.out.print(max);
	}

}
