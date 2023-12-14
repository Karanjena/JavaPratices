package JavaProgramRevision;

import java.util.Scanner;

public class ToPrint3NumberAerage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd NUmber");
		int b=sc.nextInt();
		System.out.println("Enter 3rd number");
		int c=sc.nextInt();
		
		System.out.println("Average Number");
		System.out.println((a+b+c)/3);
	}
}
