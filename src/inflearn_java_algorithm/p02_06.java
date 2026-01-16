package inflearn_java_algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class p02_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int[] arr = new int[n];
		int[] rev = new int[n];
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			rev[i] = reverse(arr[i]);
			
			if(isPrime(rev[i])) answer.add(rev[i]);
		}
		
		for(int i : answer) {
			System.out.print(i + " ");
		}
		
		

	}
	
	public static int reverse(int n) {
		int rev = 0;
		while(n > 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
	}
	
	public static boolean isPrime(int n) {
		if(n == 1) return false;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}

}
