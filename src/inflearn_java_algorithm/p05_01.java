package inflearn_java_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class p05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		Stack<Character> stack = new Stack<>();
		boolean flag = true;
		
		// 닫는 괄호가 먼저 나왔을 때도 생각해야함
		for(char c : input.toCharArray()) {
			if(c == '(') {
				stack.push(c);
			} else {
				if(stack.empty()) {
					flag = false;
					break;
				}
				stack.pop();
			}
		}
		
		if(!stack.isEmpty()) flag = false;
		
		if(flag) System.out.print("YES");
		else System.out.print("NO");

	}

}
