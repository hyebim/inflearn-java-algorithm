package inflearn_java_algorithm;

import java.util.Scanner;
import java.util.Stack;

public class p05_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Stack<Character> stack = new Stack<>();
		
		int answer = 0; // 막대기 개수
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)=='(') { 
				stack.push('(');
			} else { // ')' 이면 
				stack.pop();
				if(str.charAt(i-1)=='(') answer+=stack.size(); // 레이저
				else answer++; // 막대기의 끝 
			}
		}
		
		System.out.print(answer);

	}

}
