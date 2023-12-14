package CodingPractice;

public class Circle extends Demo{
	@Override
	public void areaOfCircle() {
		int z=20;
		double c=3.14*z*z;
		System.out.println(c);
		
	
	}
	public static void main(String[] args) {
		Demo d=new Circle();
		d.areaOfCircle();
		Demo d1=new Demo();
		d1.areaOfCircle();
	}

}
