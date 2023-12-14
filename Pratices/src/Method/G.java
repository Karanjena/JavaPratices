package Method;

public class G {
	String name="Karan";
	int age =23;
	
	public static void add() {
		System.out.println("Details");
	}
	public static void main(String[] args) {
		G g=new G();
		System.out.println(g.name);
		System.out.println(g.age);
		g.add();
		
	}
}
