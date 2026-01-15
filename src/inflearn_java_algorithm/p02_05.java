package inflearn_java_algorithm;

import java.util.Scanner;

public class p02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			int j = 1;
			while(i == j) {
				if(i % j == 0) {
					cnt++;
				}
				j++;
			}
			if(cnt == 1) {
				answer++;
			}
		}
		
		System.out.print(answer);

	}

}
