package CodingPractice;

import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Player");
		int size=sc.nextInt();
		System.out.println("Enter Size of Score");
		int size1=sc.nextInt();
		
		String [] s=new String[size];
		int [] z=new int[size1];
		for(int i=0 ; i<=size-1 ; i++) {
			System.out.println("Enter Player name");
			s[i]=sc.next();
			System.out.println("Enter Player Score");
			z[i]=sc.nextInt();
		}
		
		for(int j=0 ; j<=s.length-1 ; j++) {
			System.out.println(s[j]);
			System.out.println(z[j]);
		}
		System.out.println("******************");
		for(int k=s.length-1 ; k>=0 ; k--) {
			System.out.println(s[k]);
			System.out.println(z[k]);
		}
	} 
}
