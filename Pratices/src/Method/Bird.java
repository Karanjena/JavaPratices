package Method;

public class Bird extends Animal{
	@Override
	void sounds() {
		System.out.println("Bird sound so cute");
	}
	public static void main(String[] args) {
		Animal a=new Bird();
		a.sounds();
	}

}
