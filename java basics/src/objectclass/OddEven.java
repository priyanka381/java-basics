package objectclass;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		System.out.print("Enter the number: ");
		int num = scan.nextInt();  
		findoddeven(num);
		
		
	}

	private static void findoddeven(int number) {
		if(number%4 == 0) {
			System.out.println("is even no");
		}
		else {
			System.out.println("is odd no");
		}
		
	}

}
