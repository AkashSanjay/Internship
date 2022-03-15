//TO FIND THE GRADE OF A STUDENT USING HIS MARKS
package statementsprog;
import java.util.Scanner;
public class studentgrade {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the makrs to know your grade");
		int average= sc.nextInt();
		
		if(average>=80) {
			System.out.println("your grade is A");
		}
		else if(average>=70 && average<80)
		{
			System.out.println("your grade is b");
		}
		else if (average>=60 && average<70) {
			System.out.println("your grade is c");
		}
		
	}

}
