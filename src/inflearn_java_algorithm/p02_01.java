package inflearn_java_algorithm;

import java.util.Scanner;

public class p02_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1] ;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		arr[n] = -1;
		 
		System.out.print(arr[0] + " ");
		for(int i = 0; i < n; i++) {
			if(arr[i] < arr[i + 1]) {
				System.out.print(arr[i + 1] + " ");
			} 
		}
		
		

	}

}
