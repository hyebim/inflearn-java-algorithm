package inflearn_java_algorithm;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class p05_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next(); // CBA
		String str2 = sc.next(); // CBDAGE
		String answer = "YES";
		
		Queue<Character> queue = new ArrayDeque<>();
		for(int i = 0; i < str1.length(); i++) 
			queue.offer(str1.charAt(i));
		
		for(char x : str2.toCharArray()) {
			if(queue.contains(x)) {
				if(x!=queue.poll()) answer = "NO"; 
				// 여기서 else문 따로 작성해주지 않아도 queue.poll()은 실행됨
 			}
		}
		if(!queue.isEmpty()) answer = "NO";
		
		System.out.print(answer);

	}

}
