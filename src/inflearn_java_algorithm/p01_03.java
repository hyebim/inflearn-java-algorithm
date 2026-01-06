package inflearn_java_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p01_03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		String str = arr[0]; // null로 초기화하면 arr[0]이 가장 긴 단어일 때 str이 끝까지 null

		int max = 0; // 이 정의를 for문 안에 넣으면 매번 초기화해서 틀림!
		for(int i = 0; i < arr.length; i++) { // 띄어쓰기+1 실행
			if(max < arr[i].length()) {
				max = arr[i].length();
				str = arr[i];
			} 
		}
		System.out.print(str);
	}
}


