package Method;


public class E {
	public static void add(int a,int b) {
		System.out.println("A");
	}
	public static void add(int a,String b) {
		System.out.println("B");
	}
	public static void add(double a,int b) {
		System.out.println("c");
	}
	public static void main(String[] args) {
		E.add(12, 20);
		E.add(20.0, 20);
		E.add(12, "Karan");
	}
}
