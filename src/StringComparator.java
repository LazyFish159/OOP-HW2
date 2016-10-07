import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings");
		String str1 = scanner.next();
		String str2 = scanner.next();
		System.out.printf("%s %s\n",str1,str2);
		
		if(str1.equalsIgnoreCase(str2)){
			System.out.println("The two strings are the same.");
		}
		else{
			System.out.println("The two strings are not the same.");
		}
			
	}

}
