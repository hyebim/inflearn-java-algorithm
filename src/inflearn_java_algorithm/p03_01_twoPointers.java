package inflearn_java_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class p03_01_twoPointers {

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
		
		int i = 0;
		int j = 0;
//		int s = 0;
		ArrayList<Integer> sort = new ArrayList<>();
		while(i<n && j<k) { // 반복문 종료 조건을 뭐라 해야되지
			if(arr1.get(i) < arr2.get(j)) {
				sort.add(arr1.get(i));
				i++;
			} else {
				sort.add(arr2.get(j));
				j++;
			}
//			s++;
		}
		if(n<k) {
			for(int p = j; p < k; p++) {
				sort.add(arr2.get(p));
//				s++;
			}
		} else {
			for(int p = i; p < n; p++) {
				sort.add(arr1.get(p));
//				s++;
			}
		}
		
		for(int x = 0; x < sort.size(); x++) {
			System.out.print(sort.get(x) + " ");
		}
	}

}
