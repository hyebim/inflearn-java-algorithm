package inflearn_java_algorithm;

import java.util.Scanner;

public class p02_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 4
		int M = sc.nextInt(); // 3
		int arr[][] = new int[M][N];
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// k번의 테스트에서 i, j의 등수 찾기
		int answer = 0;
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				int cnt = 0;
				for(int k = 0; k < M; k++) { // test의 횟수
					int pi = 0;
					int pj = 0;
					// k번의 test에서 i의 등수와 j의 등수 찾기
					for(int s = 0; s < N; s++) { 
						// k번째 시험에서 i학생이 몇 등인지 찾는다
						if(arr[k][s] == i) pi = s;
						if(arr[k][s] == j) pj = s;
					}
					if(pi < pj) cnt++;
				}
				if(cnt == M) {
					answer++;
				}
			}
		}
		System.out.print(answer);
		
	}

}
