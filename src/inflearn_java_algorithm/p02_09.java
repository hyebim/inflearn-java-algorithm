package inflearn_java_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[][] = new int[num][num];
		int answer = Integer.MIN_VALUE;
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 세로 합
		int max1 = Integer.MIN_VALUE;
		int sum1[] = new int[num];
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				sum1[j] += arr[j][i];
				if(max1 < sum1[j]) max1 = sum1[j];
			}
		}
		answer = Math.max(answer, max1);
		
		// 가로 합
		int max2 = Integer.MIN_VALUE;
		int sum2[] = new int[num];
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				sum2[j] += arr[i][j];
				if(max2 < sum2[j]) max2 = sum2[j];
			}
		}
		answer = Math.max(answer, max2);
		
		// 대각선 합
		int sum3 = 0;
		for(int i = 0; i < num; i++) {
			sum3 += arr[i][i];
		}
		answer = Math.max(answer, sum3);
		
		int sum4 = 0;
		int i = 0;
		int j = num-1;
		while(j >= 0) {
			sum4 += arr[i][j];
			i++;
			j--;
		}
		answer = Math.max(answer, sum4);
		
		System.out.print(answer);
 
	}

}
