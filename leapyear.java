//TO FIND LEAP YEAR OR NOT
package statementsprog;

public class leapyear {
	public static void main(String[] args) {
		int year=2000;
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("yes it is a leap year");
				}
			}
		}
	}

}
