package Method;
//Class Loader Processer

public class F {
	static int cost=2000;
	static String name="Thar";
	
	public static void add() {
		System.out.println("Add the Oil");
	}
	
	public static void main(String[] args) {
		System.out.println(F.name);
		System.out.println(F.cost);
		F.add();
	}
}
