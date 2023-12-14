package JavaProgramRevision;

import java.util.Scanner;

public class CircumferenceOfaCircle {

	public static double redius(int r) {
		double c=2*1.34*r;
		return c;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radious Number");
		int r=sc.nextInt();
		System.out.println(redius(r));
	}
}
