package CodingPractice;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.nextLine();
		s.charAt(0);
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 1;
			char ch = s.charAt(i);
			if (s1.indexOf(ch) == -1) {
				for (int j = i + 1; j < s.length(); j++) {
					char ch1 = s.charAt(j);

					if (ch == ch1) {
						count++;
					}

				}

				System.out.println(ch + "-" + count);

				s1 = s1 + ch;

			}

		}
	}
}
