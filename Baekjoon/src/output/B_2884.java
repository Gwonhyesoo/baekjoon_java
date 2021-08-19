package output;

import java.util.Scanner;

public class B_2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int h,m;
		h = sc.nextInt();
		m = sc.nextInt();
		
		if (h==0) {
			if(m>=45) {
				System.out.print(h+" "+(m-45));
			}if(m<45) {
				System.out.print((23)+" "+(m+60-45));
			}
		}if (h!=0) {
			if(m>=45) {
				System.out.print(h+" "+(m-45));
			}if(m<45) {
				System.out.print((h-1)+" "+(m+60-45));
			}
		}

	}

}
