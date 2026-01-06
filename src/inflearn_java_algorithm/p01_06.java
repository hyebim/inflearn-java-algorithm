package inflearn_java_algorithm;

import java.util.Scanner;

public class p01_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i = 0; i < str.length(); i++) {
			String answer = "";
			if(i == str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
			}
			System.out.print(answer);
		}
		

	}

}
