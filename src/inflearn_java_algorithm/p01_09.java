package inflearn_java_algorithm;

import java.util.Scanner;

public class p01_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] ch = str.toCharArray();
		
		String answer = "";
		for(int i = 0; i < ch.length; i++) {
			if(Character.isDigit(ch[i])) {
				answer += ch[i];
			}
		}
//		System.out.print(answer); //0208 출력
		
		char[] output = answer.toCharArray(); 
		
		int i = 0;
		int length = 0;
//		while(output[i] != 0) { // 0이 아닐동안 계속 반복 
//			i++;
//			length = i;
//		}

		while (output[i] == '0') {
		    i++;
		    length = i;
		}
//		length = i;

		for(int j = length; j < output.length; j++) {
			System.out.print(output[j]);
		}


	}

}
