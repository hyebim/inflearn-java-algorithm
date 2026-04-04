package inflearn_java_algorithm;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class Person{
	int id;
	int priority;
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class p05_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int answer = 0;
		
		int[] arr = new int[n];
		Queue<Person> queue = new ArrayDeque<>();
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			queue.offer(new Person(i, arr[i]));
		}

		while(!queue.isEmpty()) {
			Person tmp = queue.poll();
			for(Person x : queue) {
				if(x.priority>tmp.priority) {
					queue.offer(tmp);
					tmp=null;
					break;
				}
			}
			if(tmp!=null) { // 큐에서 우선순위 가장 높음 -> 진료 가능
				answer++;
				if(tmp.id==m) System.out.print(answer);
			}
		}
		
		
	}


}
