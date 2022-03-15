//calculate and print product of 3 integers
import java.util.Scanner;
public class Prodof3integer {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int number1;
		int number2;
		int number3;
		
		System.out.println("ENTER THE FIRST NUMBER:");
		number1= input.nextInt();
		
		System.out.println("ENTER THE SECOND NUMBER:");
		number2= input.nextInt();
		
		System.out.println("ENTER THE THIRD NUMBER:");
		number3= input.nextInt();
		
		System.out.printf("The product of three integers is %d:",number1*number2*number3);
		
		
		
	}

}
