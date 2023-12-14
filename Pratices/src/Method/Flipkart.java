package Method;

public class Flipkart extends Phonepay{
	String product="Watch";
	int cost=2000;
	void cart() {
		System.out.println("Add to cart");
	}
	void Order() {
		System.out.println("Order Successful");
	}
	public static void main(String[] args) {
		Flipkart f=new Flipkart();
		System.out.println(f.product);
		System.out.println(f.cost);
		System.out.println(f.name);
		System.out.println(f.balance);
		f.transfer();
		f.scan();
		f.cart();
		f.Order();
	}
}
