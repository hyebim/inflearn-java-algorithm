package inflearn_java_algorithm;

import java.util.Scanner;

public class p08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		func(n);

	}
	
	public static void func(int n) {
		if(n==0) return ;
		else {
			func(n/2);
			System.out.print(n%2);
		}
	}

}
