package while문;

import java.util.Scanner;

public class B_1110 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	int cnt = 0;
	int temp = n;
	
	
	while(true) {
		cnt++;
		
		int left = temp / 10; //몫 2
		int right = temp % 10; // 나머지 6
		temp = (right*10)+((left+right)%10);
		if(n==temp) {
			break;
			}
		}
	System.out.println(cnt);
	}
}

//26
//2 + 6 = 8
//6 + 8 = 14
//8 + 4 = 12
//4 + 2 = 6
//26