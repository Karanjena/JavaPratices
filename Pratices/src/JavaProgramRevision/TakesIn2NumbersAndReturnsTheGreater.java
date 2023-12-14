package JavaProgramRevision;

import java.util.Scanner;

public class TakesIn2NumbersAndReturnsTheGreater {
	public static int grater(int a,int b) {

		if(a<b) {
			return b;
		}else {
			return a;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Numbeer");
		int a=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b=sc.nextInt();
		System.out.println(grater(a,b));
	}
}
