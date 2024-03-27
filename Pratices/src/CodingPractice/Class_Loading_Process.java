package CodingPractice;

public class Class_Loading_Process {
	static int empid=123;
	static String ename="Karan";
	static double sal=20000.00;
	
	public static void emp_detail() {
		System.out.println("Emp name is"+ ename);
	}
	public static void main(String[] args) {
		Class_Loading_Process.emp_detail();
		System.out.println(Class_Loading_Process.empid);
		System.out.println(Class_Loading_Process.sal);
	}
}
