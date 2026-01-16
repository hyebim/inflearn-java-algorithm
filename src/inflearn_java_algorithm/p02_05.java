package inflearn_java_algorithm;

import java.util.Scanner;

public class p02_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int answer = 0;
		int[] ch = new int[n+1];
		for(int i = 2; i <= n; i++) {
			if(ch[i] == 0) {
				answer++;
				for(int j = i; j <= n; j=j+i) { // i의 배수씩 증가
					ch[j] = 1;
				}
			}
		}
		System.out.print(answer);

	}

}
