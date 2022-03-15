//TO FIND IF THE GIVEN NUMBER IS PRIME OR NOT
package statementsprog;
public class prime {
	public static void main(String[] args) {
		int num=23,i;
		for(i=2;i<num;i++)
		{
			if(num%i ==0)
			{
				System.out.println("\n It is a prime number ");
				
			}
			else
			{
				System.out.println("\n it is not a prime number");
			}
		}
		
	}
	
}
