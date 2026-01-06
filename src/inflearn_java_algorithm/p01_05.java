package inflearn_java_algorithm;

import java.util.Scanner;

public class p01_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char[] c = str.toCharArray();
		int lt = 0;
		int rt = c.length - 1;
		
		while(lt < rt) {
			if(!Character.isAlphabetic(c[lt])) lt++;
			else if(!Character.isAlphabetic(c[rt])) rt--;
			else {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
		}	
		
		String answer = String.valueOf(c);
		System.out.print(answer);
		

	}

}
