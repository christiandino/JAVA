package curso_programacao;

import entities.Account_2;
import entities.BusinessAccount;
import entities.SavingsAccount;


public class HerencaBanco {

	public static void main(String[] args) {
		
		Account_2 acc = new Account_2(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		Account_2 acc1 = bacc;
		Account_2 acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account_2 acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		

		//BusinessAccount acc5 = (BusinessAccount)acc3;
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account_2 acc6 = new Account_2(1005, "Alex", 1000.0);
		acc6.withDraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account_2 acc7 = new SavingsAccount(1006, "Alex", 1000.0, 0.01);
		acc7.withDraw(200.0);
		System.out.println(acc7.getBalance());
		
		Account_2 acc8 = new BusinessAccount(1007, "Bob", 1000.0, 500.0);
		acc8.withDraw(200.0);
		System.out.println(acc8.getBalance());
		
		
	}

}
