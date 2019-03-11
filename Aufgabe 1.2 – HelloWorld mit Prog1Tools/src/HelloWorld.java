import Prog1Tools.IOTools;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("your name");
		String name = IOTools.readLine();
		System.out.println("Hello "+ name);
	}
}
