package inflearn_java_algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p10_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[][] people = new int[num][2];
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < 2; j++) {
				people[i][j] = sc.nextInt();
			}
		}
		
		Arrays.sort(people, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o2[0] - o1[0]; // 첫 번째 값 기준 내림차순 
			}
		});
		
		int answer = 0;
		for(int i = num-1; i >= 0; i--) { // num-1
			int j = i-1;
			while(j >= 0) {
				if(people[i][1] > people[j][1]) {
					j--;
				} else {
					break;
				}
			}
//			answer++;
			if(j < 0) answer++;
			
		}
		
		System.out.print(answer);
		
	}
	
	

}
