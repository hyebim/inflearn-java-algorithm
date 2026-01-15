package inflearn_java_algorithm;

import java.util.Scanner;

public class p02_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 8
		int[] arr = new int[n + 1] ;
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		arr[n] = -1; // for문 위해 무의미한 값 넣기
		
		int cnt = 1;
		int max = arr[0];
		for(int i = 0; i < n - 1; i++) {
			if(arr[i] < arr[i + 1] && max < arr[i + 1]) {
				max = arr[i + 1];
				cnt++;
			}
		}

		System.out.print(cnt);
	}

}
