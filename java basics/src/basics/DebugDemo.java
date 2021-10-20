package basics;


public class DebugDemo {
	public DebugDemo(String string, int i) {
		
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int sum = calc.add(10, 20);
		System.out.println("the sum is--"+sum);
		DebugDemo priya = new DebugDemo("priyanka",123);
		DebugDemo myStudent = new DebugDemo("kiran",20);
		DebugDemo yourStudent = new DebugDemo("ani",45);
		for(int a=0; a<5; a++) {
			int j = a *2;
			int f = a+ 5 *3 +j; 
			System.out.println("the no is="+f);
		}
		throw new NullPointerException();
	

}
}
