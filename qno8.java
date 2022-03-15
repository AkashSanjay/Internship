//read 2 integer and tell if first num is a multiple of second and give result
import java.util.Scanner;
public class qno8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int num1=0,num2=0,k;
		System.out.printf("ENTER THE FIRST INTEGER");
		num1=input.nextInt();
		System.out.printf("ENTER THE SECOND INTEGER");
		num2=input.nextInt();
		
		k=num1%num2;
		if(k==0)
		{
			System.out.printf("%d is a multiple of %d",num1,num2);
		}
		else
		{
			System.out.printf("%d is not a multiple of %d",num1,num2);
		}

	}

}
