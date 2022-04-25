package ExceptionApp;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
	public static void main(String[] args) {
		try (FileWriter f = new FileWriter("data.txt")) {
			f.write("Hello");			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
