package Method;

public class Cat extends Animal{
	@Override
	void sounds() {
		System.out.println("Cat sounds so cresy");
	}
	public static void main(String[] args) {
		Animal a=new Cat();
		a.sounds();
				
	}

}
