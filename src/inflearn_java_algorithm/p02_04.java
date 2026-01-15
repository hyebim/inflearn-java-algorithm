package inflearn_java_algorithm;

import java.util.Scanner;

public class p02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 1;
		for(int i = 0; i < n - 2; i++) {
			arr[i + 2] = arr[i] + arr[i + 1];
		}

		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
