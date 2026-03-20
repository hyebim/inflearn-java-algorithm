package inflearn_java_algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class p04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 7
		int K = sc.nextInt(); // 4
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < K-1; i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		
		int lt = 0;
		ArrayList<Integer> answer = new ArrayList<>();
		for(int rt=K-1; rt < N; rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
			answer.add(map.size());
			map.put(arr[lt], map.get(arr[lt])-1);
			if(map.get(arr[lt])==0) map.remove(arr[lt]);
			lt++;
		}
		
		for(int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i) + " ");
		}
		
		// 시간초과
//		for(int lt = 0; lt < N-K+1; lt++) {
//			int rt = lt+K; //
//			HashMap<Integer, Integer> map = new HashMap<>();
//			for(int i = lt; i < rt; i++) {
//				map.put(arr[i], map.getOrDefault(arr[i],0)+1);
//			}
//			System.out.print(map.size() + " ");
//		}

	}

}
