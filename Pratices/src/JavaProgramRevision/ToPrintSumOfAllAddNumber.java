package JavaProgramRevision;

import java.util.Scanner;

public class ToPrintSumOfAllAddNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number");
		int a=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=a; i++) {
	        if(i % 2 != 0) {
	            sum = sum + i;
	        }
	      }

		System.out.println(sum);
	}
}	
	