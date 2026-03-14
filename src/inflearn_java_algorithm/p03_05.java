package inflearn_java_algorithm;

import java.util.Scanner;

public class p03_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int cnt = 0;
		int lt = 0;
		int sum = 0;
		
		for(int rt = 0; rt < N; rt++) {
			sum += rt; 
			if(sum == N) {
				cnt++;
			} 
			while(sum > N) {
				sum -= lt; 
				lt++;
				if(sum == N) cnt++;
			}
			
		}
		
		System.out.print(cnt);

	}

}
