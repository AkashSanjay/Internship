//CRAETE A CLASS AS ACCOUNT PART2
import java.util.Scanner;
public class qno13part2 {
	public static void main(String[] args) {
		qno13part1 account1= new qno13part1(130.00);
		qno13part1 account2= new qno13part1(65.4);
		
		System.out.printf("ACCOUNT1 BALANCE: %.2f \n",account1.getBalance());
		System.out.printf("ACCOUNT2 BALANCE: %.2f \n",account2.getBalance());
		
		Scanner input= new Scanner(System.in);
		double depositAmount;
		double debitAmount;
		
		System.out.printf("ENTER THE DEPOSIT AMOUNT FOR ACC1:  \n");
		depositAmount= input.nextDouble();
		System.out.printf("%.2f added to account1 balance  \n",depositAmount);
		account1.credit(depositAmount);
		
		System.out.printf("ACCOUNT1 BALANCE: %.2f \n",account1.getBalance());
		System.out.printf("ACCOUNT2 BALANCE: %.2f \n",account2.getBalance());
		
		System.out.printf("ENTER THE DEPOSIT AMOUNT FOR ACC2:  \n");
		depositAmount= input.nextDouble();
		System.out.printf("Adding  %.2f to account2 balance  \n",depositAmount);
		account2.credit(depositAmount);
		
		System.out.printf("ACCOUNT1 BALANCE: %.2f \n",account1.getBalance());
		System.out.printf("ACCOUNT2 BALANCE: %.2f \n",account2.getBalance());
		
		System.out.printf("ENTER THE DEBIT AMOUNT FOR ACC1:  \n");
		debitAmount= input.nextDouble();
		System.out.printf("Subracting  %.2f to account1 balance  \n",debitAmount);
		
		if (account1.getBalance()>=debitAmount) {
			account1.debit(debitAmount);
			System.out.printf("ACCOUNT1 BALANCE: %.2f \n",account1.getBalance());
			System.out.printf("ACCOUNT2 BALANCE: %.2f \n",account2.getBalance());
			}
		else {
			System.out.printf("errror the debit amount has exceeded the account balance\n\n");
		}
		
		System.out.printf("ENTER THE DEBIT AMOUNT FOR ACC2:  \n");
		debitAmount= input.nextDouble();
		System.out.printf("Subracting  %.2f to account2 balance  \n",debitAmount);
		
		if (account2.getBalance()>=debitAmount) {
			account2.debit(debitAmount);
			System.out.printf("ACCOUNT1 BALANCE: %.2f \n",account1.getBalance());
			System.out.printf("ACCOUNT2 BALANCE: %.2f \n",account2.getBalance());
			}
		else {
			System.out.printf("errror the debit amount has exceeded the account balance\n\n");
		}	
	}

}
