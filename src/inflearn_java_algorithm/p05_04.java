package inflearn_java_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class p05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack<Integer> stack = new Stack<>();
		int answer = Integer.MIN_VALUE;
		for(char c : str.toCharArray()) {
			if(Character.isDigit(c))
				stack.push(c-'0'); // *char형은 '0'해야 숫자형
			else { // 연산자면
				int num2 = stack.pop();
				int num1 = stack.pop();
				
				if(c == '+') answer = num1 + num2;
				else if(c == '-') answer = num1 - num2;
				else if(c == '*') answer = num1 * num2;
				else answer = num1 / num2;
				
				stack.push(answer);
			}
		}
		
		System.out.print(answer);
		
	}

}
