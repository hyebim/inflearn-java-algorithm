package inflearn_java_algorithm;

import java.util.Scanner;

public class p08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		func(n);

	}
	
	public static void func(int n) {
		if(n == 0) return;
		else {
			func(n-1); // 1 2 3 출력
			System.out.print(n + " ");
//			func(n-1); // 3 2 1 출력
		}
	}

}
