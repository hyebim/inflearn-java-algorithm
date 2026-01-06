package inflearn_java_algorithm;

import java.util.Scanner;

public class p01_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		str = str.toLowerCase();
		char[] c = str.toCharArray();
		
		int lt = 0;
		int rt = str.length() - 1;
		
		while(lt < rt) {
			if(c[lt] == c[rt]) {
				lt++;
				rt--;
			}
			else {
				System.out.print("NO");
				return;
			}
		}
		System.out.print("YES");
	}

}
