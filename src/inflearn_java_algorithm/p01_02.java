package inflearn_java_algorithm;

import java.util.Scanner;

public class p01_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
				
			} else {
				sb.append(Character.toUpperCase(c));
			}
		}
		
		System.out.println(sb);
	}

}
