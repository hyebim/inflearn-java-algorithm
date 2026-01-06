package inflearn_java_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class p01_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(sc.next());
		}
		
		// get으로 인덱스 하나씩 직접 접근
		char[] ch;
		
		for (int i = 0; i < arr.size(); i++) {
			
//			ch = arr.get(i).toCharArray();
//			StringBuilder sb = new StringBuilder(); // 위치 수정
//			
//			for(int j = ch.length - 1; j >= 0; j--) {
//				sb.append(ch[j]);
//			}
//			arr.set(i, sb.toString());
//			
			// 위 네 줄을.. 한 줄로 줄일 수 있다고 합니다..
			arr.set(i, new StringBuilder(arr.get(i)).reverse().toString());
		    System.out.println(arr.get(i));
		}

	}

}
