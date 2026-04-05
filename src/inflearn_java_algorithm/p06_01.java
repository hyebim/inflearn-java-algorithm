package inflearn_java_algorithm;

import java.util.Scanner;

public class p06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		int tmp;
		for(int i = 0; i < n-1; i++) { // n-1 마지막 원소는 자동으로 자리 잡으므로 n-1 까지만 반복해도 됨
			tmp = arr[i]; // 가장 앞 원소 담음
			
			int minIndex = i; // 매 회차마다 현재 위치로 초기화해야함 
			for(int j = i+1; j < n; j++) { 
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
			
		}
		
		for(int ans : arr) 
			System.out.print(ans + " ");

	}

}
