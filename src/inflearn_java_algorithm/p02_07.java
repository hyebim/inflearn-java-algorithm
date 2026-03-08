package inflearn_java_algorithm;

import java.util.Scanner;

public class p02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num+1];
		int[] score = new int[num+1];
		
		for(int i = 1; i <= num; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(arr[1]==1) score[1] = 1; // 1번 문제가 맞는 경우 
		for(int i = 2 ; i <= num; i++) {
			if(arr[i]==0) score[i] = 0; // 틀리면 0점
			else { // 맞았는데, 
				if(arr[i-1]==0) 
					score[i] = 1;
				else 
					score[i] = score[i-1] + 1;
			}
		}
		
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += score[i];
		}
		
		System.out.print(sum);
	}

}
