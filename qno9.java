//print the largest among the 10 integers using counter,number,largest.
import java.util.Scanner;
public class qno9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		int counter=0,number=0,largest=0;
		
		for(counter=0;counter<10;counter++) {
			System.out.printf("Enter the number[%d]",counter+1);
			number=input.nextInt();
			largest=largest>number?largest:number;	
		}
		System.out.printf("largest=%d",largest);

	}

}
