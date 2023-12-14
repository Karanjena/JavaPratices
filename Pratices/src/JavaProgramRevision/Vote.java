package JavaProgramRevision;

import java.util.Scanner;

public class Vote {


	public static String vote(int age) {
		if(age>18) {
			
			return "Eligible";
		}else {
			return "Not Eligible";
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=sc.nextInt();
		
		System.out.println(vote(age));
	}
}
