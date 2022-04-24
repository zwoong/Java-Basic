
public class WhyMethod {
									//매개변수, parameter
	public static void printTowTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		
					 //인자, argument
		printTowTimes("a", "-");		
		// 1억줄
		printTowTimes("a", "*");
		// 1억줄
		printTowTimes("a", "&");
		printTowTimes("b", "!");
		
	}
}
