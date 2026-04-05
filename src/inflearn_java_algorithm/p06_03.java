package inflearn_java_algorithm;

import java.util.Scanner;

public class p06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		// 삽입정렬은 swap을 여러 번 하는 방식이 아니라
		// key랑 비교하면서 큰 값을 한 칸씩 뒤로 밀고, 마지막에 key를 넣는 방식
		for(int i = 1; i < n; i++) {
			int key = arr[i];
			int j;
			
			for(j = i-1; j >= 0; j--) {
				if(key < arr[j]) {
					arr[j+1] = arr[j]; // 큰 값을 뒤로 밀기
				} else break;
			}
			arr[j+1] = key;
		}
		
		for(int ans : arr) 
			System.out.print(ans + " ");

	}

}
