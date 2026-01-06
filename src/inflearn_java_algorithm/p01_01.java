package inflearn_java_algorithm;

import java.util.Scanner;

public class p01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input2 = sc.next();
		
		String input3 = input2.toLowerCase();
		String input4 = input2.toUpperCase();
		
		char c2 = input3.charAt(0);
		char c3 = input4.charAt(0);

		int cnt = 0;
		
		for(int i = 0; i < input1.length(); i++) {
			char c1 = input1.charAt(i); // 문자열 순회
			if(c1 == c2 || c1 == c3) cnt++;
		}
		 
		// forEach문 
//		for(char c : input1.toCharArray()) {
//			if (c == c2) cnt ++;
//		}
		
		System.out.print(cnt);

	}

}
