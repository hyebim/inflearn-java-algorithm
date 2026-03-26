package inflearn_java_algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class p04_05_DFS {

	static int n;
	static int k;
	static int sum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 10
		k = sc.nextInt(); // 3
		
		int[] arr = new int[n];
		int[] output = new int[k];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		combination(0, 0, n, k, arr, output, sum);
		
//		HashMap<Integer, Integer> map = new HashMap<>();
		
	}

	// depth 는 현재 몇 개 뽑았는지, output에 어디에 넣을지 나타내는 인덱스 
	// output 현재까지 뽑은 조합을 저장하는 배열 
	static void combination(int start, int depth, int n, int r, int[] arr, int[] output, int sum) {
		int j = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		// 조합이 완성된 경우
		if(depth == r) {
			System.out.println(Arrays.toString(output) + " " + sum + " " + map);
			map.put(j, sum);
			j++;
			return;
		}
		
		// start 부터 n까지 반복
		for(int i = start; i < n; i++) {
			output[depth] = arr[i];	// 현재 depth를 인덱스로 사용
			combination(i + 1, depth + 1, n, r, arr, output, sum+arr[i]);	// i + 1, depth + 1를 전달
		}
		
	}
	
}
