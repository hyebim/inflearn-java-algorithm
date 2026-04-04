package inflearn_java_algorithm;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class p05_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //8
		int k = sc.nextInt(); //3
		Queue<Integer> q = new ArrayDeque<>();
		
		for(int i = 1; i <= n; i++) q.offer(i);
		
		int answer = 0;
		while(!q.isEmpty()) {
			for(int i = 1; i < k; i++) 
				q.offer(q.poll());
			q.poll();
			if(q.size()==1) answer=q.poll();
		}
		
		System.out.print(answer);
	}
}
