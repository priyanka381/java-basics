package inheritance;

public class Demotaxation {
	public static void main(String[] args) {
		Income income = new Income();
		Gst gst = new Gst();
		int tax = gst.calculateTax(10000);
		System.out.println("tax is  "+tax);
	}

}
