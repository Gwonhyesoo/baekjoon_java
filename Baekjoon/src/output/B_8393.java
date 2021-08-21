package output;

import java.util.Scanner;

public class B_8393 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	int a ; 
	int sum = 0;
	
	a = sc.nextInt();
	
	for (int i=0; i<=a; i++) {
		sum+=i;
	}
		System.out.println(sum);
	}

}
