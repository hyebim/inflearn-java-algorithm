package inflearn_java_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

//class Point { 
//	public int x, y;
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}

public class p09_14 {

	static int N, M; 
	static int answer = Integer.MAX_VALUE;
	static ArrayList<Point> home = new ArrayList<>();
	static ArrayList<Point> pizza = new ArrayList<>();
	static int[] comb;

	public void DFS(int L, int s) {
	    if(L == M) {
	        // 선택된 조합 처리
//	        for(int x : comb) System.out.print(x + " ");
//	        System.out.println();
	    	int sum = 0;
			for(int i = 0; i < home.size(); i++) { // 5
				int min = Integer.MAX_VALUE;
				for(int j = 0; j < comb.length; j++) { // 15
					int idx = comb[j]; 
					// 앞에서부터 M개의 피자집맛 선택하면 안되고, 선택된 피자집의 인덱스가 들어가야하기 때문
					min = Math.min(min, Math.abs(home.get(i).x-pizza.get(idx).x) 
							+ Math.abs(home.get(i).y-pizza.get(idx).y));
				}
				sum += min;
			}
			answer = Math.min(answer, sum);
	    } 
	    else {
	        for(int i = s; i < pizza.size(); i++) {
	            comb[L] = i;
	            DFS(L + 1, i + 1);
	        }
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p09_14 T = new p09_14();
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); //4
		M = sc.nextInt(); //4
		comb = new int[M];
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				int tmp = sc.nextInt();
				if(tmp == 1) {
					home.add(new Point(i, j));
				} else if(tmp == 2) {
					pizza.add(new Point(i, j));
				}
			}
		}
		
		T.DFS(0, 0);
		System.out.print(answer);
		
	}

}
