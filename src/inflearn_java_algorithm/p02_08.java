package inflearn_java_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p02_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] arr = new int[num];
		int[] index = new int[num];
		
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt(); // 87 89 92 100 76
		}

		for(int i = 0; i < num; i++) {
			int cnt = 1;
			for(int j = 0; j < num; j++) {
				if(arr[i] < arr[j]) cnt++;
				index[i] = cnt;
			}
		}
		
		for(int i = 0; i < num; i++) {
			System.out.print(index[i] + " ");
		}

	}

}
