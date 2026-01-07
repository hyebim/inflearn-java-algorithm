package inflearn_java_algorithm;

import java.util.Scanner;

public class p01_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] c = str.toCharArray();
 		int cnt = 1;
 		
		for(int i = 0; i < c.length - 1; i++) {
			if(c[i] != c[i + 1]) {
				System.out.print(c[i]);
				if(cnt > 1) System.out.print(cnt);

				cnt = 1;
			}
			else if(c[i] == c[i + 1]) {
				cnt++;
//				System.out.print(cnt);
			}
		}		
		
		// 마지막 문자 처리 
		if(c[c.length - 2] != c[c.length-1]) { 
			System.out.print(c[c.length - 1]); 
		} else { 
			System.out.print(c[c.length - 1]); 
			System.out.print(cnt);
		}
	}

}
