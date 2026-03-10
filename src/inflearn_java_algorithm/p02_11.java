package inflearn_java_algorithm;

import java.util.Scanner;

public class p02_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[][] = new int[num+1][6];
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int max = Integer.MIN_VALUE;
		int index = 0;
		for(int i = 1; i <= num; i++) {
			int cnt = 0;
			for(int j = 1; j <= num; j++) {
				for(int k = 1; k <= 5; k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
//			max = Math.max(cnt, max);
			
			// 같은 max가 여러 번 나오면 항상 마지막 학생 선택됨.
			// 문제에서는 가장 작은 번호만 출력하라고 되어있음.
			if(cnt > max) { 
				max = cnt;
				index = i;
			}
		}
		System.out.print(index);
	}

}
