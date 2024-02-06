package CodingPractice;

import java.util.Scanner;

public class DefineTheCharater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		char ch=sc.next().charAt(0);
		
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
			System.out.println("Given Char is Alphabate"+ch);
		}else {
			System.out.println("Given char is Not Alphabate"+ch);
		}
	}
}
