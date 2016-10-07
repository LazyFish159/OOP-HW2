import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer");
		int integer = scanner.nextInt();
		System.out.println("Enter a float point number");
		float number = scanner.nextFloat();
		System.out.println("Enter a you name");
		String name = scanner.next();
		
		System.out.printf("Hi %s, the multiplication of %d and %f is %2.2e",name,integer,number,(integer*number));
	}
}
