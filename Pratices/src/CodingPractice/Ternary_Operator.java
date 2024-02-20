package CodingPractice;

public class Ternary_Operator {

	public static void main(String[] args) {
		//Greater
		int a=25;
		int b=30;
		String c=(a>b)?"a is greater":"b is a greater";
		System.out.println(c);
		
		
		//Vote
		int age =28;
		String vote=(age>=18)?"This age is Eligble To Vote "+age:"This age is not  Eligble To Vote "+age;
		System.out.println(vote);
	}
}
