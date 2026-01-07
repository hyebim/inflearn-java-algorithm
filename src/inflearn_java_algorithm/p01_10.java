package inflearn_java_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class p01_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		String t = sc.next();
		
		char[] c = t.toCharArray();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == c[0]) {
				arr.add(i);
			}
		}
//		System.out.print(arr);
		
		int diff = Integer.MAX_VALUE;
		int[][] arr2 = new int[s.length()][arr.size()];
				
		for(int i = 0; i < s.length(); i++) { // teachermode
			for(int j = 0; j < arr.size(); j++) { // 3
				diff = i - arr.get(j);
				if(diff < 0) {
					diff = -diff;
				}
				arr2[i][j] = diff;
			
//				System.out.print(arr2[i][j] + " ");
			}
//			System.out.println();
		}
		
//		int min = Integer.MAX_VALUE;
		for(int i = 0; i < s.length(); i++) { // teachermode
			int min = Integer.MAX_VALUE;
			for(int j = 0; j < arr.size(); j++) {
				if(arr2[i][j] < min) {
					min = arr2[i][j];
				}
			}
			System.out.print(min + " "); // 
		}
	}

}
