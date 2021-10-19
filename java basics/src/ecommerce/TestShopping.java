package ecommerce;

public class TestShopping {
	public static void main(String[] args) {
		
		Customer customerPriya = new Customer();
		customerPriya.walkin();
		Security maxSecurity = new Security();
		maxSecurity.scan(customerPriya);
	}
	

}
