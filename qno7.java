// to find arithmetic operations and small /large for three integers
import java.util.Scanner;
public class qno7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int num1=0,num2=0,num3=0,smaller=0,larger=0;
		
		System.out.printf("ENTER THE FIRST INTEGER\n");
		num1=input.nextInt();
		System.out.printf("ENTER THE SECOND INTEGER\n");
		num2=input.nextInt();
		System.out.printf("ENTER THE THIRD INTEGER\n");
		num3=input.nextInt();
		
		larger=num1>num2?num1:num2;
		larger=larger>num3?larger:num3;
		smaller=num1<num2?num1:num2;
		smaller=smaller<num3?smaller:num3;
		
	    System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	    System.out.printf("\t sum= %d",num1+num2+num3);
	    System.out.printf("\t product= %d",num1*num2*num3);
	    System.out.printf("\t Average= %d",(num1+num2+num3)/3);
	    System.out.printf("\t Smaller= %d",smaller);
	    System.out.printf("\t larger= %d",larger);

	}

}
