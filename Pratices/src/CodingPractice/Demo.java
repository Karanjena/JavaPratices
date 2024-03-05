package CodingPractice;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		int n=125;
		int sum=0;
		int count=0;
		
		while(n>0) {
			n=n/10;
			count++;
		}
		int copy=n;
		while(n>0) {
			int d=n%10;
			int pow=1;
			for(int i=1;i<=count;i++) {
				pow=pow*d;
			}
			sum=sum+pow;
			n=n/10;
		}
		if(copy==sum) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not ArmStrong Number");
		}
	}
}