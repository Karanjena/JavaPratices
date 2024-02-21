package CodingPractice;

import java.util.*;

public class All {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The 1st Number");

		int n = sc.nextInt();
		int sum=0;
		int sq=n*n;
		
		while(sq>0) {
			int d=sq%10;
			sum=sum+d;
			sq=sq/10;
			
		}
		if(sum==0) {
			System.out.println("Nolen");
		}else {
			System.out.println("Not Nolen");
		}
	}
}
