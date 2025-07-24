package Oops_Java;

class BankAccount{ //parent class
	
	String AccountHolder;
	double balance;
	
	void setDetails(String name,double amount) {
		
		AccountHolder = name;
		balance=amount;
		}
	void showDetails() {
		System.out.println("Account Holder Name : " + AccountHolder);
		System.out.println("Balance : Rs."+balance);
	}
}

class SavingsAccount extends BankAccount{ //child class 1
	
	double intrestrate =4.5; //In percentage
			
	void CalculateIntrest() {
		
		double intrest=(balance*intrestrate)/100;
		
		System.out.println("Intrest on Savings: Rs." +intrest);
	}
}

class CurrentAccout extends BankAccount{ //Child class 2
	
	double minbal=5000;
	
	void MinBalance() {
		System.out.println("Rs."+minbal+" is the minimum balance need to maintain in the current account");
	}
}

public class Hierarchical {

	public static void main(String[] args) {

		SavingsAccount sa=new SavingsAccount(); //Created obj for child 1
		
		sa.setDetails("Sakthi",5000); //used child obj to call parent class
		sa.showDetails();
		
		System.out.println("-----Savings Account-----");
		sa.CalculateIntrest();
		
		System.out.println("-----Current Account-----");
		
	//	sa.MinBalance();  //By using the same child 1 obj we can't access child 2. Needs to create a another obj for child 2
		
		CurrentAccout ca=new CurrentAccout(); //created a obj for child 2
		ca.MinBalance();
		ca.setDetails( "Sowndarya", 10000); //By using child 2 obj we can access the parent child.
		ca.showDetails();
		
		
	}

}
