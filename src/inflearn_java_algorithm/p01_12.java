package inflearn_java_algorithm;

import java.util.Scanner;

public class p01_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();

		for(int i = 0; i < n; i++) {
			String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			System.out.print((char)num);
			str = str.substring(7);
		}
		
		
	}

}
