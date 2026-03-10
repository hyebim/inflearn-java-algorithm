package inflearn_java_algorithm;

import java.util.*;

public class p03_01 {

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

		arr1.addAll(arr2);
		Collections.sort(arr1);
		
		for(int i = 0; i < arr1.size(); i++) {
			System.out.print(arr1.get(i) + " ");
		}
		
		
	}

}
