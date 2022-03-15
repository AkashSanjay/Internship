//CREATE A CLASS AS A ACCOUNT FOR DEBIT AND CREDIT
public class qno13part1 {
		private double balance;
		public qno13part1(double initialBalance) {
			if (initialBalance>0.0)balance=initialBalance;
		}
		public void credit(double amount) {
			balance=balance+amount;
		}
		public void debit(double amount) {
			balance=balance-amount;
		}
		public double getBalance()
		{
		return balance;
	}
	}

