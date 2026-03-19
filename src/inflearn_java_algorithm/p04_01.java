package inflearn_java_algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class p04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		
		HashMap<Character, Integer> map = new HashMap<>();
		for(char x : str.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0)+1); 
			// key값 있으면 해당 value값 가져오고 없으면 0 return
		}
		
		int max = Integer.MIN_VALUE;
		char answer = 0;
		for(char key : map.keySet()) { // 존재하는 key들 다 탐색 
//			System.out.print(x+" "+map.get(x));
			if(map.get(key) > max) {
				max=map.get(key);
				answer=key;
			}
		}
		System.out.print(answer);

	}

}
