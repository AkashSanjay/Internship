//Display the larger sum between two integers
import java.util.Scanner;
public class qno6 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		int num1=0,num2=0,larger=0;
		System.out.printf("ENTER THE FIRST INTEGER");
		num1=input.nextInt();
		System.out.printf("ENTER THE SECOND INTEGER");
		num2=input.nextInt();
		if(num1>num2)
		{
			larger=num1;
		    System.out.printf("% d is larger",larger);
		}
		else if(num1<num2)
		{
			larger=num2;
			System.out.printf("% d is larger",larger);
		}
		else
		{
			System.out.printf("BOTH THE NUMBERS ARE EQUAL");
		}

	}

}
