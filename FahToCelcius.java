// convert fahrenheit degree to celcius
import java.util.*;
public class FahToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		double celcius;
		double fahrenheit=0.0;
		celcius=(fahrenheit-32.0)-5.0/9.0;
		System.out.println("ENTER THE FAHRENHEIT VALUE:");
		fahrenheit=input.nextDouble();
		
		System.out.printf("THE CELCIUS VALUE OF %10.2f IS %2.2f",fahrenheit,celcius);
	}
}
 