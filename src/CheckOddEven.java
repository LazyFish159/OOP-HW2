import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a integer");
		int integer = scanner.nextInt();
		if(integer%2==1){
		System.out.printf("%d is Odd Number",integer);
		}
		else if(integer==0){
		System.out.printf("X");
		}
		else if(integer%2==0){
		System.out.printf("%d is Even Number",integer);
		}
		
	}
}
