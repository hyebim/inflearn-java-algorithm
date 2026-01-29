package inflearn_java_algorithm;

import java.util.Scanner;

public class p08_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		System.out.print(func(n));

	}
	
	public static int func(int n) {
		if(n==1) return 1;
		else {
			return n * func(n-1);
		}
	}

}
