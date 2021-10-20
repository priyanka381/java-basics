package basics;


public class Student {
	public Student(String string, int i) {
		
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int sum = calc.add(10, 20);
		System.out.println("the sum is--"+sum);
		Student priya = new Student("priyanka",123);
		Student myStudent = new Student("kiran",20);
		Student yourStudent = new Student("ani",45);
		for(int a=0; a<5; a++) {
			int j = a *2;
			int f = a+ 5 *3 +j; 
			System.out.println("the no is="+f);
		}
		throw new NullPointerException();
	

}
}
