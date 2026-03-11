package inflearn_java_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr1.add(sc.nextInt());
		}
		int k = sc.nextInt();
		ArrayList<Integer> arr2 = new ArrayList<>();
		for(int i = 0; i < k; i++) {
			arr2.add(sc.nextInt());
		}
		
		Collections.sort(arr1);
		Collections.sort(arr2);
		
		int i = 0;
		int j = 0;
		ArrayList<Integer> answer = new ArrayList<>();
		while(i<n && j<k) {
			// Integer는 -128 ~ 127만 캐싱, 이 사이의 값은 캐시된 객체를 재사용
			if(arr1.get(i).equals(arr2.get(j))) { 
				answer.add(arr1.get(i));
				i++;
				j++;
			} else if(arr1.get(i) < arr2.get(j)) { 
				// 투포인터에서는 분기하지 말고 한 번의 조건 체인으로 작성
				i++;
			} else {
				j++;
			}
		}
		
		for(int l = 0; l < answer.size(); l++) {
			System.out.print(answer.get(l) + " ");
		}
	}

}
