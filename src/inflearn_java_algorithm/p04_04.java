package inflearn_java_algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class p04_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); // bacaAacba
		String t = sc.next(); // abc
		
		// 우선 ba까지만 넣기
		// t.length()-1만큼만 먼저 세팅하는게 정석
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(int i = 0; i < t.length()-1; i++) {
			char ch = s.charAt(i);
			map1.put(ch, map1.getOrDefault(ch, 0)+1);
		}
	
		// abc 넣기
		HashMap<Character, Integer> map2 = new HashMap<>();
		for(int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			map2.put(ch, map2.getOrDefault(ch, 0)+1);
		}
		
		int cnt = 0;
		int lt = 0;
		for(int rt = t.length()-1; rt < s.length(); rt++) {
			char ch1 = s.charAt(lt); // 빼야할거 
			char ch2 = s.charAt(rt); // 들어가야할거
			map1.put(ch2, map1.getOrDefault(ch2, 0)+1);
			
			if(map1.equals(map2)) cnt++;
			
			map1.put(ch1, map1.get(ch1)-1); 
			// 이렇게 value가 0인 key를 지워줘야 비교가 제대로 됨
			if(map1.get(ch1) == 0) map1.remove(ch1); 
			
			lt++;
			
		}

		System.out.print(cnt);
	}

}
