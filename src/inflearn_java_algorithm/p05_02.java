package inflearn_java_algorithm;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class p05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack<Character> stack = new Stack<>();
		boolean flag = true;
		
		for(char c : str.toCharArray()) {
			if(c == '(' || Character.isAlphabetic(c)) {
				stack.push(c);
			} else { // ')' 만났을 때
				if(stack.isEmpty()) {
					flag = false;
					break;
				} else { // stack이 비어있지 않으면
//					while(c!='(') { // c가 계속 같은 값이니까 pop만 하다가 stack empty 남 
					while(stack.peek() != '(') {
						stack.pop();
					}
					stack.pop();
				} 
			}
		}
		
		if(!stack.isEmpty()) flag = false;
		
		for(int i = 0; i < stack.size(); i++) {
			System.out.print(stack.get(i));
		}
	}

}
