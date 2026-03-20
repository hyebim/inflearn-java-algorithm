package inflearn_java_algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class p04_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(char key : str1.toCharArray()) {
			map1.put(key, map1.getOrDefault(key, 0)+1);
		}
		
		for(char key : str2.toCharArray()) {
			if(!map1.containsKey(key) || map1.get(key)==0) {
				System.out.print("NO");
				return;
			}
			map1.put(key, map1.get(key)-1);
		} System.out.print("YES");
		
//		HashMap<Character, Integer> map2 = new HashMap<>();
//		for(char key : str2.toCharArray()) {
//			map2.put(key, map2.getOrDefault(key, 0)+1);
//		}
//
//		if(map1.equals(map2)) {
//		    System.out.print("YES");
//		} else {
//		    System.out.print("NO");
//		}
	}

}
