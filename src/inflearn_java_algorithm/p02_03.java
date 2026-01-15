package inflearn_java_algorithm;

import java.util.Scanner;

public class p02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int[] B = new int[n];
		for(int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(A[i] == 1 && B[i] == 3 || A[i] == 2 && B[i] == 1 || A[i] == 3 && B[i] == 2) 
				System.out.println("A");
			else if(B[i] == 1 && A[i] == 3 || B[i] == 2 && A[i] == 1 || B[i] == 3 && A[i] == 2)
				System.out.println("B");
			else 
				System.out.println("D");
		}

	}

}
