//to get two integer and perform addition,difference,product,division
import java.util.Scanner;
public class qno5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int num1=0,num2=0;
		System.out.printf("ENTER THE FIRST INTEGER");
		num1=input.nextInt();
		System.out.printf("ENTER THE SECOND INTEGER");
		num2=input.nextInt();
		
	    System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    System.out.printf("\t sum= %d",num1+num2);
	    System.out.printf("\t product= %d",num1*num2);
	    System.out.printf("\t diffrence= %d",num1-num2);
	    System.out.printf("\t quotient= %d",num1/num2);
	}

}
