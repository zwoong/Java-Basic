interface Calculable {
	double PI = 3.141592;
	int sum(int v1, int v2);
}

interface Printable {
	void print();
}

class RealCal implements Calculable, Printable {
	public int sum(int v1, int v2) {
		return v1+v2;
	}

	public void print() {
		System.out.println("This is RealCal!!");
	}
}

class AdvancedPrint implements Printable {
	public void print() {
		System.out.println("This is RealCal!!");
	}
}

public class InterfaceApp {
	public static void main(String[] args) {
		Printable c = new AdvancedPrint();
		c.print();
	}
}









