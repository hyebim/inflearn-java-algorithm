package inflearn_java_algorithm;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class p04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 10
		int k = sc.nextInt(); // 3
		
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		 
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				for(int l = j+1; l < n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		
		int cnt = 1;
		int answer = 0;
		boolean exist = false;
		for(int x : Tset) {
			if(cnt==k) {
				answer = x;
				exist = true;
			}
			cnt++;
		}
		
		if(exist) System.out.print(answer);
		else System.out.print(-1);
		
	}

}
