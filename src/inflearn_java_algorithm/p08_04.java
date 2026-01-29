package inflearn_java_algorithm;

import java.util.Scanner;

public class p08_04 {
	static int[] fibo; // 메모이제이션 활용
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		fibo = new int[n+1];
		func(n);
		for(int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}
//		for(int i = 1; i <= n; i++) {
//			System.out.print(func(i) + " ");
//		}

	}
	
	public static int func(int n) {
		if(fibo[n] > 0) return fibo[n]; // 메모이제이션 활용해서 시간 복잡도 줄이기
		if(n==1 || n==2) return fibo[n] = 1;
		else {
			return fibo[n] = func(n-1) + func(n-2); // fibo배열에 저장해둠
		}
	}

}
