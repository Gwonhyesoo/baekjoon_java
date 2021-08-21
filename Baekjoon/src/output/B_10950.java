package output;

import java.util.Scanner;

public class B_10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, t ;
		
		t = sc.nextInt();
		
		int[] arr = new int[t];
		
		for (int i=0; i<t; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[i] = a+b;
		}
		
		for (int i=0; i<t; i++) {
			System.out.println(arr[i]);
		}
	}
}
