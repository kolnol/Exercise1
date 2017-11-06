import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
	    String name = getInput();
        HelloUser helloUser = new HelloUser(name);
        helloUser.greetUser();
	}

	private static String getInput() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter your name and press enter:");
        
	    return sc.nextLine();
    }
}
