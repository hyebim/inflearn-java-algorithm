package inflearn_java_algorithm;

import java.util.Scanner;

public class p01_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replaceAll("[^A-Za-z]", "").toLowerCase(); // 
		
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
		
		if(str.equals(rev)) System.out.print("YES");
		else System.out.print("NO");
		
		/*
		for(int i = 0; i < len/2; i++) {
			if(Character.isAlphabetic(c[i]) || Character.isDigit(c[i])) { 
				// 이렇게 하면 왼쪽만 조건문 검사하고 오른쪽은 특수문자가 그대로 있게 됨 
				System.out.print(c[i]);
				if(c[i] != c[len - i - 1]) {
					System.out.print("NO");
					return;
				} 
			}
		}
		System.out.println();
		System.out.print("YES");
		*/
		

	}

}
