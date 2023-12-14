package Method;

public class Amazon extends Phonepay{
	String product="Shoee";
	int cost=20000;
	void wishlist() {
		System.out.println("Added Wishlist");
	}
	void buy() {
		System.out.println("Buy Successful");
	}
	public static void main(String[] args) {
		Amazon a=new Amazon();
		System.out.println(a.product);
		System.out.println(a.cost);
		System.out.println(a.name);
		System.out.println(a.balance);
		a.transfer();
		a.scan();
		a.wishlist();
		a.buy();
	}
}
